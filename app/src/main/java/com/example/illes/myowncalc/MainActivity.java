package com.example.illes.myowncalc;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9,
            btDot, btAdd, btSub, btMul, btDiv, btEqual;
    TextView tvDisplay;
    Float value1, value2;
    Boolean btAddPressed,btSubPressed,btMulPressed,btDivPressed, dotPressed, btAnyOfAddSubMulDivPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt0 = (Button) findViewById(R.id.bt0);
        Button bt1 = (Button) findViewById(R.id.bt1);
        Button bt2 = (Button) findViewById(R.id.bt2);
        Button bt3 = (Button) findViewById(R.id.bt3);
        Button bt4 = (Button) findViewById(R.id.bt4);
        Button bt5 = (Button) findViewById(R.id.bt5);
        Button bt6 = (Button) findViewById(R.id.bt6);
        Button bt7 = (Button) findViewById(R.id.bt7);
        Button bt8 = (Button) findViewById(R.id.bt8);
        Button bt9 = (Button) findViewById(R.id.bt9);
        Button btDot = (Button) findViewById(R.id.btDot);
        Button btAdd = (Button) findViewById(R.id.btAdd);
        Button btSub = (Button) findViewById(R.id.btSub);
        Button btMul = (Button) findViewById(R.id.btMul);
        Button btDiv = (Button) findViewById(R.id.btDiv);
        Button btDel = (Button) findViewById(R.id.btDel);
        Button btEqual = (Button) findViewById(R.id.btEqual);
        final TextView tvDisplay = (TextView) findViewById(R.id.tvDisplay);

        btAddPressed = false;
        btSubPressed = false;
        btMulPressed = false;
        btDivPressed = false;
        btAnyOfAddSubMulDivPressed = false;
        dotPressed   = false;

        // Numeric buttons
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IfDisplayZero();
                Vib(20);
                if (btAnyOfAddSubMulDivPressed) { tvDisplay.setText(""); }
                tvDisplay.setText(tvDisplay.getText() + "0");
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IfDisplayZero();
                Vib(20);
                if (btAnyOfAddSubMulDivPressed) { tvDisplay.setText(""); }
                tvDisplay.setText(tvDisplay.getText() + "1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IfDisplayZero();
                Vib(20);
                if (btAnyOfAddSubMulDivPressed) { tvDisplay.setText(""); }
                tvDisplay.setText(tvDisplay.getText() + "2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IfDisplayZero();
                Vib(20);
                if (btAnyOfAddSubMulDivPressed) { tvDisplay.setText(""); }
                tvDisplay.setText(tvDisplay.getText() + "3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IfDisplayZero();
                Vib(20);
                if (btAnyOfAddSubMulDivPressed) { tvDisplay.setText(""); }
                tvDisplay.setText(tvDisplay.getText() + "4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IfDisplayZero();
                if (Float.parseFloat(tvDisplay.getText() + "") == 0) {
                Vib(20);
                    if (btAnyOfAddSubMulDivPressed) { tvDisplay.setText(""); }
                tvDisplay.setText(tvDisplay.getText() + "5"); }
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IfDisplayZero();
                Vib(20);
                if (btAnyOfAddSubMulDivPressed) { tvDisplay.setText(""); }
                tvDisplay.setText(tvDisplay.getText() + "6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IfDisplayZero();
                Vib(20);
                if (btAnyOfAddSubMulDivPressed) { tvDisplay.setText(""); }
                tvDisplay.setText(tvDisplay.getText() + "7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IfDisplayZero();
                Vib(20);
                if (btAnyOfAddSubMulDivPressed) { tvDisplay.setText(""); }
                tvDisplay.setText(tvDisplay.getText() + "8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IfDisplayZero();
                Vib(20);
                if (btAnyOfAddSubMulDivPressed) { tvDisplay.setText(""); btAnyOfAddSubMulDivPressed = false;}
                tvDisplay.setText(tvDisplay.getText() + "9");
            }
        });
        btDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IfDisplayZero();
                Vib(20);
                if (dotPressed == false)
                {
                    tvDisplay.setText(tvDisplay.getText() + ".");
                    dotPressed = true;
                }
            }
        });

        // Operational buttons
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btAddPressed == false)
                {
                    Vib(20);
                    value1 = Float.parseFloat(tvDisplay.getText() + "");
                    tvDisplay.setText(tvDisplay.getText() + " +");
                    btAddPressed = true;
                    btAnyOfAddSubMulDivPressed = true;
                }
            }
        });
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btSubPressed == false)
                {
                    Vib(20);
                    value1 = Float.parseFloat(tvDisplay.getText() + "");
                    tvDisplay.setText(tvDisplay.getText() + " -");
                    btSubPressed = true;
                    btAnyOfAddSubMulDivPressed = true;
                }
            }
        });
        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btMulPressed == false)
                {
                    Vib(20);
                    value1 = Float.parseFloat(tvDisplay.getText() + "");
                    tvDisplay.setText(tvDisplay.getText() + " x");
                    btMulPressed = true;
                    btAnyOfAddSubMulDivPressed = true;
                }
            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btDivPressed == false)
                {
                    Vib(20);
                    value1 = Float.parseFloat(tvDisplay.getText() + "");
                    tvDisplay.setText(tvDisplay.getText() + " /");
                    btDivPressed = true;
                    btAnyOfAddSubMulDivPressed = true;
                }
            }
        });
        btDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vib(20);
                tvDisplay.setText("0");
                btAddPressed = false;
                btSubPressed = false;
                btMulPressed = false;
                btDivPressed = false;
                dotPressed   = false;
                btAnyOfAddSubMulDivPressed = false;
            }
        });
        // Equals button
        btEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vib(20);
                value2 = Float.parseFloat(tvDisplay.getText() + "");
                if (btAddPressed) { tvDisplay.setText(value1 + value2 + ""); btAddPressed = false;}
                if (btSubPressed) { tvDisplay.setText(value1 - value2 + ""); btSubPressed = false;}
                if (btMulPressed) { tvDisplay.setText(value1 * value2 + ""); btMulPressed = false;}
                if (btDivPressed) { tvDisplay.setText(value1 / value2 + ""); btDivPressed = false;}
            }
        });

    }


    public void Vib(int duration) {
        final Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            vibrator.vibrate(VibrationEffect.createOneShot(duration, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            vibrator.vibrate(duration);
        }
    }
    public void IfDisplayZero()
    {
       /* if (Float.parseFloat(tvDisplay.getText() + "") == 0)
        {
            tvDisplay.setText("");
        }*/
    }

}