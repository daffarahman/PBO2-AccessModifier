package akademik;

import java.time.LocalDate;

import civitas.Civitas;

public class Dosen extends Civitas {
    public Dosen(String nidn, String nama, LocalDate tanggalLahir) {
        super(nidn, nama, tanggalLahir);
    }

    public MataKuliah buatMK(String kode, String nama, int sks) {
        MataKuliah mk = new MataKuliah();
        mk.kode = kode;
        mk.nama = nama;
        mk.sks = sks;
        return mk;
    }
}
