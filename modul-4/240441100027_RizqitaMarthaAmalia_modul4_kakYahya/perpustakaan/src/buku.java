/**
 *
 * @author MARTHA
 */
public class buku {
    private String judul;
    private String penulis;
    private int jumlahHalaman;

    public buku(String judul, String penulis, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        setJumlahHalaman(jumlahHalaman);
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        if (jumlahHalaman < 1) {
            this.jumlahHalaman = 0;
        } else {
            this.jumlahHalaman = jumlahHalaman;
        }
    }

    public void tampilkan() {
        System.out.println("Judul: " + judul + ", Penulis: " + penulis + ", Halaman: " + jumlahHalaman);
    }
}
