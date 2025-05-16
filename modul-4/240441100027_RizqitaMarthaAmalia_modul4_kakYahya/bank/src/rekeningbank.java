/**
 *
 * @author MARTHA
 */
public class rekeningbank {
    private String norek;
    private String namapemilik;
    private double saldo;

    public rekeningbank(String norek, String namapemilik, double saldo) {
        this.norek = norek;
        this.namapemilik = namapemilik;
        setSaldo(saldo);
    }

    public String getNorek() {
        return norek;
    }

    public String getNamapemilik() {
        return namapemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNorek(String norek) {
        this.norek = norek;
    }

    public void setNamapemilik(String namapemilik) {
        this.namapemilik = namapemilik;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setoran berhasil untuk " + namapemilik + ". Saldo sekarang: Rp " + saldo);
        } else {
            System.out.println("Jumlah setoran tidak valid.");
        }
    }

    public void tarik(double jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Penarikan oleh " + namapemilik + " sebesar Rp " + jumlah + " berhasil. Sisa saldo: Rp " + saldo);
        } else if (jumlah <= 0) {
            System.out.println("Jumlah penarikan tidak valid.");
        } else {
            System.out.println("Saldo tidak mencukupi untuk penarikan.");
        }
    }

    public void tampilkan() {
        System.out.println("No Rek: " + norek + ", Nama: " + namapemilik + ", Saldo: Rp " + saldo);
    }

}
