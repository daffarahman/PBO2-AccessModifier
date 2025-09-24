package civitas;

import java.time.LocalDate;

public class Mahasiswa extends Civitas{
    private float ipk;

    public Mahasiswa(String nim, String nama, LocalDate tanggalLahir) {
        super(nim, nama, tanggalLahir);
        this.ipk = 0f;
    }

    public void setIPK(float ipk) {
        this.ipk = ipk;
    }

    public float getIPK() {
        return this.ipk;
    }

    public void getKTM() {
        System.out.println(
            String.format("===== Kartu Tanda Mahasiswa %s =====\n", Civitas.universitas) +
            String.format("Nama : %s\n", this.nama) +
            String.format("Nim  : %.2f\n", this.ipk) +
            String.format("TL   : %s", this.getTanggalLahir())
        );
    }
}

