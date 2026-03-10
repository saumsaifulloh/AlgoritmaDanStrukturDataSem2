import java.util.Scanner;

public class PangkatMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];

        for(int i=0;i<elemen;i++){
            System.out.print("Masukkan nilai yang dipangkatkan: ");
            int nilai = sc.nextInt();

            System.out.print("Masukkan nilai pangkat: ");
            int pangkat = sc.nextInt();

            png[i] = new Pangkat(nilai,pangkat);
        }

        System.out.println("--------------------");
        System.out.println("Hasil Pangkat BF");
        for(int i=0;i<elemen;i++){
            System.out.println(png[i].nilai+"^"+png[i].pangkat+" = "+png[i].pangkatBF());
        }

        System.out.println("--------------------");
        System.out.println("Hasil Pangkat DC");
        for(int i=0;i<elemen;i++){
            System.out.println(png[i].nilai+"^"+png[i].pangkat+" = "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        }
    }
}