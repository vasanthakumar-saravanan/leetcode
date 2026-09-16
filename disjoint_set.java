
import java.util.Scanner;

public class disjoint_set{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int M=sc.nextInt();
        int leader[]=new int [N+1];
        for(int i=0;i<=N;i++) leader[i]=i;

        int edges[][]=new int [M][2];

        for(int i=0;i<M;i++){
            edges[i][0]=sc.nextInt();
            edges[i][1]=sc.nextInt();
        }
        for(int edge[]:edges){
            int u=edge[0];
            int v=edge[1];
            union(u,v,leader);

        }

        int [] group_count=new int[N+1];

        for(int i=1;i<=N;i++){
                group_count[find(i,leader)]++;
        }

        int [] edge_count=new int[N+1];

        for(int [] edge:edges){
            edge_count[find(edge[0],leader)]++;
        }

        long  total=0;

        for(int i=0;i<=N;i++){
           
          long gc = (long) group_count[i] * (group_count[i] - 1) / 2;
           total+=gc;
           total-=edge_count[i];
        }

        System.out.println(total);
     


       
    }
    public static void union(int u,int v,int leader[]){
            int u_leader=find(u,leader);
            int v_leader=find(v,leader);
            leader[v_leader]= u_leader;

    }
    public static int find(int u, int[] leader){

        if(u!=leader[u]) leader[u]=find(leader[u],leader);
        return leader[u];

    }
}