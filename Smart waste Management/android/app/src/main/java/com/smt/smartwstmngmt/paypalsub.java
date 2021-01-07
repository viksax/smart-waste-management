package com.smt.smartwstmngmt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class paypalsub extends AppCompatActivity {
    Button btdn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paypalsub);
        btdn = (Button)findViewById(R.id.btdone);
        btdn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(paypalsub.this, thankyou.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
