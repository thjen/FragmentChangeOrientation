package com.example.qthjen.fragmentchangeorientation;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements PostGetDataStudent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void DataSV(Student student) {

        FragmentInfo fragmentInfo = (FragmentInfo) getFragmentManager().findFragmentById(R.id.fmInfo);

        Configuration configuration = getResources().getConfiguration();

        if ( fragmentInfo != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) { // khi xoay màn hình sang ngang
            fragmentInfo.SetInfo(student);
        } else { // khi không xoay màn hình (Màn hình dọc)
            Intent intent = new Intent(MainActivity.this, InfoVertical.class);
            intent.putExtra("dataStudent", student);
            startActivity(intent);
        }

    }

}
