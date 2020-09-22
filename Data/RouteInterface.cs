using HMS_Map_Demo.Data.Model;
using System;
using System.IO;
using System.Net;
using System.Net.Http;
using System.Threading.Tasks;

namespace HMS_Map_Demo.Data
{

    public class RouteInterface
    {

        static string baseURL = "https://mapapi.cloud.huawei.com/mapApi/v1/routeService/";
        string directionsType = "";
        string key = "";
        string baseApiKEY = "?key=";
        public RouteInterface(string appKey, RouteType type)
        {
            key = appKey;
            DirectionType directionType = new DirectionType();
            directionsType = directionType.RouteTypeRequest(type);
        }

        public async Task<string> FetchRouteAsync(RoutePoints points)
        {
            string encodedKey = Uri.EscapeDataString(key);
            Uri url = new Uri(baseURL + directionsType + baseApiKEY + encodedKey);
            // Create an HTTP web request using the URL:
            HttpWebRequest request = (HttpWebRequest)HttpWebRequest.Create(url);
            request.ContentType = "application/json";
            request.Method = "POST";

            using (var streamWriter = new StreamWriter(request.GetRequestStream()))
            {
                string json = Serialize.ToJson(points);
                streamWriter.Write(json);
            }

            // Send the request to the server and wait for the response:
            var httpResponse = (HttpWebResponse)request.GetResponse();
            using (var streamReader = new StreamReader(httpResponse.GetResponseStream()))
            {
                var result = streamReader.ReadToEnd();
                return result;
            }
        }
    }
}