package mono.com.huawei.hms.maps;


public class HuaweiMap_OnInfoWindowCloseListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInfoWindowClose:(Lcom/huawei/hms/maps/model/Marker;)V:GetOnInfoWindowClose_Lcom_huawei_hms_maps_model_Marker_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IOnInfoWindowCloseListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnInfoWindowCloseListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnInfoWindowCloseListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnInfoWindowCloseListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnInfoWindowCloseListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnInfoWindowCloseListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onInfoWindowClose (com.huawei.hms.maps.model.Marker p0)
	{
		n_onInfoWindowClose (p0);
	}

	private native void n_onInfoWindowClose (com.huawei.hms.maps.model.Marker p0);

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
