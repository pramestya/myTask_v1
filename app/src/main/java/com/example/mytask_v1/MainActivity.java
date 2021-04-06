package com.example.mytask_v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.text.format.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    //Deklarasi tombol
    private TextView tanggal, myTaskAtas;
    private ImageButton Home, New, Done;

    //Buat nyari tanggal
    int year, month, day;

    //Nampung tanggal
    String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hilangin tulisan diatas
        getSupportActionBar().hide();

        //Ganti font myTask masih salah
//        myTaskAtas = (TextView)findViewById(R.id.myTaskAtas);
//        Typeface typeface = Typeface.createFromAsset(getAssets(),"font/californian.ttf");
//        myTaskAtas.setTypeface(typeface);

        //Inisialisasi button di activity
        Home = (ImageButton) findViewById(R.id.btn_Home);
        New = findViewById(R.id.btn_New);
        Done = findViewById(R.id.btn_Done);

        //Menampilkan tanggal (belum sesuai mockup)
        tanggal = findViewById(R.id.tanggal);

        //Tanggal sekarang
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, d MMMM yyyy", Locale.getDefault());
        String currentDateandTime = sdf.format(new Date());
        tanggal.setText(currentDateandTime);


        //Set button ketika di klik
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.container, new HomeFragment());
                ft.commit();
            }
        });


    }


}