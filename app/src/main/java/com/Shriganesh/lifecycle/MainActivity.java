package com.Shriganesh.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String tag = "Lifecycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "is in the onCreate() event");
        Toast toast = Toast.makeText(this, "onCreate() event called", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(),"onStart() event called", Toast.LENGTH_SHORT).show();
        Log.d(tag,"is in the onStart() event");
    }

    public void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(),"onCreate() event called", Toast.LENGTH_SHORT).show();
        Log.d(tag, "is in the onResume() event");
    }
    public void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(),"onPause() event called", Toast.LENGTH_SHORT).show();
        Log.d(tag, "is in the onPause() event");
    }

    public void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(),"onRestart() event called", Toast.LENGTH_SHORT).show();
        Log.d(tag, "is in the onRestart() event");
    }

    public void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(),"onStop() event called", Toast.LENGTH_SHORT).show();
        Log.d(tag, "is in the onStop() event");
    }

    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"onDestroy() event called", Toast.LENGTH_SHORT).show();
        Log.d(tag, "is in the onDestroy() event");
    }
}