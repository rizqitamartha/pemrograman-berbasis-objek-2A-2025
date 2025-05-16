package kinik4;

/**
 *
 * @author MARTHA
 */
public class pasien {
    private String nama;
    private int umur;
    private String keluhan;

    public pasien(String nama, int umur, String keluhan) {
        this.nama = nama;
        this.umur = umur;
        this.keluhan = keluhan;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public void tampilkan() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + ", Keluhan: " + keluhan);
    }

}
