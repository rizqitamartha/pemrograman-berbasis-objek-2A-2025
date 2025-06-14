
package pembayaran;

/**
 *
 * @author MARTHA
 */
import java.util.Scanner;
public class Mainpembayaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total belanja (Rp): ");
        double jumlah = input.nextDouble();

        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet");
        System.out.print("Pilihan Anda: ");
        int pilihan = input.nextInt();

        pembayaran metode;

        switch (pilihan) {
            case 1:
                metode = new tunai();
                break;
            case 2:
                metode = new kartuKredit();
                break;
            case 3:
                metode = new ewallet();
                break;
            default:
                System.out.println("Metode tidak valid.");
                return;
        }

        double total = metode.jumlah(jumlah);
        System.out.println("Total yang harus dibayar: Rp " + total);
    }
    
}
