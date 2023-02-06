package org.example.model;

import java.util.List;

public class Siswa {

    private int id;

    private String namaSiswa;

    private List<Pelajaran> listpelajaran;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaSiswa() {
        return namaSiswa;
    }

    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
    }

    public List<Pelajaran> getListpelajaran() {
        return listpelajaran;
    }

    public void setListpelajaran(List<Pelajaran> listpelajaran) {
        this.listpelajaran = listpelajaran;
    }
}
