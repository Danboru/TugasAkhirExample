package com.hardy.pakarapel.models;

/**
 * Created by rama on 11/5/16.
 */

public class Hama {
    private int id;
    private String pid,nama,cara;

    public Hama(int id, String pid, String nama, String cara) {
        this.id = id;
        this.pid = pid;
        this.nama = nama;
        this.cara = cara;
    }

    public Hama(String pid, String nama, String cara) {
        this.pid = pid;
        this.nama = nama;
        this.cara = cara;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getCara() {
        return cara;
    }

    public void setCara(String cara) {
        this.cara = cara;
    }
}
