package mahasiswa1;

class mahasiswa{
    String nama;
    String nim;
    
    public mahasiswa(String nama, String nim){
        this.nama=nama;
        this.nim=nim;
    }
    
    public void infoMahasiswa(){
        System.out.println("nama: " + nama + "NIM: " + nim);
    }
}

class mahasiswaRegular extends mahasiswa{
    String kelas;
    
    public mahasiswaRegular(String nama, String nim, String kelas) {
        super(nama, nim);
        this.kelas=kelas;
    }
    
    public void infoRegular(){
        System.out.println("Nama: " + nama + " NIM: " + nim + " Kelas: " + kelas);
    }   
}

class mahasiswaBeasiswa extends mahasiswa{
    String jenisBeasiswa;
    
    public mahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim);
        this.jenisBeasiswa=jenisBeasiswa;
    }
    
    public void infoBeasiswa(){
        System.out.println("nama: " + nama + " NIM: " + nim + " Jenis Beasiswa: " + jenisBeasiswa);
    }
    
}

/**
 *
 * @author MARTHA
 */
public class Mahasiswa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mahasiswaRegular mhs1 = new mahasiswaRegular("Sheva Alifia", "22033190", "ES-C");
        mahasiswaRegular mhs2 = new mahasiswaRegular("Rizqina K", "23088022", "PG-D");
        
        System.out.println("Data Mahasiswa Reguler");
        mhs1.infoRegular();
        mhs2.infoRegular();
        
        mahasiswaBeasiswa mhs3 = new mahasiswaBeasiswa("Ayu Angelina", "24011811", "Tahfidz Qur'an");
        mahasiswaBeasiswa mhs4 = new mahasiswaBeasiswa("Aisyah Wulan", "20966233", "KIP-K");
        
        System.out.println("Data Mahasiswa Beasiswa");
        mhs3.infoBeasiswa();
        mhs4.infoBeasiswa();
    }   
}
