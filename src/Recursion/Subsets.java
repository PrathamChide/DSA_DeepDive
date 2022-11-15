package Recursion;

public class Subsets {
    public static void subsets(int[] arr,int[] ans,int start){
        if(arr.length==0){
            for(int i=0;i<ans.length+1;i++){
                System.out.print(ans[i]+ " ");
            }
            System.out.println();
            return;
        }
        int[] takeValue=new int[ans.length+1];
        int i=0;
        for(;i<ans.length;i++){
            takeValue[i]=ans[i];
        }
        takeValue[i]=arr[start];
        subsets(arr,takeValue,start+1);
        subsets(arr,ans,start+1);
    }
    public static void main(String[] args) {
        int[] arr={1,5,10};
        int[] ans=new int[0];
        subsets(arr,ans,0);
    }
}
