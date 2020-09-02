package mono.com.huawei.hms.maps;


public class HuaweiMap_OnPolygonClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPolygonClick:(Lcom/huawei/hms/maps/model/Polygon;)V:GetOnPolygonClick_Lcom_huawei_hms_maps_model_Polygon_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IOnPolygonClickListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnPolygonClickListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnPolygonClickListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnPolygonClickListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnPolygonClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnPolygonClickListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onPolygonClick (com.huawei.hms.maps.model.Polygon p0)
	{
		n_onPolygonClick (p0);
	}

	private native void n_onPolygonClick (com.huawei.hms.maps.model.Polygon p0);

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
