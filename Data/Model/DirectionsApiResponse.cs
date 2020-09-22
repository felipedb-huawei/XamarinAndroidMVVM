using System;
using System.Collections.Generic;
using System.Globalization;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace HMS_Map_Demo.Data.Model
{
    public partial class DirectionsApiResponse
    {
        [JsonProperty("routes")]
        public Route[] Routes { get; set; }

        [JsonProperty("returnCode")]
        [JsonConverter(typeof(ParseStringConverter))]
        public long ReturnCode { get; set; }

        [JsonProperty("returnDesc")]
        public string ReturnDesc { get; set; }
    }

    public partial class Route
    {
        [JsonProperty("paths")]
        public Path[] Paths { get; set; }

        [JsonProperty("bounds")]
        public Bounds Bounds { get; set; }
    }

    public partial class Bounds
    {
        [JsonProperty("southwest")]
        public Northeast Southwest { get; set; }

        [JsonProperty("northeast")]
        public Northeast Northeast { get; set; }
    }

    public partial class Northeast
    {
        [JsonProperty("lng")]
        public double Lng { get; set; }

        [JsonProperty("lat")]
        public double Lat { get; set; }
    }

    public partial class Path
    {
        [JsonProperty("duration")]
        public long Duration { get; set; }

        [JsonProperty("durationInTraffic")]
        public long DurationInTraffic { get; set; }

        [JsonProperty("distance")]
        public long Distance { get; set; }

        [JsonProperty("startLocation")]
        public Northeast StartLocation { get; set; }

        [JsonProperty("steps")]
        public Step[] Steps { get; set; }

        [JsonProperty("endLocation")]
        public Northeast EndLocation { get; set; }
    }

    public partial class Step
    {
        [JsonProperty("duration")]
        public long Duration { get; set; }

        [JsonProperty("orientation")]
        public long Orientation { get; set; }

        [JsonProperty("distance")]
        public long Distance { get; set; }

        [JsonProperty("startLocation")]
        public Northeast StartLocation { get; set; }

        [JsonProperty("action")]
        public string Action { get; set; }

        [JsonProperty("endLocation")]
        public Northeast EndLocation { get; set; }

        [JsonProperty("polyline")]
        public Northeast[] Polyline { get; set; }

        [JsonProperty("roadName")]
        public string RoadName { get; set; }
    }

    public partial class DirectionsApiResponse
    {
        public static DirectionsApiResponse FromJson(string json)
        {

            string contentCorrected = Regex.Unescape(json);
            return JsonConvert.DeserializeObject<DirectionsApiResponse>(contentCorrected, DirectionsConverter.Settings);
        }
    }

    public static class DirectionsSerialize
    {
        public static string ToJson(this DirectionsApiResponse self) => JsonConvert.SerializeObject(self, DirectionsConverter.Settings);
    }

    internal static class DirectionsConverter
    {
        public static readonly JsonSerializerSettings Settings = new JsonSerializerSettings
        {
            MetadataPropertyHandling = MetadataPropertyHandling.Ignore,
            DateParseHandling = DateParseHandling.None,
            Converters =
            {
                new IsoDateTimeConverter { DateTimeStyles = DateTimeStyles.AssumeUniversal }
            },
        };
    }

    internal class ParseStringConverter : JsonConverter
    {
        public override bool CanConvert(Type t) => t == typeof(long) || t == typeof(long?);

        public override object ReadJson(JsonReader reader, Type t, object existingValue, JsonSerializer serializer)
        {
            if (reader.TokenType == JsonToken.Null) return null;
            var value = serializer.Deserialize<string>(reader);
            long l;
            if (Int64.TryParse(value, out l))
            {
                return l;
            }
            throw new Exception("Cannot unmarshal type long");
        }

        public override void WriteJson(JsonWriter writer, object untypedValue, JsonSerializer serializer)
        {
            if (untypedValue == null)
            {
                serializer.Serialize(writer, null);
                return;
            }
            var value = (long)untypedValue;
            serializer.Serialize(writer, value.ToString());
            return;
        }

        public static readonly ParseStringConverter Singleton = new ParseStringConverter();
    }
}