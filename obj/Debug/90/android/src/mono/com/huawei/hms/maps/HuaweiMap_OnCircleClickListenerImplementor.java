package mono.com.huawei.hms.maps;


public class HuaweiMap_OnCircleClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnCircleClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCircleClick:(Lcom/huawei/hms/maps/model/Circle;)V:GetOnCircleClick_Lcom_huawei_hms_maps_model_Circle_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IOnCircleClickListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnCircleClickListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnCircleClickListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnCircleClickListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnCircleClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnCircleClickListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onCircleClick (com.huawei.hms.maps.model.Circle p0)
	{
		n_onCircleClick (p0);
	}

	private native void n_onCircleClick (com.huawei.hms.maps.model.Circle p0);

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
