package Strings;

import java.util.Scanner;

public class ReverseTheString {
    public static String reverseString(String str){
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr+=str.charAt(i);
        }
        return revStr;
    }
    public static void main(String[] args) {
//        String str="abcd";
//        String str1="";
//        for(int i=str.length()-1;i>=0;i--){
//            str1=str1+str.charAt(i);
//        }
//        System.out.println(str1);
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(reverseString(str));
    }
}
