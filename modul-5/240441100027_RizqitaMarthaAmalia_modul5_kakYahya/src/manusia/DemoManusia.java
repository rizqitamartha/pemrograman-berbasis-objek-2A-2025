package manusia;
abstract class Manusia{
    abstract void berbicara();
    abstract void bekerja();
    abstract void makan();
}

class Joko extends Manusia{

    @Override
    void berbicara() {
        System.out.println("Joko sedang belajar berbicara");
    }

    @Override
    void bekerja() {
        System.out.println("Joko bekerja untuk menafkahi keluarga");
    }

    @Override
    void makan() {
        System.out.println("Joko lagi malas makan");
    }  
}

class Beni extends Manusia{

    @Override
    void berbicara() {
        System.out.println("Beni tidak mau berbicara");
    }

    @Override
    void bekerja() {
        System.out.println("Beni hari ini tidak masuk kerja");
    }

    @Override
    void makan() {
        System.out.println("Beni suka makan bubur ayam🍚");
    } 
}

class Fani extends Manusia{

    @Override
    void berbicara() {
        System.out.println("Fani suka yapping");
    }

    @Override
    void bekerja() {
        System.out.println("Fani malas kerja");
    }

    @Override
    void makan() {
        System.out.println("Fani suka buang makanan");
    }  
}

class Jani extends Manusia{

    @Override
    void berbicara() {
        System.out.println("Jani sedang melatih kefasihan berbicara menggunakan bahasa luar");
    }

    @Override
    void bekerja() {
        System.out.println("Jani seorang wanita pekerja keras");
    }

    @Override
    void makan() {
        System.out.println("Jani suka makan berkalori rendah");
    }   
}

/**
 *
 * @author MARTHA
 */
public class DemoManusia {   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Joko joko = new Joko();
        Beni beni = new Beni();
        Fani fani = new Fani();
        Jani jani = new Jani();

        joko.berbicara();
        joko.bekerja();
        joko.makan();

        System.out.println();

        beni.berbicara();
        beni.bekerja();
        beni.makan();

        System.out.println();

        fani.berbicara();
        fani.bekerja();
        fani.makan();

        System.out.println();

        jani.berbicara();
        jani.bekerja();
        jani.makan();
    }
    
}
