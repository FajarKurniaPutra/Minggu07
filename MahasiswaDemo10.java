import java.util.Scanner;

public class MahasiswaDemo10 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1) + ":");
            System.out.print("Masukkan NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("Masukkan IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 
            System.out.println("---------------------------------");
            list.tambah(new Mahasiswa10(nim, nama, kelas, ipk));
        }

        list.tampil();

        //Sequential Searching
        System.out.println("----------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari : ");
        System.out.print ("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("\nMenggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        //Melakukan pencarian data Binary
        boolean isDescending = list.cekDescending();
        System.out.println("----------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari : ");
        System.out.print ("IPK: ");
        double cari2 = sc.nextDouble();
        System.out.println("----------------------------------------");
        System.out.println("\nMenggunakan binary searching");
        System.out.println("----------------------------------------");
        int posisi2;
        if (isDescending) {
            posisi2 = list.binaryDescendingSearch(cari2, 0, jumMhs - 1);
        } else {
            posisi2 = list.findBinarySearch(cari2, 0, jumMhs - 1);
        }

        list.tampilPosisi(cari2, posisi2);
        list.tampilDataSearch(cari2, posisi2);
    }
}