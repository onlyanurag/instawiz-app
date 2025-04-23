package com.instawiz.android;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.instawiz.android.anurag;
import com.instawiz.android.LongClickMenuHandler;
import com.instagram.mainactivity.InstagramMainActivity;

import java.net.URI;

public class KotlinInvoker {
    //In this class are the invocation lines for Instawiz functions.

    public static void setLongClickMenuHandlerKotlin(InstagramMainActivity instagramMainActivity, View v){
        LongClickMenuHandler.Companion.setLongClickMenuHandler(instagramMainActivity, v);
    }

    public static void setCtxKotlin(Application application){
        anurag.Companion.setCtx(application);
    }

    public static void validateUriHostKotlin(URI uri){
        anurag.Companion.validateUriHost(uri);
    }

    public static void hideSeen(){
        if(anurag.Companion.hideSeenDM()){
            return;
        }else{
            Log.i("","mark_thread_seen-");
        }
    }

    public static boolean disableAds(){
        if(anurag.Companion.disableAds()){
            return false;
        }else{
            Log.i("","SponsoredContentController.insertItem");
            return true;
        }
    }

    public static void after_onActivityResultKotlin(Activity activity, int requestCode, int resultCode, Intent data){
        com.instawiz.android.InstagramMainActivity.Companion.after_onActivityResult(activity, requestCode, resultCode, data);
    }

}
