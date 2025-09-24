import civitas.*;

import java.time.LocalDate;

import akademik.*;

public class Main {
        public static void main(String[] args) {
        Dosen profAmba = new Dosen("JMK001", "Prof. Amba Singh", LocalDate.of(1969, 4, 20));
        Dosen pakImut = new Dosen("JMK002", "Si Imut, S.Kom.", LocalDate.of(2001, 9, 11));

        // Ini tidak bisa karena protected jadi hanya Dosen dan kelas di package civitas yang bisa akses
        // System.out.println(profAmba.getTanggalLahir());
        // System.out.println(pakImut.getTanggalLahir());
        
        // Jika ini bisa dipanggil
        System.out.println(profAmba.getUmur());
        System.out.println(pakImut.getUmur());

        // Dosen bisa membuat mata kuliah
        MataKuliah konsepPemrograman = profAmba.buatMK("KP101", "Konsep Pemrograman", 4);
        konsepPemrograman.getInfo();

        // Tidak bisa dilakukan karena sks termasuk ke default dan hanya bisa diakses di package akademik
        // System.out.println(konsepPemrograman.sks);

        // Tidak bisa dilakukan karena kode termasuk ke protected
        // System.out.println(konsepPemrograman.kode);

        Mahasiswa jamesBond = new Mahasiswa("L0124062", "James Bond", LocalDate.of(2005, 12, 30));
        jamesBond.getKTM();
        jamesBond.setIPK(3.69f);
        jamesBond.getKTM();
    }
}
