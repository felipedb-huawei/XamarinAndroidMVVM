package mono.com.huawei.hms.maps;


public class HuaweiMap_OnMyLocationClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMyLocationClick:(Landroid/location/Location;)V:GetOnMyLocationClick_Landroid_location_Location_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IOnMyLocationClickListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnMyLocationClickListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnMyLocationClickListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnMyLocationClickListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnMyLocationClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnMyLocationClickListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onMyLocationClick (android.location.Location p0)
	{
		n_onMyLocationClick (p0);
	}

	private native void n_onMyLocationClick (android.location.Location p0);

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
