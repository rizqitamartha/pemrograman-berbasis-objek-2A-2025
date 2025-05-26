package mobil;

/**
 *
 * @author MARTHA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manajemenMobil manajemen = new manajemenMobil() {
            @Override
            void nyalakanMesin() {     
            }

            @Override
            void matikanMesin() {    
            }
        };
        mobil mobil1 = new mobilSport();   
        mobil mobil2 = new mobilSedan();   


        manajemen.tambahMobil(mobil1);
        manajemen.tambahMobil(mobil2);
        
        manajemen.operasikanSemuaMobil();

    }
    
}
