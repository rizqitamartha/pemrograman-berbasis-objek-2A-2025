package peminjaman_buku;

/**
 *
 * @author MARTHA
 */
import java.util.ArrayList;
public class sistemPerpustakaan {
    private ArrayList<String> daftarPinjam = new ArrayList<>();
    private ArrayList<String> daftarReservasi = new ArrayList<>();

    public void tambahPinjam(String buku, String nama) {
        daftarPinjam.add(buku + " oleh " + nama);
    }

    public void tambahReservasi(String buku, String nama) {
        daftarReservasi.add(buku + " oleh " + nama);
    }

    public void tampilkanSemua() {
        System.out.println("Data Peminjaman:");
        for (String s : daftarPinjam) System.out.println(s);

        System.out.println("Data Reservasi:");
        for (String s : daftarReservasi) System.out.println(s);
    }
}
