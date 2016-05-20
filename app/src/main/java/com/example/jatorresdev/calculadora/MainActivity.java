package com.example.jatorresdev.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private String operation;
    private Double num1, num2, result;

    public void onClickOne(View myView) {
        EditText et = (EditText) findViewById(R.id.txt_display);
        et.setText(et.getText() + "1");
    }

    public void onClickTwo(View myView) {
        EditText et = (EditText) findViewById(R.id.txt_display);
        et.setText(et.getText() + "2");
    }

    public void onClickThree(View myView) {
        EditText et = (EditText) findViewById(R.id.txt_display);
        et.setText(et.getText() + "3");
    }

    public void onClickFour(View myView) {
        EditText et = (EditText) findViewById(R.id.txt_display);
        et.setText(et.getText() + "4");
    }

    public void onClickFive(View myView) {
        EditText et = (EditText) findViewById(R.id.txt_display);
        et.setText(et.getText() + "5");
    }

    public void onClickSix(View myView) {
        EditText et = (EditText) findViewById(R.id.txt_display);
        et.setText(et.getText() + "6");
    }

    public void onClickSeven(View myView) {
        EditText display = (EditText) findViewById(R.id.txt_display);
        display.setText(display.getText() + "7");
    }

    public void onClickEight(View myView) {
        EditText et = (EditText) findViewById(R.id.txt_display);
        et.setText(et.getText() + "8");
    }

    public void onClickNine(View myView) {
        EditText et = (EditText) findViewById(R.id.txt_display);
        et.setText(et.getText() + "9");
    }

    public void onClickZero(View myView) {
        EditText et = (EditText) findViewById(R.id.txt_display);
        et.setText(et.getText() + "0");
    }

    public void onClickSum(View myView) {
        operation = "+";
        onClickOperatorNum1(myView);
    }

    public void onClickSub(View myView) {
        operation = "-";
        onClickOperatorNum1(myView);
    }

    public void onClickMultiply(View myView) {
        operation = "*";
        onClickOperatorNum1(myView);
    }

    public void onClickDivision(View myView) {
        operation = "/";
        onClickOperatorNum1(myView);
    }

    public void onClickOperatorNum1(View miView) {
        EditText et = (EditText) findViewById(R.id.txt_display);
        num1 = Double.parseDouble(et.getText().toString());
        et.setText("");
    }

    public void onClickEqual(View miView) {
        EditText et = (EditText) findViewById(R.id.txt_display);
        num2 = Double.parseDouble(et.getText().toString());

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }

        DecimalFormat df = new DecimalFormat("###.#");
        et.setText(df.format(result).toString());
    }

    public void onClickClear(View miView) {
        EditText et = (EditText) findViewById(R.id.txt_display);
        et.setText("");

        num1 = 0.0;
        num2 = 0.0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
