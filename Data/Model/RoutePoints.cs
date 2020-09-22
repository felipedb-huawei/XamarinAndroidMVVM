using System.Globalization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace HMS_Map_Demo.Data.Model
{
    public partial class RoutePoints
    {
        [JsonProperty("origin")]
        public RoutePoint Origin { get; set; }

        [JsonProperty("destination")]
        public RoutePoint Destination { get; set; }
    }

    public partial class RoutePoint
    {
        [JsonProperty("lng")]
        public double Lng { get; set; }

        [JsonProperty("lat")]
        public double Lat { get; set; }
    }

    public partial class RoutePoints
    {
        public static RoutePoints FromJson(string json) => JsonConvert.DeserializeObject<RoutePoints>(json, HMS_Map_Demo.Data.Model.Converter.Settings);
    }

    public static class Serialize
    {
        public static string ToJson(this RoutePoints self) => JsonConvert.SerializeObject(self, HMS_Map_Demo.Data.Model.Converter.Settings);
    }

    internal static class Converter
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
}