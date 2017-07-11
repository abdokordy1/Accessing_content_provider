package com.example.android.abdallah;

import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void open (View view) {
       das dass=new das();



        dass.execute();
    }


    class  das extends AsyncTask<Void,Void,Void>
    {




        @Override
        protected Void doInBackground(Void... params) {

            int per=  ContextCompat.checkSelfPermission(MainActivity.this,"com.example.android.conterprovider.DataProvider.STUDENTS_READ");


            Log.v("abdo", String.valueOf(per));

            String URL = "content://com.example.android.conterprovider.DataProvider";

            Uri students = Uri.parse(URL);


            Cursor c = getContentResolver().query(students, null, null, null, null);


                // Should we show an explanation?

                // MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE is an
                // app-defined int constant that should be quite unique


                // c.close();


           return null;
        }
    }

}
