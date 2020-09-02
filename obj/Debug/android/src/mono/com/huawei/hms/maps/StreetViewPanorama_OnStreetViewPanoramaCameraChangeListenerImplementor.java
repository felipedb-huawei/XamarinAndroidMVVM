package mono.com.huawei.hms.maps;


public class StreetViewPanorama_OnStreetViewPanoramaCameraChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStreetViewPanoramaCameraChange:(Lcom/huawei/hms/maps/model/StreetViewPanoramaCamera;)V:GetOnStreetViewPanoramaCameraChange_Lcom_huawei_hms_maps_model_StreetViewPanoramaCamera_Handler:Com.Huawei.Hms.Maps.StreetViewPanorama/IOnStreetViewPanoramaCameraChangeListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.StreetViewPanorama+IOnStreetViewPanoramaCameraChangeListenerImplementor, XHmsMaps-4.0.1.300", StreetViewPanorama_OnStreetViewPanoramaCameraChangeListenerImplementor.class, __md_methods);
	}


	public StreetViewPanorama_OnStreetViewPanoramaCameraChangeListenerImplementor ()
	{
		super ();
		if (getClass () == StreetViewPanorama_OnStreetViewPanoramaCameraChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.StreetViewPanorama+IOnStreetViewPanoramaCameraChangeListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onStreetViewPanoramaCameraChange (com.huawei.hms.maps.model.StreetViewPanoramaCamera p0)
	{
		n_onStreetViewPanoramaCameraChange (p0);
	}

	private native void n_onStreetViewPanoramaCameraChange (com.huawei.hms.maps.model.StreetViewPanoramaCamera p0);

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
