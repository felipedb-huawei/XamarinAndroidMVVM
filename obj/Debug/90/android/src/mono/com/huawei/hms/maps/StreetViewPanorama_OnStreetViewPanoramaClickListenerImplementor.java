package mono.com.huawei.hms.maps;


public class StreetViewPanorama_OnStreetViewPanoramaClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStreetViewPanoramaClick:(Lcom/huawei/hms/maps/model/StreetViewPanoramaOrientation;)V:GetOnStreetViewPanoramaClick_Lcom_huawei_hms_maps_model_StreetViewPanoramaOrientation_Handler:Com.Huawei.Hms.Maps.StreetViewPanorama/IOnStreetViewPanoramaClickListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.StreetViewPanorama+IOnStreetViewPanoramaClickListenerImplementor, XHmsMaps-4.0.1.300", StreetViewPanorama_OnStreetViewPanoramaClickListenerImplementor.class, __md_methods);
	}


	public StreetViewPanorama_OnStreetViewPanoramaClickListenerImplementor ()
	{
		super ();
		if (getClass () == StreetViewPanorama_OnStreetViewPanoramaClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.StreetViewPanorama+IOnStreetViewPanoramaClickListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onStreetViewPanoramaClick (com.huawei.hms.maps.model.StreetViewPanoramaOrientation p0)
	{
		n_onStreetViewPanoramaClick (p0);
	}

	private native void n_onStreetViewPanoramaClick (com.huawei.hms.maps.model.StreetViewPanoramaOrientation p0);

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
