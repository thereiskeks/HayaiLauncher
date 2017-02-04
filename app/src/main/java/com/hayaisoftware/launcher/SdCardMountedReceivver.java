package com.hayaisoftware.launcher;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;

import com.hayaisoftware.launcher.activities.SearchActivity;

/**
 * Created by thereiskeks on 04.02.2017.
 */

public class SdCardMountedReceivver extends BroadcastReceiver {

    SearchActivity callback;
    public SdCardMountedReceivver(SearchActivity callback)
    {
        this.callback = callback;
    }
    public void onReceive(Context context, Intent intent) {
        Log.e("Received thing","sd card is mounted");
        Log.e("Received thing","sd card is mounted");
        Log.e("Received thing","sd card is mounted");
        Log.e("Received thing","sd card is mounted");
        Log.e("Received thing","sd card is mounted");
        Log.e("Received thing","sd card is mounted");
        Log.e("Received thing","sd card is mounted");
        Log.e("Received thing","sd card is mounted");
        Log.e("Received thing","sd card is mounted");
        callback.loadLaunchableApps();
    }

}
