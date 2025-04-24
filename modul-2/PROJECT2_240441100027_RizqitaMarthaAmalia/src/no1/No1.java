package no1;

class mahasiswa{
    String nama;
    String nim;
    String prodi;
    int matkul;
    
    mahasiswa(String nama, String nim, String prodi, int matkul){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.matkul = matkul;
    }
    
    void tampilkanBiodata() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Mata Kuliah yang diambil:" + matkul);
    }
    
    void tambahMatkul(String matkul){
        System.out.println( nama + " mengambil mata kuliah: " + matkul);
    }
    
}

/**
 *
 * @author MARTHA
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mahasiswa mahasiswa1 = new mahasiswa("Santi", " 2398777001", " Ekonomi Syariah", 4);
        mahasiswa1.tambahMatkul("Ekonomi Mikro, " + " Ekonomi Makro, " + " Pengantar Ekonomi, " + " Akuntansi");
        mahasiswa1.tampilkanBiodata();
        
        mahasiswa mahasiswa2 = new mahasiswa("Tito", " 2355544009",  " Teknik Mesin", 4);
        mahasiswa2.tambahMatkul("Sistem Kontrol, " + " Proses Manufaktur, " + " Matematika Teknik, " + " Mekanika Fluida");
        mahasiswa2.tampilkanBiodata();
        
        mahasiswa mahasiswa3 = new mahasiswa("Evi", " 2344871002", " Sistem Informasi", 4);
        mahasiswa3.tambahMatkul("Statistika & Probabilitas, " + " ALgoritma Pemrograman, " + " Manajemen & Organisasi, " + " Logika Eingneering");
        mahasiswa3.tampilkanBiodata();
        
        mahasiswa mahasiswa4 = new mahasiswa("Angel", "2409981004", "Pendidikan Biologi", 4);
        mahasiswa4.tambahMatkul("Biokimia, " + " Fisiologi Tumbuhan, " + " Evolusi, " + " Ekologi Hewan");
        mahasiswa4.tampilkanBiodata(); 
        
        mahasiswa mahasiswa5 = new mahasiswa("Putri", "2134400112", "Sosiologi", 4);
        mahasiswa5.tambahMatkul("Pengantar Sosiologi, " + " Teori Sosiologi, " + " Metode Penelitian, " + " Psikologi Sosial");
        mahasiswa5.tampilkanBiodata();
        
        mahasiswa mahasiswa6 = new mahasiswa("Udin", "2208754006", "Teknik Telekomunikasi", 4);
        mahasiswa6.tambahMatkul("Rekayasa Jaringan, " + " Jaringan Komunikasi Data, " + " Sistem Komunikasi Seluler, " + " Matematika Diskrit");
        mahasiswa6.tampilkanBiodata();
    }
    
}
