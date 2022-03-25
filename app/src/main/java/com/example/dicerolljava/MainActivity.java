package com.example.dicerolljava;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView number;
    NumberPicker numberPicker1;
    NumberPicker numberPicker2;
    int tensDigit;
    int onesDigit;
    int entireNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        number = findViewById(R.id.number);
        numberPicker1 = findViewById(R.id.NumberPicker1);
        numberPicker2 = findViewById(R.id.NumberPicker2);

        numberPicker1.setMinValue(0);
        numberPicker1.setMaxValue(9);

        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(9);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstDigit = (int) (Math.random() * 10);
                int secondDigit = (int) (Math.random() * 10);
                numberPicker1.setValue(firstDigit);
                numberPicker2.setValue(secondDigit);
                if (firstDigit == 0 && secondDigit == 0) {
                    number.setText("100");
                } else {
                    number.setText(new Integer(firstDigit * 10 + secondDigit).toString());
                }
            }
        });
    }
}