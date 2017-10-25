package com.dev.numberstrivia;

/**
 * Created by Devesh Chaturvedi on 014-14-10-2017.
 */

public class Category {

    private String mTitle;
    private String mInput;

    public Category(String title){
        mTitle = title;
    }
    public Category(String title,String input){
        mTitle = title;
        mInput = input;
    }

    public String getmInput() {
        return mInput;
    }

    public String getmTitle() {
        return mTitle;
    }
}
