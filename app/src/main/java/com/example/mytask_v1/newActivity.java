package com.example.mytask_v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.microedition.khronos.egl.EGLDisplay;

public class newActivity extends AppCompatActivity {
    //Deklarasi tombol
    private TextView tanggal, myTaskAtas;
    private ImageButton Home, New;

    //Input data
    private EditText Matkul, Tugas, Deskripsi;
    Button btn_send;

    private static String KEY_MATKUL = "msg_matkul";
    private static String KEY_TUGAS = "msg_tugas";
    private static String KEY_DESKRIPSI = "msg_deskripsi";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        //Hilangin tulisan diatas
        getSupportActionBar().hide();

        //Inisialisasi button di activity
        Home = (ImageButton) findViewById(R.id.btn_Home);
        New = (ImageButton) findViewById(R.id.btn_New);


        //Inisiasi input
        Matkul = (EditText)findViewById(R.id.et_Matkul);
        Tugas = (EditText)findViewById(R.id.et_Tugas);
        Deskripsi = (EditText)findViewById(R.id.et_Deskripsi);
        btn_send = (Button)findViewById(R.id.btn_send);


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

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String matkul = Matkul.getText().toString();
                    String tugas = Tugas.getText().toString();
                    String deskripsi = Deskripsi.getText().toString();
                    Bundle bundle = new Bundle();
                    bundle.putString(KEY_MATKUL, matkul);
                    bundle.putString(KEY_TUGAS, tugas);
                    bundle.putString(KEY_DESKRIPSI, deskripsi);
                    HomeFragment hf = new HomeFragment();
                    hf.setArguments(bundle);
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.frameNew, hf)
                            .commit();
                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
    }
}