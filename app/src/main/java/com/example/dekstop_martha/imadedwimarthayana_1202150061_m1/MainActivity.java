package com.example.dekstop_martha.imadedwimarthayana_1202150061_m1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //    Deklarasi variabel;
    Button Abnormal, Eatbus;
    EditText makanan, porsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//  Mencari berdasarkan id
        Eatbus = (Button)findViewById(R.id.a);
        Abnormal = (Button)findViewById(R.id.b);
        makanan = (EditText)findViewById(R.id.namamakanan);
        porsi = (EditText)findViewById(R.id.jumlahmakanan);

//  untuk Abnormal
        Abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, Main2Activity.class);
                String tempat = Abnormal.getText().toString();
                pindah.putExtra("makanan", makanan.getText().toString());
                pindah.putExtra("tempat", tempat);
                pindah.putExtra("porsi", porsi.getText().toString());
                startActivity(pindah);

            }
        });

        //untuk eatbus
        Eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,Main2Activity.class);
                String tempat = Eatbus.getText().toString();
                pindah.putExtra("makanan", makanan.getText().toString());

                pindah.putExtra("tempat", tempat);
                pindah.putExtra("porsi", porsi.getText().toString());
                startActivity(pindah);
            }
        });
    }
}