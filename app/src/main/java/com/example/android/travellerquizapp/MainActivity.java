package com.example.android.travellerquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String userName;
    private int userAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method checks if the name is provided.
     * And start quiz if name is provided.
     */
    public void isNameProvided(View view) {
        EditText enteredName = (EditText) findViewById(R.id.customer_name);
        userName = enteredName.getText().toString();
        EditText enteredAge = (EditText) findViewById(R.id.age);
        userAge = Integer.parseInt(enteredAge.getText().toString());
        if (userName.equals("")) {
            Toast.makeText(this, getString(R.string.toast_no_name), Toast.LENGTH_SHORT).show();
            return;
        } else {
            setContentView(R.layout.question_one);
        }
    }


    public void goToSecondQuestion() {

    }
}
