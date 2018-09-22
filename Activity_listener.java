package com.example.lap_trinh_su_kien;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Activity_listener extends Activity implements OnClickListener{
        Button tinhTong;
        EditText edita,editb;
        TextView txtkq_activity_listener;
        @SuppressLint({"ResourceType", "WrongViewCast"})
        protected void onCreate(Bundle saveInstanceState) {

            super.onCreate(saveInstanceState);
            setContentView(R.layout.activity_main);
            tinhTong = (Button) findViewById(R.layout.activity_listener);
            tinhTong.setOnClickListener(this);
             edita = (EditText) findViewById(R.id.nhapsoa);
             editb = (EditText) findViewById(R.id.nhapsob);


        }


    @Override
    public void onClick(View v) {
        int a = Integer.parseInt(edita.getText() + "");
        int b = Integer.parseInt(editb.getText() + "");
        txtkq_activity_listener = (TextView) findViewById(R.id.txtkq_activity_listener);
        txtkq_activity_listener.setText(a+b +"");
    }


    }

