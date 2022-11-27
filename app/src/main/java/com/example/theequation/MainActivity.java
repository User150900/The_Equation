package com.example.theequation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText  aField;
    EditText  bField;
    EditText  cField;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
    }
    private void setupUI(){
        aField = findViewById(R.id.a_field);
        bField = findViewById(R.id.b_field);
        cField = findViewById(R.id.c_field);
        button = findViewById(R.id.button);
    }

    public void click(View view) {
        double a = Double.parseDouble(aField.getText().toString());
        double b = Double.parseDouble(bField.getText().toString());
        double c = Double.parseDouble(cField.getText().toString());
        double d = (b * b) + (4 * a * c);
        double x1, x2;
        if (d > 0){
            x1 = - b - Math.sqrt(d) / (a * 2);
            x2 = - b + Math.sqrt(d) / (a * 2);
            Toast.makeText(this, "x1 = " + x1 + ", x2 = " + x2, Toast.LENGTH_SHORT).show();
        }
        else if (d == 0){
            x1 = -b / (a * 2);
            Toast.makeText(this, "x = " + x1, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Nothing", Toast.LENGTH_SHORT).show();
        }
    }
}