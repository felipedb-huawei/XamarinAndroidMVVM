package mono.com.huawei.hms.maps;


public class HuaweiMap_OnGroundOverlayClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGroundOverlayClick:(Lcom/huawei/hms/maps/model/GroundOverlay;)V:GetOnGroundOverlayClick_Lcom_huawei_hms_maps_model_GroundOverlay_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IOnGroundOverlayClickListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnGroundOverlayClickListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnGroundOverlayClickListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnGroundOverlayClickListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnGroundOverlayClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnGroundOverlayClickListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onGroundOverlayClick (com.huawei.hms.maps.model.GroundOverlay p0)
	{
		n_onGroundOverlayClick (p0);
	}

	private native void n_onGroundOverlayClick (com.huawei.hms.maps.model.GroundOverlay p0);

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
