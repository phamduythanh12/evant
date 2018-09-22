package com.example.lap_trinh_su_kien;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class anonymous_listener extends Activity {
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        Button tinhTong = (Button) findViewById(R.id.btntong2so);
        tinhTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                @SuppressLint("WrongViewCast") EditText editia = (EditText) findViewById(R.id.soa);
                int a = Integer.parseInt(editia.getText() + "");
                @SuppressLint("WrongViewCast") EditText editib = (EditText) findViewById(R.id.sob);
                int b = Integer.parseInt(editia.getText() + "");
                TextView txtkq = (TextView) findViewById(R.id.txtkq_anymous_listener);
                txtkq.setText((a + b) + "");
            }
        });
    }
}
