package tp2;
import java.util.Scanner;

class mahasiswa{
    String nama;
    String nim;
    String jurusan;
    String alamat;
    
    mahasiswa (String nama, String nim, String jurusan, String alamat){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }
    
    void mahasiswa(){
        System.out.println("Nama" + nama);
        System.out.println("NIM" + nim);
        System.out.println("Jurusan" + jurusan);
        System.out.println("Alamat" + alamat);
    }
}


public class Tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        mahasiswa[] mahasiswaArray = new mahasiswa[3]; // Array untuk menyimpan 3 objek mahasiswa

        // Mengambil input dari pengguna untuk 3 mahasiswa
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Jurusan: ");
            String jurusan = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();

            // Membuat objek Mahasiswa dan menyimpannya dalam array
            mahasiswaArray[i] = new mahasiswa(nama, nim, jurusan, alamat);
            System.out.println(); // Untuk memberi jarak antara input
        }

        // Menampilkan informasi semua mahasiswa
        System.out.println("Data Mahasiswa:");
        for (mahasiswa mhs : mahasiswaArray) {
            mhs.mahasiswa();
        }
    }
    
}
