package com.example.lap_trinh_su_kien;

        import android.annotation.SuppressLint;
        import android.app.Activity;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends Activity {

    @SuppressLint("MissingSuperCall")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public void btn_tong2so (View v){
        @SuppressLint("WrongViewCast") EditText editia = (EditText) findViewById(R.id.soa);
        int a = Integer.parseInt(editia.getText() + "");
        @SuppressLint("WrongViewCast") EditText editib = (EditText) findViewById(R.id.sob);
        int b = Integer.parseInt(editia.getText() + "");
        TextView txtkq = (TextView) findViewById(R.id.txtkq);
        txtkq.setText((a + b) + "");
    }
}
