package mobil;

/**
 *
 * @author MARTHA
 */
public class mobilSedan extends mobil {
    @Override
    public void nyalakanMesin(){
        System.out.println("Mobil sedan dinyalakan secara halus");
    }
    
    @Override
    public void matikanMesin(){
        System.out.println("Mobil sedan dimatikan dengan aman");
    }
}
