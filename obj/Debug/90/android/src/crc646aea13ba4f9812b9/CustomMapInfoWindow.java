package crc646aea13ba4f9812b9;


public class CustomMapInfoWindow
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getInfoContents:(Lcom/huawei/hms/maps/model/Marker;)Landroid/view/View;:GetGetInfoContents_Lcom_huawei_hms_maps_model_Marker_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IInfoWindowAdapterInvoker, XHmsMaps-4.0.1.300\n" +
			"n_getInfoWindow:(Lcom/huawei/hms/maps/model/Marker;)Landroid/view/View;:GetGetInfoWindow_Lcom_huawei_hms_maps_model_Marker_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IInfoWindowAdapterInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("HMS_Map_Demo.CustomMapInfoWindow, HMS_Map_Demo", CustomMapInfoWindow.class, __md_methods);
	}


	public CustomMapInfoWindow ()
	{
		super ();
		if (getClass () == CustomMapInfoWindow.class)
			mono.android.TypeManager.Activate ("HMS_Map_Demo.CustomMapInfoWindow, HMS_Map_Demo", "", this, new java.lang.Object[] {  });
	}

	public CustomMapInfoWindow (android.app.Activity p0)
	{
		super ();
		if (getClass () == CustomMapInfoWindow.class)
			mono.android.TypeManager.Activate ("HMS_Map_Demo.CustomMapInfoWindow, HMS_Map_Demo", "Android.App.Activity, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public android.view.View getInfoContents (com.huawei.hms.maps.model.Marker p0)
	{
		return n_getInfoContents (p0);
	}

	private native android.view.View n_getInfoContents (com.huawei.hms.maps.model.Marker p0);


	public android.view.View getInfoWindow (com.huawei.hms.maps.model.Marker p0)
	{
		return n_getInfoWindow (p0);
	}

	private native android.view.View n_getInfoWindow (com.huawei.hms.maps.model.Marker p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
