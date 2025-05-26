abstract class Mobil {
    abstract void nyalakan_mesin();
    abstract void matikan_mesin();
}


class MobilSport extends Mobil {
    @Override
    void nyalakan_mesin() {
        System.out.println("Mobil sport dinyalakan dengan suara menggelegar!");
    }

    @Override
    void matikan_mesin() {
        System.out.println("Mobil sport dimatikan dengan halus.");
    }
}


class MobilSedan extends Mobil {
    @Override
    void nyalakan_mesin() {
        System.out.println("Mobil sedan dinyalakan secara halus.");
    }

    @Override
    void matikan_mesin() {
        System.out.println("Mobil sedan dimatikan dengan aman.");
    }
}

/**
 *
 * @author MARTHA
 */
public class DemoMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MobilSport sport = new MobilSport();
        sport.nyalakan_mesin();
        sport.matikan_mesin();

        System.out.println(); 

        MobilSedan sedan = new MobilSedan();
        sedan.nyalakan_mesin();
        sedan.matikan_mesin();
    }
    
}
