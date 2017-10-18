package com.example.admin.basic_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btn1;

    Button btn2;

    Button btn3;

    Button btn4;

    EditText editText1;
    EditText editText2;

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        //editText = (EditText)findViewById(R.id.editText2);
    }
    public void init(){

        btn1 = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        editText1 = (EditText)findViewById(R.id.editText3);
        editText2 = (EditText)findViewById(R.id.editText4);
        tv = (TextView) findViewById(R.id.textView2);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        String A =  editText1.getText().toString();
        String B =  editText2.getText().toString();

        switch (view.getId()){
            case R.id.button:
                int add = Integer.parseInt(A) + Integer.parseInt(B);
                tv.setText(String.valueOf(add));
                break;
            case R.id.button2:
                int sub = Integer.parseInt(A) - Integer.parseInt(B);
               tv.setText(String.valueOf(sub));
                break;
            case R.id.button3:
                int multiply = Integer.parseInt(A) * Integer.parseInt(B);
                tv.setText(String.valueOf(multiply));
                break;



        }

    }
}
