package sg.edu.rp.c346.practicalquiz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

public class MessageReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast my_toast = Toast.makeText(context, "You have changed the wallpaper", Toast.LENGTH_LONG);
        my_toast.show();

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        int id = preferences.getInt("id", R.id.radioButton3);
        if(id == R.id.radioButton3){
            Toast.makeText(context, R.string.button1, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, R.string.button2, Toast.LENGTH_LONG).show();
        }
    }
}
