package mono.com.huawei.hms.maps;


public class HuaweiMap_OnInfoWindowLongClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInfoWindowLongClick:(Lcom/huawei/hms/maps/model/Marker;)V:GetOnInfoWindowLongClick_Lcom_huawei_hms_maps_model_Marker_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IOnInfoWindowLongClickListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnInfoWindowLongClickListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnInfoWindowLongClickListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnInfoWindowLongClickListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnInfoWindowLongClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnInfoWindowLongClickListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onInfoWindowLongClick (com.huawei.hms.maps.model.Marker p0)
	{
		n_onInfoWindowLongClick (p0);
	}

	private native void n_onInfoWindowLongClick (com.huawei.hms.maps.model.Marker p0);

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
