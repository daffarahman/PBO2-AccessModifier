package civitas;

import java.time.LocalDate;

public class Civitas {

    public static String universitas = "Universitas JMK 48 Ngawi";

    protected String id;
    public String nama;
    private LocalDate tanggalLahir;
    
    public Civitas(String id, String nama, LocalDate tanggalLahir) {
        this.id = id;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    protected String getTanggalLahir() {
        return this.tanggalLahir.toString();
    }

    public int getUmur() {
        return LocalDate.now().getYear() - this.tanggalLahir.getYear();
    }
}
