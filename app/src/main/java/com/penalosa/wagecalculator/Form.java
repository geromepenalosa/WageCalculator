package com.penalosa.wagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class Form extends AppCompatActivity {

    EditText firstname;
    EditText lastname;
    EditText age;
    EditText idnum;
    EditText hoursrendered;
    Spinner deptspin, sexxspin;
    String sex,dept;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

       firstname = findViewById(R.id.fname);
       lastname = findViewById(R.id. lname);
       age = findViewById(R.id.agetext);
       idnum = findViewById(R.id.idnumtext);
       hoursrendered = findViewById(R.id.hoursrend);
       deptspin = findViewById(R.id.departmentspinner);
       sexxspin = findViewById(R.id.sexspinner);

       deptspin.setOnItemSelectedListener(
               new AdapterView.OnItemSelectedListener() {
                   @Override
                   public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                       dept = deptspin.getSelectedItem().toString();
                   }

                   @Override
                   public void onNothingSelected(AdapterView<?> parent) {

                   }
               }
       );
        sexxspin.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        sex = sexxspin.getSelectedItem().toString();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );


        next.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        int hours = 0;
                        String first;
                        first = String.valueOf(firstname.getText());
                        String last;
                        last = String.valueOf(lastname.getText());
                        String agee;
                        agee = String.valueOf(age.getText());
                        String idnumm;
                        idnumm = String.valueOf(idnum.getText());
                        String hrsrend;
                        hrsrend = String.valueOf(hoursrendered.getText());
                        String sexx;
                        sexx = sexxspin.getSelectedItem().toString();
                        String deptt;
                        deptt = deptspin.getSelectedItem().toString();


                        if (hrsrend<=8 && deptt.equals("HR");





                    }
                }
        );






    }
}
