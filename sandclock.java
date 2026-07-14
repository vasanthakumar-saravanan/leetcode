import java.util.*;
public class sandclock{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=6;
        int [][] grid = new int[6][6];
        System.out.println("Enter a 6x6 matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        int row=0,col=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            int sum =Integer.MIN_VALUE;
            for(int j=0;j<4;j++){
                sum=grid[i][j]+grid[i][j+1]+grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
            
            if(sum>max_sum){
                max_sum=sum;
                row= i;
                col=j;               
            }

            }
        }
        System.out.println("the maximum sum is "+max_sum);
        System.out.println("The maximum sum sandclock is ");
        System.out.println(grid[row][col]+" "+grid[row][col+1]+" "+grid[row][col+2]);
        System.out.println("  "+grid[row+1][col+1]);
        System.out.println(grid[row+2][col]+" "+grid[row+2][col+1]+" "+grid[row+2][col+2]);
       
           
        sc.close();

    }
}