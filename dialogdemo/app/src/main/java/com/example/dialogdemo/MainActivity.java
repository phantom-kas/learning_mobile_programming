package com.example.dialogdemo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
 private String[]  txtDatas = {"Big","Medium","Small"};
 private int[]  sizeDatas = {40,20,10} ;
 private Button button;
 private TextView tv;
 private int selectedSize;
    private AlertDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      //  EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button = (android.widget.Button) findViewById(R.id.button2);
        tv = (android.widget.TextView) findViewById(R.id.textView);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("AlerDialog").setMessage("Would you like to log out?").setPositiveButton("Yes",null).setNegativeButton("No",null);

        this.dialog = builder.create();



    }

public void openSingleCoiceDialog(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Pick a text size").setSingleChoiceItems(txtDatas, 1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
selectedSize = i;
            }
        }).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                tv.setTextSize(sizeDatas[selectedSize]);
            }
        }) .setNegativeButton("No",null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void showDialog(View view) {
        this.dialog.show();
    }
}