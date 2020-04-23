package com.example.demoradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Get RadioGroup object
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
                // get id of selected radio button in radiogroup
                int selectedButtonId = rg.getCheckedRadioButtonId();
                // get radio button object from id we had gotten above
                RadioButton rb = (RadioButton) findViewById(selectedButtonId);
                // show a Toast that display the text on selected radio button
                Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_LONG).show();

            }
        });

    }
}
