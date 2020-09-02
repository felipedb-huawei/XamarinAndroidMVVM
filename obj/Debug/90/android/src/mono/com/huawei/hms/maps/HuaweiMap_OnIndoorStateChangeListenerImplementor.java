package mono.com.huawei.hms.maps;


public class HuaweiMap_OnIndoorStateChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onIndoorBuildingFocused:()V:GetOnIndoorBuildingFocusedHandler:Com.Huawei.Hms.Maps.HuaweiMap/IOnIndoorStateChangeListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"n_onIndoorLevelActivated:(Lcom/huawei/hms/maps/model/IndoorBuilding;)V:GetOnIndoorLevelActivated_Lcom_huawei_hms_maps_model_IndoorBuilding_Handler:Com.Huawei.Hms.Maps.HuaweiMap/IOnIndoorStateChangeListenerInvoker, XHmsMaps-4.0.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Maps.HuaweiMap+IOnIndoorStateChangeListenerImplementor, XHmsMaps-4.0.1.300", HuaweiMap_OnIndoorStateChangeListenerImplementor.class, __md_methods);
	}


	public HuaweiMap_OnIndoorStateChangeListenerImplementor ()
	{
		super ();
		if (getClass () == HuaweiMap_OnIndoorStateChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Maps.HuaweiMap+IOnIndoorStateChangeListenerImplementor, XHmsMaps-4.0.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onIndoorBuildingFocused ()
	{
		n_onIndoorBuildingFocused ();
	}

	private native void n_onIndoorBuildingFocused ();


	public void onIndoorLevelActivated (com.huawei.hms.maps.model.IndoorBuilding p0)
	{
		n_onIndoorLevelActivated (p0);
	}

	private native void n_onIndoorLevelActivated (com.huawei.hms.maps.model.IndoorBuilding p0);

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
