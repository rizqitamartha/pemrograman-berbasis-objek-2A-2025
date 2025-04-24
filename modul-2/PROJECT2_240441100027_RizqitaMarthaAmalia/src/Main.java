/**
 *
 * @author MARTHA
 */

public class Main {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("SI224", "Desain Manajemen Jaringan", 3);
        MataKuliah mk2 = new MataKuliah("SI223", "Pengantar Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("UNG121", "Bahasa Inggris", 2);
        MataKuliah mk4 = new MataKuliah("SI225", "Pemrograman Berbasis Web", 4);
        MataKuliah mk5 = new MataKuliah("SI226", "E-Bussines dan E-Commerce", 3);
        MataKuliah mk6 = new MataKuliah("SI221", "Analisa Proses  Bisnis", 2);
        MataKuliah mk7 = new MataKuliah("SI225", "Pemrograman BErbasis Objek", 4);  
        MataKuliah mk8 = new MataKuliah("UNG108", "Pancasila", 2);       

        Mahasiswa m1 = new Mahasiswa("Santi", " 2398777001", " Sistem Informasi");
        Mahasiswa m2 = new Mahasiswa("Tito", " 2355544009",  " Sistem Informasi");
        Mahasiswa m3 = new Mahasiswa("Evi", " 2344871002", " Sistem Informasi");
        Mahasiswa m4 = new Mahasiswa("Angel", "2309981004", "Sistem Informasi");
        Mahasiswa m5 = new Mahasiswa("Putri", "2334400112", "Sistem Informasi");
        Mahasiswa m6 = new Mahasiswa("Udin", "2308754006", "Sistem Informasi");

        m1.tambahMataKuliah(mk1);
        m1.tambahMataKuliah(mk2);
        m1.tambahMataKuliah(mk3);
        m1.tambahMataKuliah(mk4);

        m2.tambahMataKuliah(mk1);
        m2.tambahMataKuliah(mk3);
        m2.tambahMataKuliah(mk5);
        m2.tambahMataKuliah(mk7); 

        m3.tambahMataKuliah(mk2);
        m3.tambahMataKuliah(mk3);
        m3.tambahMataKuliah(mk8); 
        m3.tambahMataKuliah(mk5);

        m4.tambahMataKuliah(mk1);
        m4.tambahMataKuliah(mk2);
        m4.tambahMataKuliah(mk3);
        m4.tambahMataKuliah(mk6);

        m5.tambahMataKuliah(mk2);
        m5.tambahMataKuliah(mk3);
        m5.tambahMataKuliah(mk4);
        m5.tambahMataKuliah(mk5);

        m6.tambahMataKuliah(mk1);
        m6.tambahMataKuliah(mk4);
        m6.tambahMataKuliah(mk5);
        m6.tambahMataKuliah(mk6);

        Kampus kampus = new Kampus("Universitas 11 ", "Sidoarjo");

        m1.tampilkanBiodata();
        m2.tampilkanBiodata();
        m3.tampilkanBiodata();
        m4.tampilkanBiodata();
        m5.tampilkanBiodata();
        m6.tampilkanBiodata();

        kampus.tampilkanInfoKampus();
    }
}