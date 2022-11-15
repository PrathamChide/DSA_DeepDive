package Strings;

public class CountWords { //Not A Correct Solution!!!!!!!!!!!!!!!!
    public static void main(String[] args) {
        String str="This    is   a  sunny       day";
        System.out.println(countWords(str));
    }
    public static int countWords(String str){
        if(str.length()==0){
            return 0;
        }
        int count=0;
        boolean a=true;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==' '){
                a=true;
            } else if (a == true){
                a=false;
                count++;
            }
        }
        return count;
    }
}
