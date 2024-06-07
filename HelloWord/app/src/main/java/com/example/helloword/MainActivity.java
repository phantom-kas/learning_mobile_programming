package com.example.helloword;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity","onCreate is running");
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            return insets;
        });







    }
        @Override
        protected void onRestart() {
            super.onRestart();
            Log.i("MainActivity","onRestart is running");

        }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity","onResume is running");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity","onPause is running");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity","onStart is running");

    }

    public void openActivity(View v){
        Intent intent = new Intent(MainActivity.this,activity_second.class);
        startActivity(intent);

    }


    public void sendSMS(View v){
        Intent intent = new Intent(MainActivity.this,activity_second.class);
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("sms:19824331560"));
        startActivity(intent);
    }

    public void openCall(View v){
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},0x11);
        Intent intent =  new Intent();
        intent.setAction(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0552284289"));
        startActivity(intent);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity","onDestroy is running");

    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity","onStop is running");

    }


    public void openHome(View v){
        Intent intent =  new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
    }


}

