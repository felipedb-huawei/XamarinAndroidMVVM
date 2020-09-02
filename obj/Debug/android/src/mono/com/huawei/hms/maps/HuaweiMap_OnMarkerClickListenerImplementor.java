package mono.com.huawei.hms.maps;


public class HuaweiMap_OnMarkerClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMarkerClick:(Lcom/huawei/hms/maps/model/Marker;)Z:GetOnMarkerClick_Lcom_huawei_hms_maps_model_Marker_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IOnMarkerClickListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnMarkerClickListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnMarkerClickListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnMarkerClickListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnMarkerClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnMarkerClickListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public boolean onMarkerClick (com.huawei.hms.maps.model.Marker p0)
	{
		return n_onMarkerClick (p0);
	}

	private native boolean n_onMarkerClick (com.huawei.hms.maps.model.Marker p0);

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
