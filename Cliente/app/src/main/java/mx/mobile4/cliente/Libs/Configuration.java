package mx.mobile4.cliente.Libs;

import android.content.ContentResolver;
import android.provider.Settings;

/**
 * Created by Carlos on 10/08/2017.
 */

public class Configuration {
    public static String getDeviceId(ContentResolver content){
        return Settings.System.getString(content, Settings.Secure.ANDROID_ID);
    }
}
