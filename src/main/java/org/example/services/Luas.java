package org.example.services;

import org.example.model.Hak;
import org.example.model.Page;
import org.example.model.Pengguna;


import java.util.List;

public interface Luas {
    double luasPersegi(double panjang, double lebar);
    List<Pengguna> getListpengguna();
    void simpanPengguna(Pengguna pengguna);

    void updatePengguna(Pengguna pengguna);

    Pengguna getPengguna(int id);

    Hak getHak(int id);

    List<Hak> getListhak();

    void simpanHak(Hak hak);

    void updateHak(Hak hak);

    List<Pengguna> getListpenggunaPaging(Page page);

    int getBanyakPengguna(Page page);

    List<Hak> getListhakPaging(Page page);

    int getBanyakHak(Page page);

//    void updatePengguna(Pengguna pengguna);
//
//    void deletePengguna(Pengguna pengguna);

}
