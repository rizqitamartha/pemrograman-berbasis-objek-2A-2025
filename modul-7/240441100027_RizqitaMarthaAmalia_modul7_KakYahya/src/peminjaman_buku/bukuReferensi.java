package peminjaman_buku;

/**
 *
 * @author MARTHA
 */
public class bukuReferensi implements reservasi{
    @Override
    public void pesan(String nama) {
        System.out.println(nama + " reservasi buku ini");
    }   
}
