package com.brillicaservices.studentmanagementsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextAct extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        tv1=(TextView)findViewById(R.id.tex1);
        tv2=(TextView)findViewById(R.id.tex2);
        tv3=(TextView)findViewById(R.id.tex3);


        Bundle b= getIntent().getExtras();

        String n = b.getString("na_me");
        String c=b.getString("cou_rse");
        Integer f =b.getInt("fe_es");


        tv1.setText("Hello :" +n);
        tv2.setText("Your pursued course is :"+c);
        tv3.setText("Your fees is :" +f);


    }
}
