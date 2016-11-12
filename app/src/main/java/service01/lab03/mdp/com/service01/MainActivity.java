package service01.lab03.mdp.com.service01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final String ACT = "Act01 MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(ACT, "Oncreate()");
    }

    // on start service
    public void onSS(View v){
        Intent i = new Intent(this, MyIntentService.class);
        i.putExtra("aCounter",1);
        startService(i);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(ACT,"onDestroy()");
    }
}
