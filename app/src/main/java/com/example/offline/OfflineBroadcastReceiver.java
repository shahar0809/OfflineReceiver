package com.example.offline;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.appcompat.app.AlertDialog;

public class OfflineBroadcastReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(final Context context, final Intent intent)
    {
        // No connection
        if (!Utils.checkConnection(context))
        {
            Intent offline = new Intent(context, OfflineActivity.class);
            context.startActivity(offline);
        }
        // Connected
        else
        {
            Intent offline = new Intent(context, Connected.class);
            context.startActivity(offline);
        }
    }
}
