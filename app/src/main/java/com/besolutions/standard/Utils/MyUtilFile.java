package com.besolutions.standard.Utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyUtilFile {

    private android.support.v7.widget.Toolbar mToolbar;
    private Context context;

    public List<String> gendersArabic = Arrays.asList("ذكر","أنثى");
    public List<String> gendersEnglish = Arrays.asList("Male","Female");

    public MyUtilFile(android.support.v7.widget.Toolbar mToolbar) {

        this.mToolbar = mToolbar;
    }

    public MyUtilFile(Context context) {
        this.context = context;
    }

    public TextView getActionBarTextView() {
        TextView titleTextView = null;

        try {
                Field f = mToolbar.getClass().getDeclaredField("mTitleTextView");
                f.setAccessible(true);
                titleTextView = (TextView) f.get(mToolbar);

        } catch (NoSuchFieldException | IllegalAccessException ignored) {
        }
        return titleTextView;
    }

    public void showMessage(String s) {
        Toast.makeText(context, s, Toast.LENGTH_LONG).show();
    }


    public void choosePhotoFromGallary(int PICK_IMAGE_REQUEST_GALLERY, Activity activity) {
        Intent galleryIntent = new Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        activity.startActivityForResult(galleryIntent,PICK_IMAGE_REQUEST_GALLERY);
    }


    @SuppressLint("DefaultLocale")
    public static String getRandomNumberString() {
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        // this will convert any number sequence into 6 character.
        return String.format("%06d", number);
    }


    public void AlertExitArabic(final Context contextp) {
        AlertDialog.Builder builder = new AlertDialog.Builder(contextp);
        builder.setMessage("هل تريد الخروج ؟").setCancelable(false).setPositiveButton("نعم", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

                Intent a = new Intent(Intent.ACTION_MAIN);
                a.addCategory(Intent.CATEGORY_HOME);
                a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                contextp.startActivity(a);

            }
        }).setNegativeButton("لا", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        builder.create().show();
    }

    public void AlertExitEnglish(final Context contextp) {
        AlertDialog.Builder builder = new AlertDialog.Builder(contextp);
        builder.setMessage("Do you want to exit ?").setCancelable(false).setPositiveButton("yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

                Intent a = new Intent(Intent.ACTION_MAIN);
                a.addCategory(Intent.CATEGORY_HOME);
                a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                contextp.startActivity(a);

                //Main2Activity.this.finish();
            }
        }).setNegativeButton("no", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        builder.create().show();
    }
}
