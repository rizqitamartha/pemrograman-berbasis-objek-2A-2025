package booking_Kendaraan;

/**
 *
 * @author MARTHA
 */
public class motor implements booking{
    @Override
    public void pesan(String nama, int umur){
        if (umur < 18) {
            System.out.println("Maaf, usia minimal sewa motor adalah 18 tahun.");
        } else {
            System.out.println(nama + " berhasil memesan motor.");
        }
    }

    public double hitungBiaya(int hari) {
        return hari * 50000;
    }
}
