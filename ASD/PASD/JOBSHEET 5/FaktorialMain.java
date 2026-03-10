import java.util.Scanner;

public class FaktorialMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai yang akan difaktorialkan : ");
        int nilai = sc.nextInt();

        Faktorial fk = new Faktorial();

        System.out.println("Hasil Faktorial Brute Force : " + fk.faktorialBF(nilai));
        System.out.println("Hasil Faktorial Divide Conquer : " + fk.faktorialDC(nilai));
    }
}