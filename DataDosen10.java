public class DataDosen10 {
    Dosen10[] dataDosen = new Dosen10[10];
    int idx = 0;

    public void tambah(Dosen10 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    public void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen10 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    public void sortingDSC() {
        for (int i = 1; i < idx; i++) {
            Dosen10 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) { 
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

    public void PencarianDataSequential(String nama) {
        boolean found = false;
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                found = true;
                count++;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama yang sama!");
        }
    }

    public void PencarianDataBinary(int usia) {
        SortingASC(); 
        int low = 0, high = idx - 1;
        boolean found = false;
        int count = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (dataDosen[mid].usia == usia) {
                for (int i = mid; i >= 0 && dataDosen[i].usia == usia; i--) {
                    dataDosen[i].tampil();
                    count++;
                }
                for (int i = mid + 1; i < idx && dataDosen[i].usia == usia; i++) {
                    dataDosen[i].tampil();
                    count++;
                }
                found = true;
                break;
            } else if (dataDosen[mid].usia < usia) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia yang sama!");
        }
    }
}

