package com.example.run;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    Button btn1, btn2, btn3, btn4;
    TextView tv, tv1, tv2, tv3;
    String num1, num2;
    Double result;
    Double result_1;

    private RadioButton female, male;
    private RadioGroup radioGroup;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //setContentView(R.layout.ch04_01);//라디오 박스 예제 **RadioGroup**

/* 입 출력 버튼 예제
        setContentView(R.layout.ch04_10);

        et1 = findViewById(R.id.et1);
        tv2 = findViewById(R.id.tv2);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                tv2.setText(et1.getText().toString());

            }
        });
*/



//      setContentView(R.layout.ch04_16); //글자 폰트 연습



/*
        setContentView(R.layout.ch04_17_18); //XML 속성 설정 연습
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);

        tv1.setText("안녕하세요?");
        tv1.setTextColor(Color.RED);
        tv2.setTextSize(30);
        tv2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);
        tv3.setText("가나다라마바사아자차카타파하가나다라마바사아자차카타파하가나다라마바사아자차카타파하가나다라마바사아자차카타파하");
        tv3.setSingleLine();
*/





         setContentView(R.layout.ch04_19_20);
        et1 = findViewById(R.id.Edit1);
        et2 = (EditText) findViewById(R.id.Edit2);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        tv = findViewById(R.id.TextResult);
        tv1 = findViewById(R.id.TextResult1);

        //더하기

//        btn1.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                num1 = et1.getText().toString().equals("") ? "0" : et1.getText().toString();
//                num2 = et2.getText().toString().equals("") ? "0" : et2.getText().toString();
//
//                result = Double.parseDouble(num1) + Double.parseDouble(num2);
//                tv.setText("계산 결과 : " + result.toString());
//            }
//        });



        btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = et1.getText().toString().equals("") ? "0" : et1.getText().toString();
                num2 = et2.getText().toString().equals("") ? "0" : et2.getText().toString();

                result = Double.parseDouble(num1) + Double.parseDouble(num2);

                tv.setText("계산 결과 : " + result.toString());
                return false;
            }
        });


        //빼기
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();

                if(num1.equals("")){
                    num1="0";
                }
                if(num2.equals("")){
                    num2="0";
                }

                result = Double.parseDouble(num1) - Double.parseDouble(num2);
                tv.setText("계산 결과 : " + result.toString());
            }
        });

        //곱하기
        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                num1 = et1.getText().toString().equals("") ? "0" : et1.getText().toString();
                num2 = et2.getText().toString().equals("") ? "0" : et2.getText().toString();


                result = Double.parseDouble(num1) * Double.parseDouble(num2);
                tv.setText("계산 결과 : " + result.toString());
            }
        });

        //나누기
        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();

                if(num1.equals("")){
                    num1="0";
                }
                if(num2.equals("")){
                    num2="0";
                }

                result = Double.parseDouble(num1) / Double.parseDouble(num2);
                result_1 = (Double.parseDouble(num1) % Double.parseDouble(num2));
                tv.setText("계산 결과 : " + result.toString());
                tv1.setText("나머지 값 : " + result_1.toString());
            }
        });


    }
}