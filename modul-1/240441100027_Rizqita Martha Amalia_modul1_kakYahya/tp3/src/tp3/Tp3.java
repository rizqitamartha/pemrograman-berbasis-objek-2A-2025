package tp3;
import java.util.Random;
import java.util.ArrayList;


class harimau{
    String nama, ras;
    int umur;
    
    harimau(String nama, String ras, int umur){
        this.nama = nama;
        this.ras = ras;
        this.umur = umur;
    }
    
    void bersuara(){
        System.out.println ("Nama" + nama + "Ras" + ras + "Umur" + umur + "Suaranya harimaww harimaww");
    }
    
    void infoHewan(){
        System.out.println ("Harimau itu namanya" + nama + "Berumur" + umur + "Suaranya harimaww harimaww");
    }
}

class kucing{
    String nama, warna;
    int umur;
    
    kucing(String nama, String warna, int umur){
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
    }
    
    void bersuara(){
        System.out.println ("Nama" + nama + "Warna" + warna + "Umur" + umur + "Suaranya meong meong");
    }
    
    void infoHewan(){
        System.out.println ("Kucing itu namanya" + nama + "Berumur" + umur + "Suaranya meong meong");
    }
}

class ikan{
    String nama, jenis;
    int umur;
    
    ikan(String  nama, String jenis, int umur){
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }
    
    void bersuara(){
        System.out.println ("nama" + nama + "Jenis" + jenis + "Umur" + umur + "Tidak ada suara");
    }
    
    void infoHewan(){
        System.out.println ("Ikan itu namanya" + nama + "Berumur" + umur + "Tidak ada suara");
    }
}


public class Tp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] namaharimau = {"Simba"};
        String[] rasharimau = {"Sumatra"};
        String[] namakucing = {"Charlie"};
        String[] warnakucing = {"Abu"};
        String[] namaikan = {"Cucut"};
        String[] jenisikan = {"Air Sungai"};
        
        Random rand = new Random();
        ArrayList<Object> hewanList = new ArrayList<>();
        
        for (int i = 0; i < 1; i++) {
            harimau harimau = new harimau(namaharimau[i], rasharimau[i], rand.nextInt(10) + 1);
            kucing kucing = new kucing(namakucing[i], warnakucing[i], rand.nextInt(10) + 1);
            ikan ikan = new ikan(namaikan[i], jenisikan[i], rand.nextInt(10));
            
            hewanList.add(harimau);
            hewanList.add(kucing);
            hewanList.add(ikan);
        }
        
        System.out.println("Total hewan yang dibuat: " + hewanList.size());
        for (Object hewan : hewanList) {
            if (hewan instanceof harimau) {
                harimau h = (harimau) hewan;
                h.bersuara();
                h.infoHewan();
            } else if (hewan instanceof kucing) {
                kucing k = (kucing) hewan;
                k.infoHewan();
                k.bersuara();
            } else if (hewan instanceof ikan) {
                ikan i = (ikan) hewan;
                i.infoHewan();
                i.bersuara();
            }
        }
    }
}
