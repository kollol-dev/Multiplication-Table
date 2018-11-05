package com.kollol.multiplicationtable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//import static com.kollol.multiplicationtable.MainActivity.number;

public class MainPage extends AppCompatActivity {


    TextView disRessult;
    String allResult;
    public Integer res;

    Button newInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        disRessult = (TextView) findViewById(R.id.display);

        Intent secondIntent = getIntent();

        res = secondIntent.getIntExtra("getNumber", 0);

        allResult = "";

        for(int i = 1; i <= 10; i++){

            allResult += res + " X " + i + " = " + (res * i) + "\n";
            disRessult.setText(allResult);
        }

        newInput = (Button) findViewById(R.id.btn_back);
        newInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
            }
        });



    }
}
