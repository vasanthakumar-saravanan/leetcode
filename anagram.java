import java.util.*;
public class anagram{
    public static int anagram_checker(String s1,String s2){
        int n=1;
        int freq [] =new int[26];
        if(s1.length() !=s2.length()){
            return 0;
        }
        for(int i =0 ;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<s1.length();i++){
            if(freq[i]!=0){
                n=0;
                break;
            }
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char [] c1 = s1.toCharArray();
        char [] c2 =s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        if(Arrays.equals(c1,c2)){
            System.out.println("The given String is  anagram");
        }
        else{
            System.out.println("The given String is not  a Anagram");
        }
        int flag =anagram_checker(s1,s2);
        if(flag==1){
            System.out.println("The given string is a anagram");
        }
        else{
            System.out.println("The given string is not a anagram");
        }
    }
}