import java.util.*;
public class freq_for_negative_numbers{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0],max=arr[0];
        for(int i:arr){
            if(i<min)min=i;
            if(i>max)max=i;
        }
        int freq[]=new int[max-min+1];
        for(int i=0;i<n;i++){
            freq[arr[i]-min]++;
        }
        for(int i=0;i<n;i++){
            System.out.print(freq[i]+" ");
        }
        sc.close();
    }
}