package com.example.baitapvenha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Hàm xử lý
    void Xuly_Cong(View v){
        EditText dk_soA = (EditText) findViewById(R.id.edtA);
        int soA = Integer.parseInt(dk_soA.getText().toString());
        EditText dk_soB = (EditText) findViewById(R.id.edtB);
        int soB = Integer.parseInt(dk_soB.getText().toString());
        int KetQua = soA + soB;
        TextView dk_KQ = (TextView) findViewById(R.id.tvResult);
        dk_KQ.setText(String.valueOf(KetQua));
    }
    void Xuly_Tru(View v){
        EditText dk_soA = (EditText) findViewById(R.id.edtA);
        int soA = Integer.parseInt(dk_soA.getText().toString());
        EditText dk_soB = (EditText) findViewById(R.id.edtB);
        int soB = Integer.parseInt(dk_soB.getText().toString());
        int KetQua = soA - soB;
        TextView dk_KQ = (TextView) findViewById(R.id.tvResult);
        dk_KQ.setText(String.valueOf(KetQua));
    }
    void Xuly_Nhan(View v){
        EditText dk_soA = (EditText) findViewById(R.id.edtA);
        int soA = Integer.parseInt(dk_soA.getText().toString());
        EditText dk_soB = (EditText) findViewById(R.id.edtB);
        int soB = Integer.parseInt(dk_soB.getText().toString());
        int KetQua = soA * soB;
        TextView dk_KQ = (TextView) findViewById(R.id.tvResult);
        dk_KQ.setText(String.valueOf(KetQua));
    }
    void Xuly_Chia(View v){
        EditText dk_soA = (EditText) findViewById(R.id.edtA);
        int soA = Integer.parseInt(dk_soA.getText().toString());
        EditText dk_soB = (EditText) findViewById(R.id.edtB);
        int soB = Integer.parseInt(dk_soB.getText().toString());
        int KetQua = soA / soB;
        TextView dk_KQ = (TextView) findViewById(R.id.tvResult);
        dk_KQ.setText(String.valueOf(KetQua));
    }
}