public class Pangkat {

    int nilai;
    int pangkat;

    Pangkat(int a, int n){
        nilai = a;
        pangkat = n;
    }

    int pangkatBF(){
        int hasil = 1;

        for(int i = 0; i < pangkat; i++){
            hasil = hasil * nilai;
        }

        return hasil;
    }

    int pangkatDC(int a, int n){

        if(n==0){
            return 1;
        }

        if(n%2==1){
            return pangkatDC(a, n/2) * pangkatDC(a, n/2) * a;
        }else{
            return pangkatDC(a, n/2) * pangkatDC(a, n/2);
        }
    }
}