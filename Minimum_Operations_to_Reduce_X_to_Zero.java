import java.util.*;
public class Minimum_Operations_to_Reduce_X_to_Zero{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int x = sc.nextInt();
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(minOperations(n,arr,x));
        sc.close();
    }
    
    public static int minOperations(int n,int[] A, int x) {
        int k = -x;
        for (int a : A) k += a;
        if (k < 0) return -1;
        if (k == 0) return n;

        int best = -1, i = 0, s = 0;
        for (int j = 0; j < n; j++) {
            s += A[j];
            while (s > k)
                s -= A[i++];

            if (s == k)
                best = Math.max(best, j - i + 1);
        }

        return best < 0 ? -1 : n - best;
    }
}
