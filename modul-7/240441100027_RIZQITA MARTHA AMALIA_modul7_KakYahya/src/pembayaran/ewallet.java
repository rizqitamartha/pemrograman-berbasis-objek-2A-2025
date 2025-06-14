package pembayaran;

/**
 *
 * @author MARTHA
 */
public class ewallet implements pembayaran{
    @Override
    public double jumlah(double jumlah){
        double cashback = 0.02;
        return jumlah - (jumlah * cashback);
        
    }
}
