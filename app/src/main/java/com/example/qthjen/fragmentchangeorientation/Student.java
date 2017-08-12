package com.example.qthjen.fragmentchangeorientation;

import java.io.Serializable;

public class Student implements Serializable {

    private String mName;
    private String mAdress;
    private String mEmail;
    private int mBerthday;

    public Student(String mName, int mBerthday, String mAdress, String mEmail) {

        this.mName = mName;
        this.mBerthday = mBerthday;
        this.mAdress = mAdress;
        this.mEmail = mEmail;

    }

    public String getmName() {
        return mName;

    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAdress() {
        return mAdress;
    }

    public void setmAdress(String mAdress) {
        this.mAdress = mAdress;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public int getmBerthday() {
        return mBerthday;
    }

    public void setmBerthday(int mBerthday) {
        this.mBerthday = mBerthday;
    }
}
