package org.example;

import org.example.config.Konfigurasi;
import org.example.model.Pelajaran;
import org.example.model.Pengguna;
import org.example.model.Siswa;
import org.example.services.Luas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = {"org.example.services", "org.example.ui"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);

//        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
////        appContext.scan("org.example.services");
//        appContext.register(Konfigurasi.class);
//        appContext.refresh();
//
//        Luas serviceLuas = (Luas) appContext.getBean("luasimpl");
//        Pengguna pengguna = new Pengguna();
//        pengguna.setId(4);
//        pengguna.setNamaPengguna(" empat ");
//        pengguna.setEmail("empat@gmail.com");
//        serviceLuas.simpanPengguna(pengguna);
//
//        System.out.println(" == "+serviceLuas.luasPersegi(10, 20));
//        List<Pengguna> listPengguna = serviceLuas.getListpengguna();
//        for (int i = 0; i < listPengguna.size(); i++){
//            System.out.println(" Nama & Email == "+listPengguna.get(i).getNamaPengguna() +", "+ listPengguna.get(i).getEmail());
//        }

//        List<Pelajaran> listPelajaran = new ArrayList<>();
//        Pelajaran pelajaran = new Pelajaran();
//        pelajaran.setIdPelajaran(1);
//        pelajaran.setNamapelajaran("matematika");
//        pelajaran.setNilai(90);
//        listPelajaran.add(pelajaran);
//
//        pelajaran = new Pelajaran();
//        pelajaran.setIdPelajaran(2);
//        pelajaran.setNamapelajaran("ips");
//        pelajaran.setNilai(80);
//        listPelajaran.add(pelajaran);
//
//        pelajaran = new Pelajaran();
//        pelajaran.setIdPelajaran(3);
//        pelajaran.setNamapelajaran("ipa");
//        pelajaran.setNilai(95);
//        listPelajaran.add(pelajaran);
//
//
//        List<Siswa> listSiswa = new ArrayList<>();
//        Siswa siswa = new Siswa();
//        siswa.setNamaSiswa("Budi");
//        siswa.setId(1);
//        siswa.setListpelajaran(listPelajaran);
//        listSiswa.add(siswa);
//
//        listPelajaran = new ArrayList<>();
//
//
//        pelajaran = new Pelajaran();
//        pelajaran.setIdPelajaran(1);
//        pelajaran.setNamapelajaran("matematika");
//        pelajaran.setNilai(70);
//        listPelajaran.add(pelajaran);
//
//
//        pelajaran = new Pelajaran();
//        pelajaran.setIdPelajaran(2);
//        pelajaran.setNamapelajaran("ips");
//        pelajaran.setNilai(100);
//        listPelajaran.add(pelajaran);
//
//
//        siswa = new Siswa();
//        siswa.setNamaSiswa("Tono");
//        siswa.setId(2);
//        siswa.setListpelajaran(listPelajaran);
//        listSiswa.add(siswa);
//
//
//
//        for (int i = 0; i < listSiswa.size() ; i++ ) {
//            System.out.println("nama : "+listSiswa.get(i).getNamaSiswa());
//            List<Pelajaran> listp = listSiswa.get(i).getListpelajaran();
//            for (int j = 0; j < listp.size() ; j++ ) {
//                System.out.println("nama pelajaran : "+listp.get(j).getNamapelajaran() + " "+ listp.get(j).getNilai());
//
//            }
//        }

    }
}