package Arrays;

import java.util.Scanner;

public class PushZerosAtTheEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        pushZeros(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void pushZeros(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
    }
}
