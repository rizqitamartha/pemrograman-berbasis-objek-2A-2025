/**
 *
 * @author MARTHA
 */
public class MataKuliah {
    private String kode;
    private String nama;
    private Integer sks;

    public MataKuliah(String kode, String nama, int sks) {
        if (!validSKS(sks)) {
            this.kode = null;
            this.nama = null;
            this.sks = null;
        } else {
            this.kode = kode;
            this.nama = nama;
            this.sks = sks;
        }
    }

    public static boolean validSKS(int sks) {
        return sks == 2 || sks == 3;
    }

    public String getInfo() {
        if (kode == null || nama == null || sks == null) {
            return "Mata kuliah tidak valid (SKS salah)";
        }
        return nama + " (" + kode + ", " + sks + " SKS)";
    }

    public boolean isValid() {
        return kode != null && nama != null && sks != null;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public Integer getSks() { return sks; }
}