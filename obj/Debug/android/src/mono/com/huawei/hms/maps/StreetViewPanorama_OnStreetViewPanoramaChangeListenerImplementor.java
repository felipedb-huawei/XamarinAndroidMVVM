package mono.com.huawei.hms.maps;


public class StreetViewPanorama_OnStreetViewPanoramaChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStreetViewPanoramaChange:(Lcom/huawei/hms/maps/model/StreetViewPanoramaLocation;)V:GetOnStreetViewPanoramaChange_Lcom_huawei_hms_maps_model_StreetViewPanoramaLocation_Handler:Com.Huawei.Hms.Maps.StreetViewPanorama/IOnStreetViewPanoramaChangeListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.StreetViewPanorama+IOnStreetViewPanoramaChangeListenerImplementor, XHmsMaps-4.0.1.300", StreetViewPanorama_OnStreetViewPanoramaChangeListenerImplementor.class, __md_methods);
	}


	public StreetViewPanorama_OnStreetViewPanoramaChangeListenerImplementor ()
	{
		super ();
		if (getClass () == StreetViewPanorama_OnStreetViewPanoramaChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.StreetViewPanorama+IOnStreetViewPanoramaChangeListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onStreetViewPanoramaChange (com.huawei.hms.maps.model.StreetViewPanoramaLocation p0)
	{
		n_onStreetViewPanoramaChange (p0);
	}

	private native void n_onStreetViewPanoramaChange (com.huawei.hms.maps.model.StreetViewPanoramaLocation p0);

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
