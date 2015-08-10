package android.turhanoz.com.services;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Kartikey on 8/11/2015.
 */
public class MainActivityfinal extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.layoutnew);
        stopService(new Intent(MainActivityfinal.this,ServiceA.class));
    }
}
