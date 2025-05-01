package perpustakaan1;
import java.util.ArrayList;
import java.util.Scanner;

class Buku{
    String judul;
    String penulis;
    
    public Buku(String judul, String penulis){
        this.judul=judul;
        this.penulis=penulis;
    }
    
    public void info(){
        System.out.println("Judul: " + judul + " Penulis: " + penulis);
    }
}

class BukuFiksi extends Buku{
    String genre;
    
    public BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre=genre;
    }
    
    public void infoFiksi(){
        System.out.println("Judul: " + judul + " Penulis: " + penulis + " Genre: " + genre);
    }   
}

class  BukuNonFiksi extends Buku{
    String topik;
    
    public BukuNonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik=topik;
    }
    
    public void infoNonFiksi(){
        System.out.println("Judul: " + judul + " Penulis: " + penulis + " Topik: " + topik);
    }    
}

class Perpustakaan {
            ArrayList<BukuFiksi> koleksiFiksi = new ArrayList<>();
            ArrayList<BukuNonFiksi> koleksiNonFiksi = new ArrayList<>();

            void tambahBukuFiksi(BukuFiksi buku) {
                koleksiFiksi.add(buku);
            }

            void tambahBukuNonFiksi(BukuNonFiksi buku) {
                koleksiNonFiksi.add(buku);
            }

            void tampilkanKoleksi() {
                System.out.println("--- Daftar Buku Fiksi ---");
                for (BukuFiksi buku : koleksiFiksi) {
                    buku.infoFiksi();
                }

                System.out.println("--- Daftar Buku Non-Fiksi ---");
                for (BukuNonFiksi buku : koleksiNonFiksi) {
                    buku.infoNonFiksi();
                }
            }
        }


/**
 *
 * @author MARTHA
 */
public class Perpustakaan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan(); // Menggunakan class Perpustakaan, bukan Perpustakaan1

        while (true) {
            System.out.println("===== MENU PERPUSTAKAAN =====");
            System.out.println("1. Tambah Buku Fiksi");
            System.out.println("2. Tambah Buku Non-Fiksi");
            System.out.println("3. Tampilkan Semua Buku");
            System.out.print("Masukkan pilihan (1-3): ");
            int pilihan = input.nextInt();
            input.nextLine(); // Bersihkan newline

            if (pilihan == 1) {
                System.out.print("Judul: ");
                String judul = input.nextLine();
                System.out.print("Penulis: ");
                String penulis = input.nextLine();
                System.out.print("Genre: ");
                String genre = input.nextLine();
                BukuFiksi fiksi = new BukuFiksi(judul, penulis, genre);
                perpustakaan.tambahBukuFiksi(fiksi); // Menambahkan buku ke koleksi

            } else if (pilihan == 2) {
                System.out.print("Judul: ");
                String judul = input.nextLine();
                System.out.print("Penulis: ");
                String penulis = input.nextLine();
                System.out.print("Topik: ");
                String topik = input.nextLine();
                BukuNonFiksi nonFiksi = new BukuNonFiksi(judul, penulis, topik);
                perpustakaan.tambahBukuNonFiksi(nonFiksi); // Menambahkan buku ke koleksi

            } else if (pilihan == 3) {
                perpustakaan.tampilkanKoleksi(); // Memanggil method dari objek perpustakaan
            }
        }
    }
}
