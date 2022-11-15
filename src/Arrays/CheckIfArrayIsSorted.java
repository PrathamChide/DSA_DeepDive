package Arrays;

import java.util.Scanner;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(isSorted(arr)==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
