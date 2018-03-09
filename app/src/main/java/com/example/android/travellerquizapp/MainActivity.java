package com.example.android.travellerquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //    question zero
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

//        here is supose user to be able to chose multiple

        // Check which checkbox was clicked
        switch (view.getId()) {
            //if sea case
            case R.id.sea:
                if (checked)
                    setContentView(R.layout.question_one);
                else
                    Toast.makeText(this, getString(R.string.toast_checked), Toast.LENGTH_SHORT).show();
                //if mountain case
            case R.id.mountain:
                if (checked)
                    setContentView(R.layout.question_one);
                else
                    Toast.makeText(this, getString(R.string.toast_checked), Toast.LENGTH_SHORT).show();
                //if city case
            case R.id.city:
                if (checked)
                    setContentView(R.layout.question_one);
                else
                    Toast.makeText(this, getString(R.string.toast_checked), Toast.LENGTH_SHORT).show();
                break;
        }
    }

    /**
     * This method checks if the name is provided.
     * And start quiz if name is provided.
     */
    public void isNameProvided(View view) {
        EditText enteredName = (EditText) findViewById(R.id.customer_name);
        userName = enteredName.getText().toString();
        if (userName.equals("")) {
            Toast.makeText(this, getString(R.string.toast_no_name), Toast.LENGTH_SHORT).show();
            return;
        } else {
            setContentView(R.layout.question_zero);
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
                    setContentView(R.layout.vacantioner);
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
                    setContentView(R.layout.vacantioner);
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
                    setContentView(R.layout.expat);
                    break;
                }
        }
    }

    /**
     * This method is called when the next question button is clicked.
     * Go to sixth question
     */
    public void goToSixthQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q5_ans1:
                if (checked) {
                    setContentView(R.layout.question_six);
                    break;
                }
            case R.id.q5_ans2:
                if (checked) {
                    setContentView(R.layout.expat);
                    break;
                }
        }
    }

    /**
     * This method is called when the next question button is clicked.
     * Go to seven question
     */
    public void goToSevenQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q6_ans1:
                if (checked) {
                    setContentView(R.layout.nomad);
                    break;
                }
            case R.id.q6_ans2:
                if (checked) {
                    setContentView(R.layout.question_seven);
                    break;
                }
        }
    }

    /**
     * This method is called when the next question button is clicked.
     * Go to eight question
     */
    public void goToEightQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q7_ans1:
                if (checked) {
                    setContentView(R.layout.vacantioner);
                    break;
                }
            case R.id.q7_ans2:
                if (checked) {
                    setContentView(R.layout.question_eight);
                    break;
                }
        }
    }

    //    finish as a vacantioner
    public void goToVacantioner(View view) {
        setContentView(R.layout.vacantioner);
    }

    //    finish as an expat
    public void goToExpat(View view) {
        setContentView(R.layout.expat);
    }

    //    finish as a nomad
    public void goToNomad(View view) {
        setContentView(R.layout.nomad);
    }

    // start again our quiz
    public void startAgain(View view) {
        setContentView(R.layout.activity_main);
    }


}
