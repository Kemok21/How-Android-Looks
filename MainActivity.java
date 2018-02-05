package com.example.android.howandroidlooks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String notAll = "Not all items are selected";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resultClick(View view) {
        RadioGroup RGHead = (RadioGroup) findViewById(R.id.question_head);
        RadioGroup RGHand = (RadioGroup) findViewById(R.id.question_hand);
        RadioGroup RGBody = (RadioGroup) findViewById(R.id.question_body);
        RadioGroup RGLegs = (RadioGroup) findViewById(R.id.question_legs);

        if (RGHead.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, notAll, Toast.LENGTH_SHORT).show();
        } else if (RGHand.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, notAll, Toast.LENGTH_SHORT).show();
        } else if (RGBody.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, notAll, Toast.LENGTH_SHORT).show();
        } else if (RGLegs.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, notAll, Toast.LENGTH_SHORT).show();
        } else {
            ImageView roboGreen = (ImageView) findViewById(R.id.robo_green);
            ImageView roboHead = (ImageView) findViewById(R.id.robo_head);
            ImageView roboHand = (ImageView) findViewById(R.id.robo_hand);
            ImageView roboBody = (ImageView) findViewById(R.id.robo_body);
            ImageView roboLegs = (ImageView) findViewById(R.id.robo_legs);

            RadioButton radioButtonHead = (RadioButton) findViewById(RGHead.getCheckedRadioButtonId());
            RadioButton radioButtonHand = (RadioButton) findViewById(RGHand.getCheckedRadioButtonId());
            RadioButton radioButtonBody = (RadioButton) findViewById(RGBody.getCheckedRadioButtonId());
            RadioButton radioButtonLegs = (RadioButton) findViewById(RGLegs.getCheckedRadioButtonId());

            roboGreen.setImageResource(R.drawable.robo);

            if (radioButtonHead.getText() == getResources().getString(R.string.purple)) {
                roboHead.setImageResource(R.drawable.head_purple);
            } else if (radioButtonHead.getText() == getResources().getString(R.string.orange)) {
                roboHead.setImageResource(R.drawable.head_orange);
            } else {
                roboHead.setImageResource(R.drawable.empty);
            }

            if (radioButtonHand.getText() == getResources().getString(R.string.purple)) {
                roboHand.setImageResource(R.drawable.hands_purple);
            } else if (radioButtonHand.getText() == getResources().getString(R.string.orange)) {
                roboHand.setImageResource(R.drawable.hands_orange);
            } else {
                roboHand.setImageResource(R.drawable.empty);
            }

            if (radioButtonBody.getText() == getResources().getString(R.string.purple)) {
                roboBody.setImageResource(R.drawable.body_purple);
            } else if (radioButtonBody.getText() == getResources().getString(R.string.orange)) {
                roboBody.setImageResource(R.drawable.body_orange);
            } else {
                roboBody.setImageResource(R.drawable.empty);
            }

            if (radioButtonLegs.getText() == getResources().getString(R.string.purple)) {
                roboLegs.setImageResource(R.drawable.legs_purple);
            } else if (radioButtonLegs.getText() == getResources().getString(R.string.orange)) {
                roboLegs.setImageResource(R.drawable.legs_orange);
            } else {
                roboLegs.setImageResource(R.drawable.empty);
            }

            Toast.makeText(this, "Very good! It looks so beautiful!", Toast.LENGTH_SHORT).show();


        }

    }
}