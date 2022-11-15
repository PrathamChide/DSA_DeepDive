package Strings;

public class CheckWhetherPalindromeOrNot {
    public static void main(String[] args) {
        String str="aabaa";
        System.out.print(IfPalindrome(str));
    }
    public static boolean IfPalindrome(String str){
        if(str.length()==0){
            return false;
        }
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
