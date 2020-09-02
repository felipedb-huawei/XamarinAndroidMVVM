package mono.com.huawei.hms.maps;


public class HuaweiMap_OnCameraMoveStartedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCameraMoveStarted:(I)V:GetOnCameraMoveStarted_IHandler:Com.Huawei.Hms.Maps.HuaweiMap/IOnCameraMoveStartedListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnCameraMoveStartedListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnCameraMoveStartedListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnCameraMoveStartedListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnCameraMoveStartedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnCameraMoveStartedListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onCameraMoveStarted (int p0)
	{
		n_onCameraMoveStarted (p0);
	}

	private native void n_onCameraMoveStarted (int p0);

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
