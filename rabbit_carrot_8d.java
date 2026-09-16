import java.util.*;
public class rabbit_carrot_8d{
    private static int dfs(int i,int j,int[][] mat,boolean [][] visited,int index){
        int n= mat.length;
        int m=mat[0].length;
        if(i<0||i>=n||j<0||j>=m||visited[i][j]||mat[i][j]==-1){
            return Integer.MAX_VALUE;
        }
        if(mat[i][j]==5){
            return index;
        }
        visited[i][j]=true;
        int up =dfs(i-1,j,mat,visited,index+1);
        int down =dfs(i+1,j,mat,visited,index+1);
        int right_top=dfs(i-1,j+1,mat,visited,index+1);
        int left_top=dfs(i-1,j-1,mat,visited,index+1);
        int right=dfs(i,j+1,mat,visited,index+1);
        int left =dfs(i,j-1,mat,visited,index+1);
        int right_bottom=dfs(i+1,j+1,mat,visited,index+1);
        int left_bottom=dfs(i+1,j-1,mat,visited,index+1);
        visited[i][j]=false;
        return Math.min(Math.min(Math.min(up,down),Math.min(left,right)),Math.min(Math.min(right_bottom,right_top),Math.min(left_bottom,left_top)));
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        int mat [][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int index=0;
        boolean visited[][]=new boolean[n][m];
        System.out.println(dfs(0,0,mat,visited,index));

    }
}