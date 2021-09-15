package org.soralis_0912.primefix;



import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import android.webkit.WebView;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

/**
 * @author Jecelyin
 */
public class AmazonPrimeHDFix implements IXposedHookZygoteInit,
        IXposedHookLoadPackage {


    @Override
    public void initZygote(StartupParam startupParam) throws Throwable {

    }

    @Override
    public void handleLoadPackage(final LoadPackageParam lpparam)throws Throwable {

        XposedBridge.log("[AmazonPrimeHDFix]");
        
        XposedHelpers.findField(Build.class, "MODEL").set(null, "Mi 10");
        XposedHelpers.findField(Build.class, "PRODUCT").set(null, "umi");
  
    }



}