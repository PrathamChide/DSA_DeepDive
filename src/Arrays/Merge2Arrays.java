package Arrays;

import java.util.*;
import java.io.*;

public class Merge2Arrays {
    public static int[] mergeArrays(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        int k=0;
        int[] ans=new int[arr1.length+arr2.length];
        while(i< arr1.length && j< arr2.length){
            if(arr1[i]>arr2[j]){
                ans[k]=arr2[j];
                k++;
                j++;
            }
            else{
                ans[k]=arr1[i];
                i++;
                k++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,4,5,8};
        int[] arr2={2,5,4,6,7};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] ans=mergeArrays(arr1,arr2);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
