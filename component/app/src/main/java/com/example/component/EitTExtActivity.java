package com.example.component;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EitTExtActivity extends AppCompatActivity {
private EditText et;
private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  EdgeToEdge.enable(this);
        setContentView(R.layout.activity_eit_text);
et = (EditText) findViewById(R.id.et_name);

        btn = (Button) findViewById(R.id.btn_send);

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(EitTExtActivity.this,et.getText().toString(),Toast.LENGTH_SHORT).show();
    }
});
    }

    public void clickMe(View v){
        Toast.makeText(EitTExtActivity.this,et.getText().toString(),
        Toast.LENGTH_SHORT).show();
    }
}