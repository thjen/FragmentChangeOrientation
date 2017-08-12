package com.example.qthjen.fragmentchangeorientation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class InfoVertical extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infovertical);

        Intent intent = getIntent();
        Student student = (Student) intent.getSerializableExtra("dataStudent");

        FragmentInfo fragmentInfo = (FragmentInfo) getFragmentManager().findFragmentById(R.id.fmInfoVertical);
        fragmentInfo.SetInfo(student);

    }
}
