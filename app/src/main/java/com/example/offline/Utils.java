package com.example.offline;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import androidx.core.content.ContextCompat;

/**
 * Class that contains static helpful methods to the system.
 */
public class Utils
{
    /**
     * Checks the state of the device's connection to the internet.
     * @param context The application context
     * @return If the device is connected the the internet
     */
    public static boolean checkConnection(Context context)
    {
        ConnectivityManager cm =
                (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnected();
        return isConnected;
    }
}
