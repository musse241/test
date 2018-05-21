package com.example.jocke.poppup;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;

/**
 * Created by Jocke on 2018-05-16.
 */

public class pop extends Activity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        new CountDownTimer(4000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                // TODO Auto-generated method stub
                setContentView(R.layout.popwindow);

                DisplayMetrics dm = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(dm);

                int width= dm.widthPixels;
                int height=dm.heightPixels;

                getWindow().setLayout((int)(width*.8),(int)(height*.6));

            }

            @Override
            public void onFinish() {
                startActivity(new Intent(pop.this,MainActivity.class));
            }
        }.start();

    }






}
