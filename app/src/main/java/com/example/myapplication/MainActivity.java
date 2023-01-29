package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
  EditText  EditLength;
  EditText  EditBreadth;
  TextView  TextResult;
  Button Calculate;
  Button Clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditLength = (EditText) findViewById(R.id.editTextTextNumberDecimal);
        EditBreadth = (EditText) findViewById(R.id.editTextTextNumberDecimal1);
        TextResult = (TextView)  findViewById(R.id.Text);
        Calculate = (Button) findViewById(R.id.button);
        Clear = (Button) findViewById(R.id.button2);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clear();
            }
        });
    }

    public void calculate(){
        Double n1 = Double.parseDouble(EditLength.getText().toString());
        Double n2 = Double.parseDouble(EditBreadth.getText().toString());
        Double calculateArea = n1*n2;
        TextResult.setText(calculateArea.toString());
    }


    public void Clear(){
        EditLength.setText(Double.toString(0.0));
        EditBreadth.setText(Double.toString(0.0));
        TextResult.setText(Double.toString(0.0));
    }
}