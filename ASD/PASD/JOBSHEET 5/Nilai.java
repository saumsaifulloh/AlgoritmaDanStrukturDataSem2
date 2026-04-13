public class Nilai {

    Mahasiswa[] data;

    Nilai(Mahasiswa[] data){
        this.data = data;
    }

    // UTS TERTINGGI (Divide Conquer)
    int utsTertinggiDC(int l, int r){
        if(l == r){
            return data[l].uts;
        }else{
            int mid = (l+r)/2;

            int left = utsTertinggiDC(l, mid);
            int right = utsTertinggiDC(mid+1, r);

            if(left > right){
                return left;
            }else{
                return right;
            }
        }
    }

    // UTS TERENDAH (Divide Conquer)
    int utsTerendahDC(int l, int r){
        if(l == r){
            return data[l].uts;
        }else{
            int mid = (l+r)/2;

            int left = utsTerendahDC(l, mid);
            int right = utsTerendahDC(mid+1, r);

            if(left < right){
                return left;
            }else{
                return right;
            }
        }
    }

    // RATA RATA UAS (Brute Force)
    double rataUASBF(){
        int total = 0;

        for(int i=0;i<data.length;i++){
            total += data[i].uas;
        }

        return (double) total / data.length;
    }
} 
