package com.example.qthjen.fragmentchangeorientation;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentInfo extends Fragment{

    TextView tvName, tvBerthday, tvAdress, tvEmail;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_info, container, false);
        findView();


        return view;
    }

    public void SetInfo(Student student) {

        tvName.setText(student.getmName());
        tvBerthday.setText("Berthday: " + String.valueOf(student.getmBerthday()));
        tvAdress.setText("Adress: " + student.getmAdress());
        tvEmail.setText("Email: " + student.getmEmail());

    }

    public void findView() {

        tvName = (TextView) view.findViewById(R.id.tvName);
        tvBerthday = (TextView) view.findViewById(R.id.tvBerthday);
        tvAdress = (TextView) view.findViewById(R.id.tvAdress);
        tvEmail = (TextView) view.findViewById(R.id.tvEmail);

    }

}
