/**
 *
 * @author MARTHA
 */
public interface PerangkatElektronik {
    void nyalakan();
    void matikan();
}

class lampu implements PerangkatElektronik{
    public void nyalakan(){
        System.out.println("Lampu menyala");
    }
    public void matikan(){
        System.out.println("Lampu mati");
    }
}

class MesinCuci implements PerangkatElektronik{

    @Override
    public void nyalakan() {
        
    }

    @Override
    public void matikan() {
        
    }
}
