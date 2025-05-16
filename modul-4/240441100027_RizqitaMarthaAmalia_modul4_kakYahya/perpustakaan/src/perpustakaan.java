/**
 *
 * @author MARTHA
 */
import java.util.ArrayList;
public class perpustakaan {
    private ArrayList<buku> daftarBuku;

    public perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(buku b) {
        daftarBuku.add(b);
        System.out.println("Buku \"" + b.getJudul() + "\" berhasil ditambahkan.");
    }

    public void tampilkanSemuaBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku yang ditambahkan.");
        } else {
            for (buku b : daftarBuku) {
                b.tampilkan();
            }
        }
    }
}
