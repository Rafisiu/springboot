package org.example.services;

import org.example.model.Hak;
import org.example.model.Pengguna;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("luasimpl")
public class LuasimplDua implements Luas {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public double luasPersegi(double panjang, double lebar) {
        return (panjang * lebar)/3;
    }

    @Override
    public List<Pengguna> getListpengguna() {
        return jdbcTemplate.query("SELECT id, nama_pengguna, email FROM pengguna ", (rs,  rowNum) -> {
            Pengguna pengguna = new Pengguna();
            pengguna.setId(rs.getInt("id"));
            pengguna.setNamaPengguna(rs.getString("nama_pengguna"));
            pengguna.setEmail(rs.getString("email"));
            return pengguna;
        });
    }

    @Override
    public void simpanPengguna(Pengguna pengguna) {
        jdbcTemplate.update("INSERT INTO public.pengguna(\n" +
                "\tnama_pengguna, email)\n" +
                "\tVALUES (?, ?);",pengguna.getNamaPengguna(),pengguna.getEmail());
    }

    @Override
    public void updatePengguna(Pengguna pengguna) {
        jdbcTemplate.update("UPDATE pengguna SET nama_pengguna = ?, email = ? WHERE id = ?",pengguna.getNamaPengguna(),pengguna.getEmail(),pengguna.getId());
    }

    @Override
    public Pengguna getPengguna(int id) {
        return jdbcTemplate.queryForObject("SELECT id, nama_pengguna, email FROM pengguna where id = ?", (rs,  rowNum) -> {
            Pengguna pengguna = new Pengguna();
            pengguna.setId(rs.getInt("id"));
            pengguna.setNamaPengguna(rs.getString("nama_pengguna"));
            pengguna.setEmail(rs.getString("email"));
            return pengguna;
        }, id );
    }

    @Override
    public Hak getHak(int id) {
        return jdbcTemplate.queryForObject("SELECT id, nama_hak_akses FROM hak_akses where id = ?", (rs,  rowNum) -> {
            Hak hak = new Hak();
            hak.setId(rs.getInt("id"));
            hak.setNamaHak(rs.getString("nama_hak_akses"));
            return hak;
        }, id );
    }

    @Override
    public List<Hak> getListhak() {
        return jdbcTemplate.query("SELECT id, nama_hak_akses FROM hak_akses", (rs,  rowNum) -> {
            Hak hak = new Hak();
            hak.setId(rs.getInt("id"));
            hak.setNamaHak(rs.getString("nama_hak_akses"));
            return hak;
        });
    }

    @Override
    public void simpanHak(Hak hak) {
        jdbcTemplate.update("INSERT INTO public.hak_akses(\n" +
                "\tnama_hak_akses)\n" +
                "\tVALUES (?);",hak.getNamaHak());
    }

    @Override
    public void updateHak(Hak hak) {
        jdbcTemplate.update("UPDATE hak_akses SET nama_hak_akses = ? WHERE id = ?",hak.getNamaHak(),hak.getId());
    }


//    @Override
//    public void updatePengguna(Pengguna pengguna) {
//        jdbcTemplate.update("UPDATE pengguna(\n" +
//                "\tset nama_pengguna, email)\n" +
//                "\tVALUES (?, ?);",pengguna.getNamaPengguna(),pengguna.getEmail());
//    }
//
//    @Override
//    public void deletePengguna(Pengguna pengguna) {
//        jdbcTemplate.update("INSERT INTO pengguna(\n" +
//                "\tnama_pengguna, email)\n" +
//                "\tVALUES (?, ?);",pengguna.getNamaPengguna(),pengguna.getEmail());
//    }
}
