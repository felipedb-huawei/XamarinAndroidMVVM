package mono.com.huawei.hms.maps;


public class HuaweiMap_OnCameraMoveCanceledListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCameraMoveCanceled:()V:GetOnCameraMoveCanceledHandler:Com.Huawei.Hms.Maps.HuaweiMap/IOnCameraMoveCanceledListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnCameraMoveCanceledListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnCameraMoveCanceledListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnCameraMoveCanceledListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnCameraMoveCanceledListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnCameraMoveCanceledListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onCameraMoveCanceled ()
	{
		n_onCameraMoveCanceled ();
	}

	private native void n_onCameraMoveCanceled ();

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
