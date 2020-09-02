package mono.com.huawei.hms.maps;


public class HuaweiMap_OnMyLocationButtonClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMyLocationButtonClick:()Z:GetOnMyLocationButtonClickHandler:Com.Huawei.Hms.Maps.HuaweiMap/IOnMyLocationButtonClickListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnMyLocationButtonClickListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnMyLocationButtonClickListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnMyLocationButtonClickListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnMyLocationButtonClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnMyLocationButtonClickListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public boolean onMyLocationButtonClick ()
	{
		return n_onMyLocationButtonClick ();
	}

	private native boolean n_onMyLocationButtonClick ();

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
