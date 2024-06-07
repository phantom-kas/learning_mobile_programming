package com.example.form;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class button extends AppCompatActivity {
protected TextView tv;
private  CheckBox cb1;
private CheckBox cb2;
    protected TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_button);
        tv = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);
        cb1 = (CheckBox) findViewById(R.id.checkBox);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }



    public  void onRadioButtonClick(View v){


        RadioButton rb = (RadioButton) v;
    if(v.getId() == R.id.radioButton){
tv.setText("Your favorite programming language is:" + rb.getText().toString());
    }
    else if(v.getId() == R.id.radioButton2){
        tv.setText("Your favorite programming language is:" + rb.getText().toString());
    }
    }


    public void onCheckboxClick(View v){
        //CheckBox cb = (CheckBox) v;
        String msg = "I like:";
        if(cb1.isChecked()){
            msg += cb1.getText().toString();
        }
        if(cb2.isChecked()){
            msg += cb2.getText().toString();
        }
        tv2.setText(msg);
    }

}