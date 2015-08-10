package android.turhanoz.com.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by Kartikey on 8/11/2015.
 */
public class ServiceB extends Service {
    int b=0;
    public ServiceB() {
    }
    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onCreate() {
        Toast.makeText(this, "The new ServiceB was Created", Toast.LENGTH_LONG).show();

    }
    @Override
    public void onStart(Intent intent, int startId) {
        // For time consuming an long tasks you can launch a new thread here...
   b=3;
        Toast.makeText(this, " ServiceB Started", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onDestroy() {

        Toast.makeText(this, "ServiceB Destroyed"+b, Toast.LENGTH_LONG).show();
    }
}