package mono.com.huawei.hms.maps;


public class HuaweiMap_OnPolylineClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPolylineClick:(Lcom/huawei/hms/maps/model/Polyline;)V:GetOnPolylineClick_Lcom_huawei_hms_maps_model_Polyline_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IOnPolylineClickListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnPolylineClickListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnPolylineClickListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnPolylineClickListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnPolylineClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnPolylineClickListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onPolylineClick (com.huawei.hms.maps.model.Polyline p0)
	{
		n_onPolylineClick (p0);
	}

	private native void n_onPolylineClick (com.huawei.hms.maps.model.Polyline p0);

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
