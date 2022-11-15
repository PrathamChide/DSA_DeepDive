package Strings;

public class PrintAllSubstrings {
    public static void substring(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String str1=str.substring(i,j);
                System.out.println(str1);
            }
        }
    }
    public static void main(String[] args) {
        String str="abcd";
        substring(str);
    }
}
