/**
 *
 * @author MARTHA
 */
public class Kampus {
    private String nama;
    private String alamat;
    private static int totalMahasiswa = 0;

    public Kampus(String nama, String alamat) {
        if (!validNamaKampus(nama)) {
            System.out.println("Nama kampus tidak valid: " + nama);
            this.nama = null;
            this.alamat = null;
        } else {
            this.nama = nama;
            this.alamat = alamat;
        }

        totalMahasiswa = Mahasiswa.getJumlahMahasiswa();
    }

    public static boolean validNamaKampus(String nama) {
        return nama != null && !nama.matches(".\\d."); // tidak mengandung angka
    }

    public void tampilkanInfoKampus() {
        if (nama == null || alamat == null) {
            System.out.println("Informasi kampus tidak valid.\n");
            return;
        }

        System.out.println("===== INFORMASI KAMPUS =====");
        System.out.println("Nama Kampus       : " + nama);
        System.out.println("Alamat Kampus     : " + alamat);
        System.out.println("Total Mahasiswa   : " + totalMahasiswa);
        System.out.println("Status Validasi   : " + (validNamaKampus(nama) ? "Valid" : "Tidak Valid"));
        System.out.println();
    }
}
