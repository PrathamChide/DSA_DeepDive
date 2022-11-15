package Recursion;

public class SubsequenceOfAString {
    public static String[] subsequnce(String str){ //Bottom-Up Approach
        if(str.length()==0){
            String[] arr=new String[1];
            arr[0]="";
            return arr;
        }
        String[] smallAns=subsequnce(str.substring(1));
        String[] ans=new String[smallAns.length*2];
        int k=0;
        for(int i=0;i<smallAns.length;i++){
            ans[k]=smallAns[i];
            k++;
        }
        for(int i=0;i<smallAns.length;i++){
            ans[k]=str.charAt(0)+smallAns[i];
            k++;
        }
        return ans;
    }

    public static void subsequnceTopDown(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        subsequnceTopDown(str.substring(1),ans+str.charAt(0));
        subsequnceTopDown(str.substring(1),ans);
    }

    public static void main(String[] args) {
        String str="abc";
//        String[] ans=subsequnce(str);
//        for (int i=0;i< ans.length;i++){
//            System.out.println(ans[i]);
//        }
       subsequnceTopDown(str,"");
    }
}
