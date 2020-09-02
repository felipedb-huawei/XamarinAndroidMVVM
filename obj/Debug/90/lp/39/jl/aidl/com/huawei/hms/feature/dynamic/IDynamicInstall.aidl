// IDynamicInstall.aidl
package com.huawei.hms.feature.dynamic;

// Declare any non-default types here with import statements
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import android.os.Bundle;

interface IDynamicInstall {

    //非按需安装manifest中记录的HFF splits
    Bundle installHFFSplits(IObjectWrapper context);
}
