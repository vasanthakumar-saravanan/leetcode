import java.util.*;
public class nice_number{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        int freq[]=new int[10];
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            freq[digit]++;
        }
        int flag=1;
        for(int i=0;i<s.length();i++){
            int d=s.charAt(i)-'0';
            if(freq[d]!=d){
                flag=0;
                break;
            }
        }
        
        System.out.println("Nice number is the one which has each digits repeated by its value");
        if(flag==0){
            System.out.println("The given number is not a nice number");
        }
        else{
            System.out.println("The given number is  a nice number");
        }
    }
}