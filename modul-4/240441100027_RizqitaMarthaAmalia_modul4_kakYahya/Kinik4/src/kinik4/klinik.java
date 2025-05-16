package kinik4;

/**
 *
 * @author MARTHA
 */
import java.util.ArrayList;

public class klinik {
    private ArrayList<pasien> daftarPasien;

    public klinik() {
        daftarPasien = new ArrayList<>();
    }

    public void tambahPasien(pasien p) {
        daftarPasien.add(p);
        System.out.println("Pasien " + p.getNama() + " berhasil ditambahkan.");
    }

    public void tampilkanSemuaPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada pasien yang terdaftar.");
        } else {
            for (pasien p : daftarPasien) {
                p.tampilkan();
            }
        }
    }

}
