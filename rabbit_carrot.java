import java.util.*;

public class rabbit_carrot{
    static int dfs(int i,int j,int [][] mat,boolean visited[][],int count){
        int n=mat.length;
        int m=mat[0].length;

         if(i<0||i>=n ||j<0 ||j>=m||visited[i][j]){
            return Integer.MAX_VALUE;
         }
         if(mat[i][j]==-1){
            return Integer.MAX_VALUE;
         }
         
         if(mat[i][j]==5){
            return count;
         }
         visited[i][j]=true;

         int up =dfs(i-1,j,mat,visited,count+1);
         int down =dfs(i+1,j,mat,visited,count+1);
         int right =dfs(i,j+1,mat,visited,count+1);
         int left =dfs(i,j-1,mat,visited,count+1);
         visited[i][j]=false;
        //System.out.println(up+" "+down+" "+right+" "+left+" "+Math.min(Math.min(up,down),Math.min(right,left)));
        return Math.min(Math.min(up,down),Math.min(right,left));
        

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][] =new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            mat[i][j]=sc.nextInt();
            }
        }
       // int s_row=sc.nextInt();
        //int s_col=sc.nextInt();
        boolean visited[][]=new boolean[n][m];
        int count=1;
        System.out.println(dfs(0,0,mat,visited,count));
        sc.close();
        
    }
}