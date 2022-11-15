package Recursion;

public class RecursionQuestions {
    public static boolean isSorted(int start,int[] arr){
        if(start==arr.length-1){
            return true;
        }
        if(arr[start]>arr[start+1]){
            return false;
        }
        boolean assumption=isSorted(start+1,arr);
        return assumption;
    }
    public static String removeM(String str){
        if(str.length()==0){
            return "";
        }
        String smallAns=removeM(str.substring(1));
        if(str.charAt(0)!='m'){
            smallAns=str.charAt(0)+smallAns;
        }
        return smallAns;
    }

    public static void main(String[] args) {
//        int arr[]={1,2,3,6,5};
//        System.out.print(isSorted(0,arr));
        String str="mabmcm";
        System.out.print(removeM(str));
    }
}
