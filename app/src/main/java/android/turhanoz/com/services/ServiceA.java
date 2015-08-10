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
    public int onStartCommand(Intent intent, int flags, int startId) {
        startService(new Intent(ServiceA.this,ServiceB.class));
        return Service.START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {

        Toast.makeText(this, "ServiceA Destroyed", Toast.LENGTH_LONG).show();
    }
}
