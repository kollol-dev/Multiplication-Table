package com.kollol.multiplicationtable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public Integer number = 0;
    Button btn;
    EditText editNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        btn = (Button) findViewById(R.id.submit);

        editNum = (EditText) findViewById(R.id.edit);
        editNum.setHint("      Example 1, 2, 3, ...");



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               try {

                   Intent in = new Intent(getApplicationContext(), MainPage.class);

                   number = Integer.parseInt( editNum.getText().toString() );
                   in.putExtra("getNumber", number);
                   startActivity(in);
               }

               catch(Exception e) {
                   Toast.makeText(view.getContext(),"নামতা দেখতে যেকোন সংখ্যা ইনপুট দাও!", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }
}
