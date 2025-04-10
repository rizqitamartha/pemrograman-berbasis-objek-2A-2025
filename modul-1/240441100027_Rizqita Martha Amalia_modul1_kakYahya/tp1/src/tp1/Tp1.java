package tp1;

class manusia{
    String nama;
    String alamat;
    int umur;
    
    manusia(String nama, String alamat, int umur){
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }
    
    void berjalan(){
        System.out.println("Nama:" + nama + "Alamat:" + alamat + "Umur:" + umur + "Dia sedang berjalan");    
    }
    
    void berlari(){
        System.out.println("Nama:" + nama + "Alamat:" + alamat + "Umur:" + umur + "Dia sedang berlari");
    }
}

public class Tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manusia manusia1 = new manusia("Afi", "Mojokerto", 17);
        manusia manusia2 = new manusia("Dika", "Lamongan", 20);
        manusia manusia3 = new manusia("Santi", "Tuban", 28);
        manusia manusia4 = new manusia("Wahyu", "Jombang", 19);
        manusia manusia5 = new manusia("Afifah", "Kediri", 10);
        
        manusia1.berjalan();
        manusia2.berlari();
        manusia3.berjalan();
        manusia4.berlari();
        manusia5.berlari();
    }    
}
