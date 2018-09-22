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
        Button tinhTong; //tạo biến tính tổng bằng kiểu Button
        EditText edita,editb; // tạo biến edita và aditb để lưu giá trị của số a và b
        TextView txtkq_activity_listener;// tạo biến kết quả
        @SuppressLint({"ResourceType", "WrongViewCast"})
        protected void onCreate(Bundle saveInstanceState) {

            super.onCreate(saveInstanceState);
            setContentView(R.layout.activity_main);
            tinhTong = (Button) findViewById(R.layout.activity_listener); 
            tinhTong.setOnClickListener(this);
             edita = (EditText) findViewById(R.id.nhapsoa); //gán giá trị của ký tự vừa nhập vào adita
             editb = (EditText) findViewById(R.id.nhapsob); //gán giá trị của ký tự vừa nhập vào aditb


        }


    @Override
    public void onClick(View v) {
        int a = Integer.parseInt(edita.getText() + "");//chuyển kiểu từ editText sang interger của số a
        int b = Integer.parseInt(editb.getText() + "");//chuyển kiểu từ editText sang interger của số b
        txtkq_activity_listener = (TextView) findViewById(R.id.txtkq_activity_listener);
        txtkq_activity_listener.setText(a+b +"");
    }


    }

