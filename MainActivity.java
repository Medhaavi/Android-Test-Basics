package com.brillicaservices.studentmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    EditText etx1;
    EditText etx2;
    EditText etx3;
    Button bt1;
    Button bt2;
    Button bt3;
   ArrayList<Student> obj = new ArrayList<Student>();

    class Student
    {
        String name1;
        String course2;
        int fees3;

        public Student(String name1,String course2,int fees3)
        {
            this.name1=name1;
            this.course2=course2;
            this.fees3=fees3;

        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // final ArrayList<Student> obj = new ArrayList<Student>();


        etx1 = (EditText) findViewById(R.id.name);
        etx2 = (EditText) findViewById(R.id.course);
        etx3 = (EditText) findViewById(R.id.fees);
        bt1 = (Button) findViewById(R.id.but_1);
        bt2 = (Button) findViewById(R.id.but_2);
        bt3 = (Button) findViewById(R.id.but_3);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String name1 = String.valueOf(etx1.getText());
                String course2 = String.valueOf(etx2.getText());
                 int fees3 = Integer.parseInt(etx3.getText().toString());

                // int fees3 = 0;
               /* try {

                    fees3 = Integer.parseInt(etx3.getText().toString());


                } catch (NumberFormatException e) {
                    System.out.println("Number error");

                }*/
                Student st = new Student(name1,course2,fees3);

                obj.add(new Student(name1, course2, fees3));
            }




        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(int i=0;i<obj.size();i++)
                {
                    Toast.makeText(getApplicationContext(),"Student name =" +obj.get(i).name1+ "\n Course=" +obj.get(i).course2+ "\n Fees=" +obj.get(i).fees3,Toast.LENGTH_LONG).show();
                }

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent inte = new Intent(MainActivity.this, NextAct.class);
                Bundle b = new Bundle();
                for (int i = 0; i < obj.size(); i++) {
                    b.putString("na_me", String.valueOf(obj.get(i).name1));
                    b.putString("cou_rse", String.valueOf(obj.get(i).course2));
                    b.putInt("fe_es", Integer.valueOf(obj.get(i).fees3));


                }
                inte.putExtras(b);
                startActivity(inte);
            }

        });




    }
}




