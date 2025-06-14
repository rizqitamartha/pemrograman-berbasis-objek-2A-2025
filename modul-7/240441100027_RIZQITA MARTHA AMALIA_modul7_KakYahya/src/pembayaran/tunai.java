package pembayaran;

/**
 *
 * @author MARTHA
 */
public class tunai implements pembayaran{
    @Override
    public double jumlah(double jumlah){
        double diskon = 0.10;
        return jumlah - (jumlah * diskon);
    }  
}
