package com.example.ambar.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;

    Button  button1, button2, button3, button4, button5, button6,button7, button8, button9,
            buttonAdd, buttonSubs, buttonMul, buttonDiv, buttonEquals, buttonC, button10, button11,
            buttonMod;

    float mValueOne , mValueTwo ;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision,mModulus ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSubs = (Button) findViewById(R.id.buttonSubs);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonEquals = (Button) findViewById(R.id.buttonEquals);
        buttonC = (Button) findViewById(R.id.buttonC);

        buttonMod = (Button) findViewById(R.id.buttonMod);
        result = (TextView) findViewById(R.id.result);



        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText(result.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText(result.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText(result.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText(result.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText(result.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText(result.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText(result.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText(result.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText(result.getText()+"9");
            }
        });

        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText(result.getText()+"0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(result == null){
                    result.setText("");
                }else{
                    mValueOne = Float.parseFloat(result.getText() + "");
                    mAddition = true;
                    result.setText(null);
                }
            }
        });

        buttonSubs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(result == null){
                    result.setText("");
                }else{
                    mValueOne = Float.parseFloat(result.getText() + "");
                    mSubtract = true;
                    result.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(result == null) {
                    result.setText("");
                }else{
                    mValueOne = Float.parseFloat(result.getText() + "");
                    mMultiplication = true;
                    result.setText(null);
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(result == null){
                    result.setText("");
                }else{
                    mValueOne = Float.parseFloat(result.getText() + "");
                    mDivision = true;
                    result.setText(null);
                }
            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(result == null){
                    result.setText("");
                }else{
                    mValueOne = Float.parseFloat(result.getText() + "");
                    mModulus = true;
                    result.setText(null);
                }
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mValueTwo = Float.parseFloat(result.getText() + "");

                if(mAddition == true){
                    result.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }

                if(mSubtract == true){
                    result.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if(mMultiplication == true){
                    result.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if(mDivision == true){
                    result.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }

                if(mModulus == true){
                    result.setText(mValueOne % mValueTwo + "");
                    mModulus = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText("");
            }
        });

        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText(result.getText() + ".");
            }
        });


    }
}
