package akademik;

public class MataKuliah {
    protected String kode;
    public String nama;
    int sks;

    public MataKuliah() {
    }

    public void getInfo() {
        System.out.println(String.format("MK: (%s) %s %d sks", this.kode, this.nama, this.sks));
    }
}
