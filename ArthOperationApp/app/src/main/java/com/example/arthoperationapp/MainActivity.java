package com.example.arthoperationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    EditText etFirst,etSecond,etResult;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirst = findViewById(R.id.no1);
        etSecond = findViewById(R.id.no2);
        etResult = findViewById(R.id.res);
        rg = findViewById(R.id.radiogroup);

        rg.setOnCheckedChangeListener(this);
    }
    public void onCheckedChanged(RadioGroup rg,int id)
    {
        double first = 0, second = 0;

        if(etFirst.getText().toString().equals(""))
            Toast.makeText(getApplicationContext(), "Enter the first value", Toast.LENGTH_LONG).show();
        else
            first = Double.parseDouble(etFirst.getText().toString());

        if(etSecond.getText().toString().equals(""))
            Toast.makeText(getApplicationContext(), "Enter the Second value", Toast.LENGTH_LONG).show();
        else
        second = Double.parseDouble(etSecond.getText().toString());


        double result = 0;
        switch (id)
        {
            case R.id.addbtn:
                result = first+second;
                break;
            case R.id.subbtn:
                result = first-second;
                break;
            case R.id.mulbtn:
                result = first*second;
                break;
            case R.id.divbtn:
                result = first/second;
                break;

        }
        Double res = new Double(result);
        etResult.setText(res.toString());
    }
}
