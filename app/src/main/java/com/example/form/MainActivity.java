package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    CheckBox c1,c2,c3,c4;
    RadioButton radio1,radio2;
    EditText e1,e2,e3,e4,e5;
    TextView t4,t5,t6,t7,t8,t9,t10,t11;
    String arr[] = {"amreli","Surat","Ahmedabad","Vadodara","Rajkot","Bhavnagar","Jamnagar","Gandhinagar","Junagadh"};
    Spinner spinner;

    String MobilePattern = "[0-9]{10}";
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    char[] capital;
    char[] small;
    boolean iscapital=false;
    boolean issmall=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        capital=alpha.toCharArray();
        small=alpha.toLowerCase().toCharArray();

//        c1 = findViewById(R.id.c1);
//        c2 = findViewById(R.id.c2);
//        c3 = findViewById(R.id.c3);
//        c4 = findViewById(R.id.c4);
//        radio1 = findViewById(R.id.radio1);
//        radio2 = findViewById(R.id.radio2);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);
        e5 = findViewById(R.id.e5);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        t8 = findViewById(R.id.t8);
//        t9 = findViewById(R.id.t9);
//        t10 = findViewById(R.id.t10);
//        t11 = findViewById(R.id.t11);
//        spinner = findViewById(R.id.spinner);
//
//        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.spinner,R.id.text,arr);
//        spinner.setAdapter(arrayAdapter);
//
//        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
//
//                System.out.println(b);
//            }
//        });
//
//        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
//
//                System.out.println(b);
//            }
//        });
//
//        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
//
//                System.out.println(b);
//            }
//        });
//
//        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
//
//                System.out.println(b);
//            }
//        });
    }

    public void submit(View view) {
        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
        String passwrd = e4.getText().toString();
        String conpass =  e5.getText().toString();

        String name=e1.getText().toString();
        String contact=e2.getText().toString();
        String email=e3.getText().toString();
        String password=e4.getText().toString();
        String conpassword=e5.getText().toString();


        for (int i=0;i<capital.length;i++)
        {
            if (conpass.contains(""+capital[i]))
            {
                iscapital = true;
            }
            if (conpass.contains(""+small[i]))
            {
                issmall = true;
            }
        }
        if(e1.getText().toString().isEmpty())
        {
            e1.setError("ENter name");
            e1.requestFocus();
        }
        else  if(e1.getText().toString().length()<=5)
        {
            e1.setError("name should be 5 character");
            e1.requestFocus();
        }
        else  if(e2.getText().toString().isEmpty())
        {
            e2.setError("ENter Contact");
            e2.requestFocus();
        }
        else  if(!e2.getText().toString().startsWith("+91"))
        {
            e2.setError("Contact should be start with coutry code");
            e2.requestFocus();
        }
        else  if(e2.getText().toString().length()!=13)
        {
            e2.setError("Contact number is missing");
            e2.requestFocus();
        }
        else if(e3.getText().toString().isEmpty())
        {
            e3.setError("Enter email");
            e3.requestFocus();
        }
        else if(e3.getText().toString().endsWith("@email.com"))
        {
            e3.setError("enter email in last @gmail.com");
            e3.requestFocus();
        }
         if (e4.getText().toString().isEmpty())
        {
            e4.setError("Field can not be empty");
            e4.requestFocus();
        }
        else if (e4.getText().toString().length()<8)
        {
            e4.setError("Enter your 8 character");
            e4.requestFocus();
        }
        else if (!conpass .equals(passwrd) )
        {
            e5.setError("confirm password not match");
            e5.requestFocus();
        }
        else if (e1.getText().toString().contains(e5.getText().toString()) )
        {
            e5.setError("password should not contains username");
            e5.requestFocus();
        }
        else if (!iscapital)
        {
            e5.setError("password should have atleast 1 capital letter");
            e5.requestFocus();
        }
        else if (!issmall)
        {
            e5.setError("password should have atleast 1 small letter");
            e5.requestFocus();
        }
        else
        {
            //print
            t4.setText(e1.getText().toString());
            t5.setText(e2.getText().toString());
            t6.setText(e3.getText().toString());
            t7.setText(e4.getText().toString());
            t8.setText(e5.getText().toString());
//            t10.setText(spinner.getSelectedItem().toString());
//            StringBuffer stringBuffer = new StringBuffer();
//            if(c1.isChecked())
//            {
//                stringBuffer.append("/music");
//            }
//            if(c2.isChecked())
//            {
//                stringBuffer.append("/muvie");
//            }
//            if(c3.isChecked())
//            {
//                stringBuffer.append("/driving");
//            }
//            if(c4.isChecked())
//            {
//                stringBuffer.append("/traveling");
//            }
//            String str = stringBuffer.toString();
//            if(str.length()>=1)
//            {
//                str = str.substring(1);
//                t11.setText(str);
//            }
//
//
//            if(radio1.isChecked())
//            {
//                t9.setText("male");
//            }
//            if(radio2.isChecked())
//            {
//                t9.setText("female");
//            }

            MyClass m = new MyClass(this);
            m.insertdata(name,contact,email,password);

        }
    }
}