using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;

namespace HMS_Map_Demo.Data.Model
{
    public class DirectionType
    {
        internal string RouteTypeRequest(RouteType type)
        {
            return type.ToString().ToLower();
        }
    }

   public enum RouteType
    {
        WALKING,
        BICYCLING,
        DRIVING
    }
}