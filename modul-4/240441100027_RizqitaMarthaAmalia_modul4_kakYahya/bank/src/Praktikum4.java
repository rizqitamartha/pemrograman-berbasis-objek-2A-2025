/**
 *
 * @author MARTHA
 */
import java.util.Scanner;
/**
 *
 * @author User
 */
import java.util.ArrayList;
public class Praktikum4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        bank bankku = new bank();
        boolean jalan = true;

        while (jalan) {
            System.out.println("\n=== MENU BANK ===");
            System.out.println("1. Tambah Rekening");
            System.out.println("2. Lihat Semua Rekening");
            System.out.println("3. Setor Uang");
            System.out.println("4. Tarik Uang");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            int pilih = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilih) {
                case 1:
                    System.out.print("Nomor Rekening: ");
                    String norek = input.nextLine();
                    System.out.print("Nama Pemilik: ");
                    String nama = input.nextLine();
                    System.out.print("Saldo Awal: ");
                    double saldo = input.nextDouble();
                    input.nextLine();
                    rekeningbank baru = new rekeningbank(norek, nama, saldo);
                    bankku.tambahRekening(baru);
                    break;

                case 2:
                    System.out.println("\nDaftar Semua Rekening:");
                    bankku.tampilkanSemuaRekening();
                    break;

                case 3:
                    System.out.print("Masukkan No Rekening: ");
                    String rekSetor = input.nextLine();
                    rekeningbank rSetor = bankku.cariRekening(rekSetor);
                    if (rSetor != null) {
                        System.out.print("Jumlah Setor: ");
                        double jmlSetor = input.nextDouble();
                        rSetor.setor(jmlSetor);
                    } else {
                        System.out.println("Rekening tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan No Rekening: ");
                    String rekTarik = input.nextLine();
                    rekeningbank rTarik = bankku.cariRekening(rekTarik);
                    if (rTarik != null) {
                        System.out.print("Jumlah Tarik: ");
                        double jmlTarik = input.nextDouble();
                        rTarik.tarik(jmlTarik);
                    } else {
                        System.out.println("Rekening tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih.");
                    jalan = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }

}
