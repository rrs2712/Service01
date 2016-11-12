package service01.lab03.mdp.com.service01;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by rrs27 on 2016-10-27.
 */

public class MyIntentService extends IntentService {

    private final String ACT="Act02 MyIntentService";
    private int aCounter=0;
    public MyIntentService(){
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Bundle bundle = intent.getExtras();
        int plus = bundle.getInt("aCounter");

        try {
            Thread.sleep(5001);
            aCounter = aCounter + plus;
            Log.d(ACT,"Button SS in MainActivity was pressed : " + aCounter + " times so far");
        }catch (Exception e){
            Log.w(ACT,e.toString());
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(ACT,"onCreate()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(ACT,"onDestroy()");
    }
}
