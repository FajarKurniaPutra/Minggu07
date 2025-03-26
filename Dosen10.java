public class Dosen10 {
    String kode;
    String nama;
    boolean jenisKelamin; 
    int usia;

    public Dosen10 (String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    public void tampil() {
        String jkStr = (jenisKelamin) ? "Laki-laki" : "Perempuan";
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", Jenis Kelamin: " + jkStr + ", Usia: " + usia);
    }
}

