package mono.com.huawei.hms.feature.dynamic;


public class OnDelegateCreatedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.feature.dynamic.OnDelegateCreatedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDelegateCreated:(Lcom/huawei/hms/feature/dynamic/LifecycleDelegate;)V:GetOnDelegateCreated_Lcom_huawei_hms_feature_dynamic_LifecycleDelegate_Handler:Com.Huawei.Hms.Feature.Dynamic.IOnDelegateCreatedListenerInvoker, XHmsDynamicApi-1.0.13.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Feature.Dynamic.IOnDelegateCreatedListenerImplementor, XHmsDynamicApi-1.0.13.300", OnDelegateCreatedListenerImplementor.class, __md_methods);
	}


	public OnDelegateCreatedListenerImplementor ()
	{
		super ();
		if (getClass () == OnDelegateCreatedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Feature.Dynamic.IOnDelegateCreatedListenerImplementor, XHmsDynamicApi-1.0.13.300", "", this, new java.lang.Object[] {  });
	}


	public void onDelegateCreated (com.huawei.hms.feature.dynamic.LifecycleDelegate p0)
	{
		n_onDelegateCreated (p0);
	}

	private native void n_onDelegateCreated (com.huawei.hms.feature.dynamic.LifecycleDelegate p0);

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
