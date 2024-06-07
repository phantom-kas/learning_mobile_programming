package com.example.list_view_demo;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

            private int[] imageDatas={R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5};

    private String[] textDatas = {"Sun Chunlan and Cai Qi Presented with Olympic Order in Gold Bach Announces Honourees.",
            "Win Clean Medals - Anti-Doping Outreach Programme for Beijing 2022.",
            "The Year of Winter Olympics: We are ready to Build a Bright Future.",
            "Yanqing Olympic Village after snow.",
            "Update on Beijing 2022 COVID-19 Prevention and Control(19 February)."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//
//
//
//            return insets;
//        });

        listView = (ListView) findViewById(R.id.list1);
        MyAdapter adapter = new MyAdapter();
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Handle item click event here
                String text = textDatas[position];
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });
    }



    class MyAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return imageDatas.length;
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i,View  view, ViewGroup parent) {
            View v;
            if(view == null){
                v=View.inflate(MainActivity.this, R.layout.list_view_item,null);

            }
            else{
              v=view;
            }
            ImageView iv = (ImageView)v.findViewById(R.id.item_img);
            iv.setImageResource(imageDatas[i]);
            TextView tv = (TextView)v.findViewById(R.id.item_text);
            tv.setText(textDatas[i]);
            return v;
        }
    }
}