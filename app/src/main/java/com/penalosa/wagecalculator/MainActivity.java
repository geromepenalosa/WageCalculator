package com.penalosa.wagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            final String myPW = "Gerome";
            final String myUN = "porkchopbby";



            final TextView msg = findViewById(R.id.textView);
            final Button btn = findViewById(R.id.pislitako);
            final TextView Message = findViewById(R.id.message);
            final EditText Username = findViewById(R.id.Username);
            final EditText Password = findViewById(R.id.Password);

            msg.setText("Facebook");
            btn.setText("Sign-in");

            btn.setOnClickListener(

                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String typedPW = Password.getText().toString();
                            String typedUN = Username.getText().toString();

                            if (typedPW.equals(myPW) && typedUN.equalsIgnoreCase(myUN)) {

                                Toast.makeText(MainActivity.this, "You successfully logged in",
                                        Toast.LENGTH_LONG).show();

                                Intent intent1 = new Intent(MainActivity.this,Form.class);
                                startActivity(intent1);

                            }
                            else if (typedPW != myPW || typedUN != myUN){
                                Message.setText(typedPW+"Char count:"+typedPW.length());
                                Toast.makeText(MainActivity.this, "Your password or username is incorrect",
                                        Toast.LENGTH_LONG).show();
                            }

                        }
                    }


            );


    }
}
