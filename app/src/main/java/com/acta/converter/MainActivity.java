package com.acta.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        EditText editText;
        TextView textView,textView2, textView4,valueinPounds;
        Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
         valueinPounds = findViewById(R.id.valueOfPounds);
         editText = findViewById(R.id.editTextNumber);
         button = findViewById(R.id.button);

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 ConvertFromKiloToPound();
             }
         });

    }

    private void ConvertFromKiloToPound() {
        String valueEnteredinKilo = editText.getText().toString();
        double kilo = Double.parseDouble(valueEnteredinKilo);
        double pounds = kilo * 2.205;
        valueinPounds.setText("" + pounds);
    }
}