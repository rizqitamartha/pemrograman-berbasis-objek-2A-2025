package booking_Kendaraan;

/**
 *
 * @author MARTHA
 */
import java.util.Scanner;
public class Mainbooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pemesan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.println("Pilih jenis kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Sepeda");
        System.out.print("Pilihan Anda: ");
        int pilihan = input.nextInt();

        booking kendaraan;
        switch (pilihan) {
            case 1:
                kendaraan = new mobil() {};
                break;
            case 2:
                kendaraan = new motor();
                break;
            case 3:
                kendaraan = new sepeda();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        kendaraan.pesan(nama, umur);

        System.out.print("Masukkan jumlah hari sewa: ");
        int hari = input.nextInt();
        System.out.println("Total biaya: Rp " + kendaraan.hitungBiaya(hari));
    }
    
}
