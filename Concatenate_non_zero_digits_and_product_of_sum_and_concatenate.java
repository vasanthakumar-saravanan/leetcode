import java.util.*;
public class Concatenate_non_zero_digits_and_product_of_sum_and_concatenate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long s=0,x=0;
        for(char c : String.valueOf(n).toCharArray()){
            if(c!='0'){
                x=x*10+c-'0';
                s=s+c-'0';
            }
        }
        System.out.println(x*s);
    }
}