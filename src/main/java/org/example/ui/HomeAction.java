package org.example.ui;


import org.example.model.Hak;
import org.example.model.Pengguna;
import org.example.services.Luas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class HomeAction {
    @Autowired
    private Luas luasimpl;

    @GetMapping("/listpengguna")
    public ResponseEntity<List<Pengguna>> getListPengguna() {

        return ResponseEntity.ok(luasimpl.getListpengguna());
    }

    @GetMapping("/listpenggunaweb")
    public String getListPenggunaWeb(Model model){
        model.addAttribute("lp",luasimpl.getListpengguna());
        return "home";

    }

    @PostMapping ("/simpanpengguna")
    public ResponseEntity<Map<String, Object>> addPengguna(@RequestBody Pengguna pgn){
        Map<String, Object> hasil = new HashMap<>();
        luasimpl.simpanPengguna(pgn);
        hasil.put("kode", 200);
        hasil.put("status", "Simpan Berhasil");
        return ResponseEntity.ok(hasil);

    }



    @GetMapping("/getpengguna/{id}")
    public ResponseEntity<Pengguna> getPengguna(@PathVariable Integer id) {
        return ResponseEntity.ok(luasimpl.getPengguna(id));
    }

    @PostMapping ("/updatepengguna")
    public ResponseEntity<Map<String, Object>> updatePengguna(@RequestBody Pengguna pgn){
        Map<String, Object> hasil = new HashMap<>();
        luasimpl.updatePengguna(pgn);
        hasil.put("kode", 200);
        hasil.put("status", "Simpan Berhasil");
        return ResponseEntity.ok(hasil);

    }

    @GetMapping("/listhak")
    public ResponseEntity<List<Hak>> getListHak() {

        return ResponseEntity.ok(luasimpl.getListhak());
    }

    @GetMapping("/gethak/{id}")
    public ResponseEntity<Hak> getHak(@PathVariable Integer id) {
        return ResponseEntity.ok(luasimpl.getHak(id));
    }

    @PostMapping ("/simpanhak")
    public ResponseEntity<Map<String, Object>> addHak(@RequestBody Hak pgn){
        Map<String, Object> hasil = new HashMap<>();
        luasimpl.simpanHak(pgn);
        hasil.put("kode", 200);
        hasil.put("status", "Simpan Berhasil");
        return ResponseEntity.ok(hasil);

    }

    @PostMapping ("/updatehak")
    public ResponseEntity<Map<String, Object>> updateHak(@RequestBody Hak pgn){
        Map<String, Object> hasil = new HashMap<>();
        luasimpl.updateHak(pgn);
        hasil.put("kode", 200);
        hasil.put("status", "Simpan Berhasil");
        return ResponseEntity.ok(hasil);

    }



}
