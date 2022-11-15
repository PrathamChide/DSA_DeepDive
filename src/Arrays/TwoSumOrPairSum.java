package Arrays;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class TwoSumOrPairSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
//        pairSum(arr,sum)
        twoSum(arr,sum);

    }
    //Bruteforce Or Naive Approch
//    public static void pairSum(int[] arr,int sum){
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==sum)
//                    System.out.print(arr[i]+" "+arr[j]);
//            }
//        }
//    }

    //Two Pointer Approach
    public  static void twoSum(int[] arr,int sum) {
        Arrays.sort(arr);
        int i = 0;
        int j =arr.length-1;
        while (i <j) {          ;
                if (arr[i] + arr[j] > sum) {
                    j--;
                } else if (arr[i] + arr[j] < sum) {
                    i++;
                }
                else{
                    System.out.println(arr[i]+" "+arr[j]);
                    i++;
                    j--;
            }
        }
    }
}
