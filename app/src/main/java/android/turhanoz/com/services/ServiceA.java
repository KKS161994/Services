package android.turhanoz.com.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Kartikey on 8/11/2015.
 */
public class ServiceA extends Service {
    public ServiceA() {
        }
    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onCreate() {
        Toast.makeText(this, "The newA Service was Created", Toast.LENGTH_LONG).show();

    }
    @Override
    public void onStart(Intent intent, int startId) {
        // For time consuming an long tasks you can launch a new thread here...
        Toast.makeText(this, " ServiceA Started", Toast.LENGTH_LONG).show();
    startService(new Intent(ServiceA.this,ServiceB.class));
    }
    @Override
    public void onDestroy() {

        Toast.makeText(this, "ServiceA Destroyed", Toast.LENGTH_LONG).show();
    }
}
