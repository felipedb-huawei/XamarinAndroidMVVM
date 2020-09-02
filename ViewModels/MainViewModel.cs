using System;
using Android.Content;
using Android.Graphics;
using Android.Support.V4.Content;
using Com.Huawei.Hms.Maps;
using Com.Huawei.Hms.Maps.Model;
using Com.Huawei.Hms.Maps.Util;

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

                Marker marker1;
                MarkerOptions marker1Options = new MarkerOptions()
                    .InvokePosition(new LatLng(41.0083, 28.9784))
                    .InvokeTitle("Marker Title #1")
                    .InvokeSnippet("Marker Desc #1");
                marker1 = hMap.AddMarker(marker1Options);

                Marker marker2;
                MarkerOptions marker2Options = new MarkerOptions()
                    .InvokePosition(new LatLng(41.022231, 29.008118))
                    .InvokeTitle("Marker Title #2")
                    .InvokeSnippet("Marker Desc #2");
                marker2 = hMap.AddMarker(marker2Options);

                Marker marker3;
                MarkerOptions marker3Options = new MarkerOptions()
                    .InvokePosition(new LatLng(41.005784, 28.997364))
                    .InvokeTitle("Marker Title #3")
                    .InvokeSnippet("Marker Desc #3");
                Bitmap bitmap1 = ResourceBitmapDescriptor.DrawableToBitmap(context, ContextCompat.GetDrawable(context, Resource.Drawable.markerblue));
                marker3Options.InvokeIcon(BitmapDescriptorFactory.FromBitmap(bitmap1));
                marker3 = hMap.AddMarker(marker3Options);

                Marker marker4;
                MarkerOptions marker4Options = new MarkerOptions()
                    .InvokePosition(new LatLng(41.028435, 28.988186))
                    .InvokeTitle("Marker Title #4")
                    .InvokeSnippet("Marker Desc #4")
                    .Anchor(0.9F, 0.9F)
                    .Draggable(true);
                Bitmap bitmap2 = ResourceBitmapDescriptor.DrawableToBitmap(context, ContextCompat.GetDrawable(context, Resource.Drawable.marker));
                marker4Options.InvokeIcon(BitmapDescriptorFactory.FromBitmap(bitmap2));
                marker4 = hMap.AddMarker(marker4Options);

        }
    }
}
