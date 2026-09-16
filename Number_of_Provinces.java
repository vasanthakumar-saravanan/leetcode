import java.util.*;
public class Number_of_Provinces{
    public static int find (int [] leader,int u){
        return leader[u];
    }
    public static void join(int leader[],int u,int v){

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int leader[] =new int [n+1];
        int isconnected[][] = new int[n][n];

        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                isconnected[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            leader[i]=i;
        }
        


    }
}