package in.silive.innovacion19;

import android.content.Context;
import android.content.SharedPreferences;
public class PrefUtils {

    public PrefUtils() {
    }

    private static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences("IP_ADDRESS", Context.MODE_PRIVATE);
    }

    public static void storeIpAddress(Context context, String apiKey) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString("IP_ADDRESS", apiKey);
        editor.commit();
    }

    public static String getIpAddress(Context context) {
        return getSharedPreferences(context).getString("IP_ADDRESS", null);
    }
}
