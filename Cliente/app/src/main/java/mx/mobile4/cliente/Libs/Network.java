package mx.mobile4.cliente.Libs;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Carlos on 10/08/2017.
 */

public class Network {

//    public static boolean isNetworkAvaliable(Context ctx) {
//        ConnectivityManager connectivityManager = (ConnectivityManager) ctx
//                .getSystemService(Context.CONNECTIVITY_SERVICE);
//        if ((connectivityManager
//                .getNetworkInfo(ConnectivityManager.TYPE_MOBILE) != null && connectivityManager
//                .getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED)
//                || (connectivityManager
//                .getNetworkInfo(ConnectivityManager.TYPE_WIFI) != null && connectivityManager
//                .getNetworkInfo(ConnectivityManager.TYPE_WIFI)
//                .getState() == NetworkInfo.State.CONNECTED)) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static boolean isNetworkAvailable(Context ctx) {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
