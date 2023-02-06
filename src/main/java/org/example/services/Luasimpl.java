package org.example.services;

import org.example.model.Hak;
import org.example.model.Pengguna;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component("Luasimpl")
public class Luasimpl implements Luas{
    @Override
    public double luasPersegi(double panjang, double lebar) {
        return panjang*lebar;
    }

    @Override
    public List<Pengguna> getListpengguna() {
        return null;
    }

    @Override
    public void simpanPengguna(Pengguna pengguna) {

    }

    @Override
    public void updatePengguna(Pengguna pengguna) {

    }

    @Override
    public Pengguna getPengguna(int id) {
        return null;
    }

    @Override
    public Hak getHak(int id) {
        return null;
    }

    @Override
    public List<Hak> getListhak() {
        return null;
    }

    @Override
    public void simpanHak(Hak hak) {

    }

    @Override
    public void updateHak(Hak hak) {

    }

//    @Override
//    public void updatePengguna(Pengguna pengguna) {
//
//    }
//
//    @Override
//    public void deletePengguna(Pengguna pengguna) {
//
//    }
}
