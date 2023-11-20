package com.example.de;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button HADD;
    Button FADD;
    EditText ABIT;
    EditText BBIT;
    TextView ANS;
    int a ;
    int b;
    int hsum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HADD = findViewById(R.id.FADD);
        FADD = findViewById(R.id.HADD);
        ANS = findViewById(R.id.ANS);
        ABIT = findViewById(R.id.ABIT);
        BBIT = findViewById(R.id.BBIT);
        HADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(ABIT.getText().toString().equals("")){
                Toast.makeText(MainActivity.this, "ENTER A BIT VALUE", Toast.LENGTH_SHORT).show();
            }else {
               a = Integer.parseInt(ABIT.getText().toString());
            }
                if(BBIT.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "ENTER B BIT VALUE", Toast.LENGTH_SHORT).show();
                }else {
                    b = Integer.parseInt(BBIT.getText().toString());
                }
                hsum = Hadd(a , b);
                ANS.setText("sum is"  + hsum);


            }
        });

        FADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ABIT.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "ENTER A BIT VALUE", Toast.LENGTH_SHORT).show();
                }else {
                    a = Integer.parseInt(ABIT.getText().toString());
                }

                if(BBIT.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "ENTER B BIT VALUE", Toast.LENGTH_SHORT).show();
                }else {
                    b = Integer.parseInt(BBIT.getText().toString());
                }




            }
        });



    }
    public int Fadd(int a , int b) {
        return 0;
    }

    public int  Hadd(int x , int y) {
        int z;
        if ( x == y  ) {
             z = x;
        } else {
            z = -1;
        }
        if (z ==1 || z==0) {
            return 0;
        } else {
            return 1;
        }
        //return 0;
    }
}