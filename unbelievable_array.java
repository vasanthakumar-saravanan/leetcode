import java.util.*;
public class unbelievable_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int op=sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int k=sc.nextInt();
            int a =0,b=0;
            while(op-->0){
            if(k==1){
                 a =sc.nextInt();
                 b=sc.nextInt();
            }
            
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(arr[i]==a){
                        arr[i]=b;
                    }
                }
            }
            int r=0;
            if(k==2){
                 r=sc.nextInt();
            }
           
        }
            
            sc.close();
        }
    }
}