package mono.com.huawei.hms.maps;


public class HuaweiMap_OnCameraIdleListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCameraIdle:()V:GetOnCameraIdleHandler:Com.Huawei.Hms.Maps.HuaweiMap/IOnCameraIdleListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnCameraIdleListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnCameraIdleListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnCameraIdleListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnCameraIdleListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnCameraIdleListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onCameraIdle ()
	{
		n_onCameraIdle ();
	}

	private native void n_onCameraIdle ();

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
