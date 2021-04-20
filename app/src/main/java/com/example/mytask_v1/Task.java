package com.example.mytask_v1;

import java.util.Date;

public class Task {
    private String Matkul;
    private String Tugas;
    private String Deskripsi;



    public Task(String matkul, String tugas, String deskripsi) {

        this.Matkul = matkul;
        this.Tugas = tugas;
        this.Deskripsi = deskripsi;

    }


    public String getMatkul() {
        return Matkul;
    }

    public void setMatkul(String matkul) {
        Matkul = matkul;
    }

    public String getTugas() {
        return Tugas;
    }

    public void setTugas(String tugas) {
        Tugas = tugas;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }


}


