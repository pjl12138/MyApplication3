package com.example.o.myapplication1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements CompoundButton.OnCheckedChangeListener {
    private CheckBox ch_b;
    private ToggleButton to_bu;
    private Switch sw;
    private RadioGroup ra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch_b=(CheckBox)findViewById(R.id.ch_b);
        ch_b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    ch_b.setText(R.string.app_ch1);
                else
                    ch_b.setText(R.string.app_ch2);
            }
        });
        to_bu=(ToggleButton)findViewById(R.id.to_bu);
        to_bu.setOnCheckedChangeListener(this);
        sw=(Switch)findViewById(R.id.sw_ch);
        sw.setOnCheckedChangeListener(this);
        ra=(RadioGroup)findViewById(R.id.ra_gr);

       ra.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton) group.findViewById(checkedId);
                Toast.makeText(MainActivity.this, radioButton.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked)
            Toast.makeText(MainActivity.this,"ON",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(MainActivity.this,"OFF",Toast.LENGTH_LONG).show();
    }

}