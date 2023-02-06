package org.example.model;

import java.util.List;

public class Pelajaran {

    private int idPelajaran;

    private String namapelajaran;

    private int nilai;

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public int getIdPelajaran() {
        return idPelajaran;
    }

    public void setIdPelajaran(int idPelajaran) {
        this.idPelajaran = idPelajaran;
    }

    public String getNamapelajaran() {
        return namapelajaran;
    }

    public void setNamapelajaran(String namapelajaran) {
        this.namapelajaran = namapelajaran;
    }
}
