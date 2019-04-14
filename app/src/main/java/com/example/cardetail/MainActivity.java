package com.example.cardetail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    EditText make, year, color, price, engine;
    Button btnCreate;
    ScrollView scrollView;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        make = findViewById(R.id.txtMake);
        color = findViewById(R.id.txtColor);
        price = findViewById(R.id.txtPrice);
        engine = findViewById(R.id.txtEngine);
        year = findViewById(R.id.txtYear);
        btnCreate = findViewById(R.id.btnCreateCar);
        scrollView = findViewById(R.id.scrollViewDisplay);
        final LinearLayout l1 = findViewById(R.id.linerLayout);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (make.getText().toString().isEmpty()
                        && color.getText().toString().isEmpty()
                        && price.getText().toString().isEmpty()
                        && year.getText().toString().isEmpty()
                        && engine.getText().toString().isEmpty()) {

                    Toast.makeText(MainActivity.this, "Cannot create Car", Toast.LENGTH_SHORT).show();
                } else {

                    i++;

                    String output = "This is Vechile No. : " + i +
                            "Current Value: " + price.getText().toString() + "+\n" +
                            "Type: " + make.getText().toString() + "\n"
                            + "Color: " + color.getText().toString() + "\n"
                            + "Year: " + year.getText().toString() + "\n" +
                            " with Effective Engine: " + engine.getText().toString() + "\n";

                    TextView tv1 = new TextView(MainActivity.this);
                    tv1.setText(output);
                    l1.addView(tv1);
                }
            }
        });
    }
}
