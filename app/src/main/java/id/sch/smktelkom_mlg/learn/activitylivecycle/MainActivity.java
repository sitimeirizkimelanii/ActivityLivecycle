package id.sch.smktelkom_mlg.learn.activitylivecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "LivecycleTag";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(TAG, "onCreate: ");
    }

    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");

    }

    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");

    }

    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");

    }
}
