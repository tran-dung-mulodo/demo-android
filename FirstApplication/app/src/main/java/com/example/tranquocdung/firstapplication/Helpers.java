package com.example.tranquocdung.firstapplication;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by nguyenhuyvu on 1/7/15.
 */
public class Helpers {
    public void showMessage(String text,Context context,int duration){

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
