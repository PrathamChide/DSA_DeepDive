package Strings;

import java.util.Scanner;

public class CountTheNumberOfCharacters {
    public static void countCharacters(String str){
        int[] count=new int[26];
        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            int index=x-'a';
            count[index]+=1;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                char ans=(char)(i+'a');
                System.out.println(ans+":"+count[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        countCharacters(str);
    }
}
