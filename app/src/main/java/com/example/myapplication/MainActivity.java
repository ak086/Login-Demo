package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText username=(EditText) findViewById(R.id.editTextView);
        EditText password=(EditText)findViewById(R.id.passwordTextView);
        Log.i("Button","it Worked");
        Log.i("usrname",username.getText().toString());
        Log.i("Password",password.getText().toString());
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}