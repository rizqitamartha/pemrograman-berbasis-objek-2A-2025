package mobil;

/**
 *
 * @author MARTHA
 */
import java.util.ArrayList;

public abstract class manajemenMobil extends mobil{
    private ArrayList<mobil> daftarMobil;

    public manajemenMobil() {
        daftarMobil = new ArrayList<>();
    }

    public void tambahMobil(mobil mobil) {
        daftarMobil.add(mobil);
    }

    public void operasikanSemuaMobil() {
        for (mobil mobil : daftarMobil) {
            mobil.nyalakanMesin();
            mobil.matikanMesin();
        }
    }
}
