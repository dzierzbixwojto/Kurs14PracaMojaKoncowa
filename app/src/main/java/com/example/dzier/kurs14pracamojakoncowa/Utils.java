package com.example.dzier.kurs14pracamojakoncowa;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by dzier on 01.10.2016.
 */
public class Utils {

    //klasa do twrozenia komunikatow

    public static void showMessageWithoutAction(Context con, String text, String title) {

        AlertDialog.Builder builder = new AlertDialog.Builder(con);

        builder.setMessage(text);
        builder.setTitle(title);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });


        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }



}