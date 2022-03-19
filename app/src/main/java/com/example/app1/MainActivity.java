package com.example.app1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digit_comparer);

        EditText inputOne = findViewById(R.id.input_one);
        EditText inputTwo = findViewById(R.id.input_two);
        TextView Textresult = findViewById(R.id.text_result);
        Button btn_compare = findViewById(R.id.btn_compare);
        btn_compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputOnevalue = inputOne.getText().toString();
                String inputTwovalue = inputTwo.getText().toString();
                try {
                    Integer intOne = Integer.valueOf(inputOnevalue);
                    Integer intTwo = Integer.valueOf(inputTwovalue);

                    if (intOne.equals(intTwo)) {
                        Textresult.setText("Равно");
                    } else {
                        Textresult.setText("Не равно");
                    }
                } catch (NumberFormatException exeption) {
                    Textresult.setText("Ввводи только числа");
                }

            }

        });
    }
}