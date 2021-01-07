package com.smt.smartwstmngmt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.firebase.client.Firebase;

public class points extends AppCompatActivity {

    Firebase url;
    Button btsk;
    Button btre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);
        btre = (Button)findViewById(R.id.button2);
        btsk = (Button)findViewById(R.id.button1);
        Firebase.setAndroidContext(this);
        url = new Firebase("https://smartwastemanagement-ab22a.firebaseio.com/");
        btre.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Firebase firebase = url.child("Motor");
                firebase.setValue("0");
                Intent pintent = new Intent(points.this, paypalsub.class);
                startActivity(pintent);
                //finish();
               // return;

            }
        });
        btsk.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Firebase firebase = url.child("Motor");
                firebase.setValue("0");
                Intent sintent = new Intent(points.this, thankyou.class);
                startActivity(sintent);
                //finish();
                //return;
            }
        });



    }

}
