import java.util.Scanner;

public class SumMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah bulan: ");
        int elm = sc.nextInt();

        Sum sm = new Sum(elm);

        for(int i=0;i<elm;i++){
            System.out.print("Keuntungan bulan ke-"+(i+1)+" : ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("Total keuntungan BF = "+sm.TotalBF());
        System.out.println("Total keuntungan DC = "+sm.TotalDC(sm.keuntungan,0,elm-1));
    }
}