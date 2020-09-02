package mono.com.huawei.hms.maps;


public class HuaweiMap_OnCameraMoveListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCameraMove:()V:GetOnCameraMoveHandler:Com.Huawei.Hms.Maps.HuaweiMap/IOnCameraMoveListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnCameraMoveListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnCameraMoveListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnCameraMoveListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnCameraMoveListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnCameraMoveListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onCameraMove ()
	{
		n_onCameraMove ();
	}

	private native void n_onCameraMove ();

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
