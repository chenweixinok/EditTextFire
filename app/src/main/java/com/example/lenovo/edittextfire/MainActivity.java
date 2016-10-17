package com.example.lenovo.edittextfire;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private EditText mEditText;
    private FireworkView mFireworkView;
    private RelativeLayout layout;
    private TextView day;
    private TextView night;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (RelativeLayout) findViewById(R.id.layout);
        day = (TextView) findViewById(R.id.day);
        day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(0xFFFFFFFF);
            }
        });
        night = (TextView) findViewById(R.id.night);
        night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(0xFF000000);
            }
        });
        mEditText = (EditText) findViewById(R.id.edit_text);


        mFireworkView = (FireworkView) findViewById(R.id.fire_work);
        mFireworkView.bindEditText(mEditText);


    }


}
