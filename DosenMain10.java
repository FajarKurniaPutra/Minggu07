import java.util.Scanner;

public class DosenMain10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen10 dataDosen = new DataDosen10();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting Usia ASC (Muda ke Tua) - Bubble Sort");
            System.out.println("4. Sorting Usia DSC (Tua ke Muda) - Insertion Sort");
            System.out.println("5. Search Nama Dosen - Sequential Searching");
            System.out.println("6. Search Usia Dosen - Binary Searching");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Jenis Kelamin (L = Laki-laki, P = Perempuan): ");
                    char jk = sc.next().charAt(0);
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');
                    System.out.print("Masukkan Usia Dosen: ");
                    int usia = sc.nextInt();
                    dataDosen.tambah(new Dosen10(kode, nama, jenisKelamin, usia));
                }
                case 2 -> {
                    System.out.println("\nData Dosen:");
                    dataDosen.tampil();
                }
                case 3 -> {
                    dataDosen.SortingASC();
                    System.out.println("Data berhasil diurutkan ASC.");
                    dataDosen.tampil();
                }
                case 4 -> {
                    dataDosen.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC.");
                    dataDosen.tampil();
                }
                case 5 -> {
                    System.out.print("Masukkan Nama Dosen yang dicari: ");
                    String namaDosen = sc.nextLine();
                    dataDosen.PencarianDataSequential(namaDosen);
                }
                case 6 -> {
                    System.out.print("Masukkan Usia Dosen yang dicari: ");
                    int usiaDosen = sc.nextInt();
                    dataDosen.PencarianDataBinary(usiaDosen);
                }
                case 7 -> {
                    System.out.println("Keluar program...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
