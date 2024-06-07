package com.example.weatherdemo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView tvCity,tvWeather,TvTemp,tvWind,tvPm;
    private ImageView ivIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    public void initVIew(){
        tvCity = (TextView) findViewById(R.id.tv_city) ;
        tvWeather = (TextView) findViewById(R.id.tv_weather) ;
        TvTemp= (TextView) findViewById(R.id.tv_temp) ;
        tvWind= (TextView) findViewById(R.id.tv_wind) ;
        tvPm= (TextView) findViewById(R.id.tv_pm) ;
    }
}