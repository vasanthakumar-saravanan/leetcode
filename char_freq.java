import java.util.*;
public class char_freq{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int freq[] = new int [26];
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            System.out.print(freq[i]+" ");
        }
    }
}