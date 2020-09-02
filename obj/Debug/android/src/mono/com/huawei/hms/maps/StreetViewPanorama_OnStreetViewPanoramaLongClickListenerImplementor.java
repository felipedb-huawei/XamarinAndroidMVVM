package mono.com.huawei.hms.maps;


public class StreetViewPanorama_OnStreetViewPanoramaLongClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStreetViewPanoramaLongClick:(Lcom/huawei/hms/maps/model/StreetViewPanoramaOrientation;)V:GetOnStreetViewPanoramaLongClick_Lcom_huawei_hms_maps_model_StreetViewPanoramaOrientation_Handler:Com.Huawei.Hms.Maps.StreetViewPanorama/IOnStreetViewPanoramaLongClickListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.StreetViewPanorama+IOnStreetViewPanoramaLongClickListenerImplementor, XHmsMaps-4.0.1.300", StreetViewPanorama_OnStreetViewPanoramaLongClickListenerImplementor.class, __md_methods);
	}


	public StreetViewPanorama_OnStreetViewPanoramaLongClickListenerImplementor ()
	{
		super ();
		if (getClass () == StreetViewPanorama_OnStreetViewPanoramaLongClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.StreetViewPanorama+IOnStreetViewPanoramaLongClickListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onStreetViewPanoramaLongClick (com.huawei.hms.maps.model.StreetViewPanoramaOrientation p0)
	{
		n_onStreetViewPanoramaLongClick (p0);
	}

	private native void n_onStreetViewPanoramaLongClick (com.huawei.hms.maps.model.StreetViewPanoramaOrientation p0);

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
