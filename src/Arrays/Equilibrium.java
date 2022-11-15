package Arrays;

public class Equilibrium {
    public static int equilibriumPoint(int[] arr){
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<arr.length;i++){
            rightSum+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            rightSum-=arr[i];
            if(rightSum==leftSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,1,4,0};
        System.out.print(equilibriumPoint(arr));
    }
}
