public class DataDosen17 {

    void dataSemuaDosen(Dosen17[] arrayOfDosen) {
        for (Dosen17 d : arrayOfDosen) {
            System.out.println("Kode : " + d.kode);
            System.out.println("Nama : " + d.nama);
            System.out.println("Jenis kelamin : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia : " + d.usia);
            System.out.println("-----------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen17[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen17 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah dosen pria : " + pria);
        System.out.println("Jumlah dosen wanita : " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen17[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen17 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }

        if (jmlPria > 0)
            System.out.println("Rata-rata usia dosen pria : " + (totalPria / jmlPria));
        if (jmlWanita > 0)
            System.out.println("Rata-rata usia dosen wanita : " + (totalWanita / jmlWanita));
    }

    void infoDosenPalingTua(Dosen17[] arrayOfDosen) {
        Dosen17 tertua = arrayOfDosen[0];

        for (Dosen17 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen paling tua : ");
        System.out.println("Nama : " + tertua.nama);
        System.out.println("Usia : " + tertua.usia);
    }

    void infoDosenPalingMuda(Dosen17[] arrayOfDosen) {
        Dosen17 termuda = arrayOfDosen[0];

        for (Dosen17 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("Dosen paling muda : ");
        System.out.println("Nama : " + termuda.nama);
        System.out.println("Usia : " + termuda.usia);

         DataDosen17 data = new DataDosen17();

System.out.println("===== SEMUA DATA DOSEN =====");
data.dataSemuaDosen(arrayOfDosen);

data.jumlahDosenPerJenisKelamin(arrayOfDosen);
data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
data.infoDosenPalingTua(arrayOfDosen);
data.infoDosenPalingMuda(arrayOfDosen);

    }

}