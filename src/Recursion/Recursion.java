package Recursion;

public class Recursion {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int smallerProblem=fact(n-1);
        return n*smallerProblem;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return sum(n-1)+n;
    }
    public static int power(int n,int x){
        if(x==0) return 1;
        int assumption=power(n,x-1);
        return n*assumption;
    }
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int assumption=fib(n-1)+fib(n-2);
        return assumption;
    }
    public static int sum(int[] arr,int start){
        if(start==arr.length-1){
            return arr[start];
        }
        int assumption=sum(arr,start+1);
        return arr[start]+assumption;
    }
    public static int sumOfDigits(int n){
        if(n==0 || n==1){
            return n;
        }
        int assumption=n%10+(sumOfDigits(n/10));
        return assumption;
    }
    public static void main(String[] args) {
//        System.out.println(fact(5));
//        System.out.println(sum(10));
//        System.out.println(power(2,5));
//        System.out.println(fib(5));
//        int[] arr={1,2,4,3,45,5};
//        int start=0;
//        System.out.println(sum(arr,start));
        System.out.println(sumOfDigits(5789999));
    }
}
