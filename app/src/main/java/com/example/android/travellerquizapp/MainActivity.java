package com.example.android.travellerquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

    /**
     * This method is called when the next question button is clicked.
     * Go to second question
     */
    public void goToSecondQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1_ans1:
                if (checked) {
                    setContentView(R.layout.question_two);
                    break;
                }
            case R.id.q1_ans2:
                if (checked) {
                    setContentView(R.layout.question_seven);
                    break;
                }
        }
    }

    /**
     * This method is called when the next question button is clicked.
     * Go to third question
     */
    public void goToThirdQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q2_ans1:
                if (checked) {
                    setContentView(R.layout.question_three);
                    break;
                }
            case R.id.q2_ans2:
                if (checked) {
                    setContentView(R.layout.resume);
                    break;
                }
        }
    }

    /**
     * This method is called when the next question button is clicked.
     * Go to fourth question
     */
    public void goToFouthQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q3_ans1:
                if (checked) {
                    setContentView(R.layout.question_four);
                    break;
                }
            case R.id.q3_ans2:
                if (checked) {
                    setContentView(R.layout.resume);
                    break;
                }
        }
    }

    /**
     * This method is called when the next question button is clicked.
     * Go to fifth question
     */
    public void goToFifthQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q4_ans1:
                if (checked) {
                    setContentView(R.layout.question_five);
                    break;
                }
            case R.id.q4_ans2:
                if (checked) {
                    setContentView(R.layout.resume);
                    break;
                }
        }
    }

    /**
     * This method is called when the next question button is clicked.
     * Go to sixth question
     */
    public void goToSixthQuestion(View view) {
        setContentView(R.layout.question_six);
    }

    /**
     * This method is called when the next question button is clicked.
     * Go to seven question
     */
    public void goToSevenQuestion(View view) {
        setContentView(R.layout.question_seven);
    }

    /**
     * This method is called when the next question button is clicked.
     * Go to eight question
     */
    public void goToEightQuestion(View view) {
        setContentView(R.layout.question_eight);
    }

    /**
     * This method is called when the next question button is clicked.
     * Go to resume and find out your type!
     */
    public void goToResume(View view) {
        setContentView(R.layout.resume);
    }

}
