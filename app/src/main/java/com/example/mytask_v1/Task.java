package com.example.mytask_v1;

import java.util.Date;

public class Task {
    private String Matkul;
    private String Tugas;
    private String Deskripsi;

    //private Date DueDate;
    //private Date DateCreated;

    private String Deadline;
    private Boolean isDone;

    public Task(String matkul, String tugas, String deskripsi, String Deadline, Boolean isDone) {
        this.isDone = isDone;
        this.Matkul = matkul;
        this.Tugas = tugas;
        this.Deskripsi = deskripsi;
//        this.DueDate = dueDate;
//        this.DateCreated = dateCreated;

        this.Deadline = Deadline;
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

//    public Date getDueDate() {
//        return DueDate;
//    }
//
//    public void setDueDate(Date dueDate) {
//        DueDate = dueDate;
//    }
//
//    public Date getDateCreated() {
//        return DateCreated;
//    }
//
//    public void setDateCreated(Date dateCreated) {
//        DateCreated = dateCreated;
//    }


    public String getDeadline() {
        return Deadline;
    }

    public void setDeadline(String deadline) {
        Deadline = deadline;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }
}


