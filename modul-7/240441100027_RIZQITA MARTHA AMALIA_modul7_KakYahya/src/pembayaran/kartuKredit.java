package pembayaran;

/**
 *
 * @author MARTHA
 */
public class kartuKredit implements pembayaran{
    @Override
    public double jumlah (double jumlah){
        double biayaAdmin = 0.02;
        return jumlah + (jumlah * biayaAdmin);
    }
}
