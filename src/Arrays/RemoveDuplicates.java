package Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3};
        System.out.print(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] arr){
        int x=0;
        for(int i=0;i<arr.length;i++){
            x=x^arr[i];

        }
        return x;
    }

}
