import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author MARTHA
 */

public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private List<MataKuliah> mataKuliahList;
    private static int jumlahMahasiswa = 0;

    public Mahasiswa(String nama, String nim, String prodi) {
        if (!validNIM(nim)) {
            System.out.println("NIM tidak valid: " + nim);
            this.nama = null;
            this.nim = null;
            this.prodi = null;
        } else {
            this.nama = nama;
            this.nim = nim;
            this.prodi = prodi;
            jumlahMahasiswa++;
        }
        this.mataKuliahList = new ArrayList<>();
    }

    public void tambahMataKuliah(MataKuliah mk) {
        if (mk != null && mk.isValid()) {
            mataKuliahList.add(mk);
        }
    }

    public void tampilkanBiodata() {
        if (nama == null || nim == null || prodi == null) {
            System.out.println("Data mahasiswa tidak valid");
            return;
        }
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Mata Kuliah:");
        for (MataKuliah mk : mataKuliahList) {
            System.out.println("- " + mk.getInfo());
        }
        System.out.println();
    }

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    public static boolean validNIM(String nim) {
        return nim != null && nim.startsWith("23") && nim.length() == 10;
    }
}
