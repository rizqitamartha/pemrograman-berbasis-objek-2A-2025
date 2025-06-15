package booking_Kendaraan;

/**
 *
 * @author MARTHA
 */
import java.util.Scanner;

public abstract class mobil implements booking, perhitungan_biaya{
  protected Scanner scanner = new Scanner(System.in);

    @Override
    public void pesan(String nama, int umur) {
        while (umur < 21) {
            System.out.println("Maaf, usia minimal sewa mobil adalah 21 tahun.");
            System.out.print("Silakan masukkan ulang usia Anda: ");
            umur = scanner.nextInt();
            scanner.nextLine(); 
        }
        System.out.println(nama + " : berhasil memesan mobil.");
    }

    public double hitungBiaya(int hari) {
        return hari * 250000 + biaya();
    }

    public double biaya() {
        return 50000;
    }
}
