using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Android.Content;
using Android.Graphics;
using Android.Support.V4.Content;
using Android.Util;
using Com.Huawei.Hms.Maps;
using Com.Huawei.Hms.Maps.Model;
using Com.Huawei.Hms.Maps.Util;
using HMS_Map_Demo.Data;
using HMS_Map_Demo.Data.Model;
using Javax.Security.Auth;
using Path = HMS_Map_Demo.Data.Model.Path;

namespace HMS_Map_Demo.ViewModels
{
    public class MainViewModel
    {
        public MainViewModel()
        {

        }

        internal void MarkersDemo(HuaweiMap hMap, Context context)
        {
                hMap.Clear();

            LatLng pointMarker = new LatLng(4.70036647106663, -74.10923011678256);

            Marker marker1;
                MarkerOptions marker1Options = new MarkerOptions()
                    .InvokePosition(pointMarker)
                    .InvokeTitle("Marker Title #1")
                    .InvokeSnippet("Marker Desc #1");
                marker1 = hMap.AddMarker(marker1Options);

                Marker marker2;
                MarkerOptions marker2Options = new MarkerOptions()
                    .InvokePosition(new LatLng(4.704653, -74.049435))
                    .InvokeTitle("Marker Title #2")
                    .InvokeSnippet("Marker Desc #2");
                marker2 = hMap.AddMarker(marker2Options);

                CameraUpdate cameraUpdate = CameraUpdateFactory.NewLatLng(pointMarker);
                hMap.AnimateCamera(cameraUpdate);

        }

        internal void ShowRoute(HuaweiMap hMap, Context contex, string api_key)
        {
            hMap.Clear();


            Marker marker1;
            MarkerOptions marker1Options = new MarkerOptions()
                .InvokePosition(new LatLng(4.70036647106663, -74.10923011678256))
                .InvokeTitle("Marker Title #1")
                .InvokeSnippet("Marker Desc #1");
            marker1 = hMap.AddMarker(marker1Options);

            Marker marker2;
            MarkerOptions marker2Options = new MarkerOptions()
                .InvokePosition(new LatLng(4.704653, -74.049435))
                .InvokeTitle("Marker Title #2")
                .InvokeSnippet("Marker Desc #2");
            marker2 = hMap.AddMarker(marker2Options);

            RoutePoints points = new RoutePoints
            {
                Origin = new RoutePoint
                {
                    Lat = marker1.Position.Latitude,
                    Lng = marker1.Position.Longitude
                },

                Destination = new RoutePoint
                {
                    Lat = marker2.Position.Latitude,
                    Lng = marker2.Position.Longitude
                }

            };
            RouteInterface routeInterface = new RouteInterface(api_key, RouteType.DRIVING);
            Task<string> routeTask = routeInterface.FetchRouteAsync(points);
            // Do something here
            DirectionsApiResponse response = DirectionsApiResponse.FromJson(routeTask.Result.ToString());
            Path path = response.Routes.First().Paths.First();
            Polyline polyline1;
            PolylineOptions polyline1Options = new PolylineOptions();
            LatLng Start = new LatLng(path.StartLocation.Lat, path.StartLocation.Lng);
            polyline1Options.Add(Start);
            foreach (Step element in path.Steps)
            {
                LatLng pointStart = new LatLng(element.StartLocation.Lat, element.StartLocation.Lng);
                LatLng pointEnd = new LatLng(element.EndLocation.Lat, element.EndLocation.Lng);
                polyline1Options.Add(pointStart);
                polyline1Options.Add(pointEnd);
            }
            LatLng End = new LatLng(path.EndLocation.Lat, path.EndLocation.Lng);
            polyline1Options.Add(End);
            polyline1Options.InvokeColor(Color.Blue);
            polyline1Options.InvokeWidth(20);
            polyline1Options.InvokeZIndex(1);
            polyline1Options.Visible(false);
            polyline1Options.Clickable(true);
            polyline1 = hMap.AddPolyline(polyline1Options);
        }
    }
}
