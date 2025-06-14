package peminjaman_buku;

/**
 *
 * @author MARTHA
 */
public class bukuFiksi implements peminjaman, reservasi{
    @Override
    public void pinjam(String nama){
       System.out.println(nama + " meminjam buku fiksi.");
    }

    public void pesan(String nama) {
        System.out.println(nama + " mereservasi buku fiksi."); 
    }
}
