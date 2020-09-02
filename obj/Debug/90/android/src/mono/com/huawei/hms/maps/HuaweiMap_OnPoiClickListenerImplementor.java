package mono.com.huawei.hms.maps;


public class HuaweiMap_OnPoiClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnPoiClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPoiClick:(Lcom/huawei/hms/maps/model/PointOfInterest;)V:GetOnPoiClick_Lcom_huawei_hms_maps_model_PointOfInterest_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IOnPoiClickListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnPoiClickListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnPoiClickListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnPoiClickListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnPoiClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnPoiClickListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onPoiClick (com.huawei.hms.maps.model.PointOfInterest p0)
	{
		n_onPoiClick (p0);
	}

	private native void n_onPoiClick (com.huawei.hms.maps.model.PointOfInterest p0);

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
