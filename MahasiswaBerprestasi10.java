class MahasiswaBerprestasi10 {
    Mahasiswa10[] listMhs;
    int idx;

    MahasiswaBerprestasi10(int jumlah) {
        listMhs = new Mahasiswa10[jumlah];
        idx = 0;
    }

    void tambah(Mahasiswa10 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Mahasiswa10 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
            }
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j=0; j<listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public boolean cekDescending() {
        return listMhs[0].ipk > listMhs[listMhs.length - 1].ipk;
    }

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    int binaryDescendingSearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            } else if (listMhs[mid].ipk < cari) {
                return binaryDescendingSearch(cari, left, mid - 1);
            } else {
                return binaryDescendingSearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("Data mahasiswa dengan IPK :" + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + "tidak ditemukan!");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : "+ listMhs[pos].nim);
            System.out.println("nama\t : "+ listMhs[pos].nama);
            System.out.println("kelas\t : "+ listMhs[pos].kelas);
            System.out.println("ipk\t : "+ x);
        }
        else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan!");
        }
    }
}