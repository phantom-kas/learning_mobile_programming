package com.example.gridd_view_demo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private int[] imgDatas = {
            R.drawable.se_type_hydropower,
            R.drawable.se_type_fruits,
            R.drawable.se_type_daily,
            R.drawable.se_type_makeup
    };
    private String[] txtDatas = {"hydropower", "fruits", "daily", "makeup"};
    private GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Map<String, Object>> data_list = new ArrayList<>();
        for (int i = 0; i < imgDatas.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("image", imgDatas[i]);
            map.put("text", txtDatas[i]);
            data_list.add(map);
        }

        String[] from = {"image", "text"};
        int[] to = {R.id.img, R.id.tv};
        gv = findViewById(R.id.gv);
        SimpleAdapter adapter = new SimpleAdapter(this, data_list, R.layout.item_gv_img, from, to);
        gv.setAdapter(adapter);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, txtDatas[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}