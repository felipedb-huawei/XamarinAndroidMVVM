package mono.com.huawei.hms.maps;


public class HuaweiMap_OnMapClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnMapClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMapClick:(Lcom/huawei/hms/maps/model/LatLng;)V:GetOnMapClick_Lcom_huawei_hms_maps_model_LatLng_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IOnMapClickListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnMapClickListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnMapClickListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnMapClickListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnMapClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnMapClickListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onMapClick (com.huawei.hms.maps.model.LatLng p0)
	{
		n_onMapClick (p0);
	}

	private native void n_onMapClick (com.huawei.hms.maps.model.LatLng p0);

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
