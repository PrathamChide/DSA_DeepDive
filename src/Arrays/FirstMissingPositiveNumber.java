package Arrays;

import java.util.Scanner;

public class FirstMissingPositiveNumber {
    public static int segregateArray(int[] arr){
        int i=0;
        for(int j=0 ;j<arr.length;j++){
            if(arr[j]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=firstMissingNumber(arr);
        System.out.print(x);
    }
    public static int firstMissingNumber(int[] arr){
        int start=segregateArray(arr);
        int[] arr1=new int[arr.length-start];
        int k=0;
        for(int i=start;i<arr.length;i++){
            arr1[k]=arr[i];
            k++;
        }
        for(int i=0;i<arr1.length;i++){
            int x=Math.abs(arr1[i]);
            if(x-1<arr1.length && arr1[x-1]>0){
                arr1[x-1]=-arr1[x-1];
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>0){
                return i+1;
            }
        }
        return arr1.length+1;
    }
}
