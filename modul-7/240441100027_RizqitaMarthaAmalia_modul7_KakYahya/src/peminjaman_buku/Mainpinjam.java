package peminjaman_buku;

/**
 *
 * @author MARTHA
 */
import java.util.Scanner;
public class Mainpinjam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        sistemPerpustakaan sistem = new sistemPerpustakaan();

        System.out.print("Masukkan nama pengguna: ");
        String nama = input.nextLine();

        System.out.println("Pilih jenis buku:");
        System.out.println("1. Buku Fiksi");
        System.out.println("2. Buku Referensi");
        System.out.print("Pilihan Anda: ");
        int jenis = input.nextInt();

        if (jenis == 1) {
            bukuFiksi fiksi = new bukuFiksi();
            System.out.println("1. Pinjam");
            System.out.println("2. Reservasi");
            System.out.print("Pilihan: ");
            int aksi = input.nextInt();

            if (aksi == 1) {
                fiksi.pinjam(nama);
                sistem.tambahPinjam("Buku Fiksi", nama);
            } else if (aksi == 2) {
                fiksi.pesan(nama);
                sistem.tambahReservasi("Buku Fiksi", nama);
            }

        } else if (jenis == 2) {
            bukuReferensi ref = new bukuReferensi();
            ref.pesan(nama);
            sistem.tambahReservasi("Buku Referensi", nama);
        } else {
            System.out.println("Pilihan tidak tersedia.");
        }

        System.out.println("--- Rekap Data ---");
        sistem.tampilkanSemua();
    }
    
}
