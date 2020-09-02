package mono.com.huawei.hms.maps;


public class HuaweiMap_OnInfoWindowClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInfoWindowClick:(Lcom/huawei/hms/maps/model/Marker;)V:GetOnInfoWindowClick_Lcom_huawei_hms_maps_model_Marker_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IOnInfoWindowClickListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnInfoWindowClickListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnInfoWindowClickListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnInfoWindowClickListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnInfoWindowClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnInfoWindowClickListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onInfoWindowClick (com.huawei.hms.maps.model.Marker p0)
	{
		n_onInfoWindowClick (p0);
	}

	private native void n_onInfoWindowClick (com.huawei.hms.maps.model.Marker p0);

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
