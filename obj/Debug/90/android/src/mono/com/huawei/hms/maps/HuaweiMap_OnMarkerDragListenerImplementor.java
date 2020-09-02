package mono.com.huawei.hms.maps;


public class HuaweiMap_OnMarkerDragListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMarkerDrag:(Lcom/huawei/hms/maps/model/Marker;)V:GetOnMarkerDrag_Lcom_huawei_hms_maps_model_Marker_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IOnMarkerDragListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"n_onMarkerDragEnd:(Lcom/huawei/hms/maps/model/Marker;)V:GetOnMarkerDragEnd_Lcom_huawei_hms_maps_model_Marker_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IOnMarkerDragListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"n_onMarkerDragStart:(Lcom/huawei/hms/maps/model/Marker;)V:GetOnMarkerDragStart_Lcom_huawei_hms_maps_model_Marker_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IOnMarkerDragListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnMarkerDragListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnMarkerDragListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnMarkerDragListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnMarkerDragListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnMarkerDragListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onMarkerDrag (com.huawei.hms.maps.model.Marker p0)
	{
		n_onMarkerDrag (p0);
	}

	private native void n_onMarkerDrag (com.huawei.hms.maps.model.Marker p0);


	public void onMarkerDragEnd (com.huawei.hms.maps.model.Marker p0)
	{
		n_onMarkerDragEnd (p0);
	}

	private native void n_onMarkerDragEnd (com.huawei.hms.maps.model.Marker p0);


	public void onMarkerDragStart (com.huawei.hms.maps.model.Marker p0)
	{
		n_onMarkerDragStart (p0);
	}

	private native void n_onMarkerDragStart (com.huawei.hms.maps.model.Marker p0);

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
