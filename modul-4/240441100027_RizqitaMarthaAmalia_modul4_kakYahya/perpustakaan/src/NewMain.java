
/**
 *
 * @author MARTHA
 */
import java.util.Scanner;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        perpustakaan p = new perpustakaan();
        boolean jalan = true;

        while (jalan) {
            System.out.println("\n=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Semua Buku");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            int pilih = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilih) {
                case 1:
                    System.out.print("Judul Buku: ");
                    String judul = input.nextLine();
                    System.out.print("Penulis: ");
                    String penulis = input.nextLine();
                    System.out.print("Jumlah Halaman: ");
                    int halaman = input.nextInt();
                    input.nextLine();

                    buku baru = new buku(judul, penulis, halaman);
                    p.tambahBuku(baru);
                    break;

                case 2:
                    System.out.println("\nDaftar Buku:");
                    p.tampilkanSemuaBuku();
                    break;

                case 3:
                    System.out.println("Terima kasih. Program selesai.");
                    jalan = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();

    }
    
}
