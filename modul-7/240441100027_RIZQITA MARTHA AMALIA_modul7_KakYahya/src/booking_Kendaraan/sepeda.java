package booking_Kendaraan;

/**
 *
 * @author MARTHA
 */
public class sepeda implements booking{
    public void pesan(String nama, int umur){
        System.out.println(nama + "berhasil memesan sepeda");
    }

    @Override
    public double hitungBiaya(int hari) {
        return hari * 10000;
    }
    
}
