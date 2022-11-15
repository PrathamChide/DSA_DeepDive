public class BinarySearch {
    public static int binaySearch(int[] arr,int nums){
        if(arr.length==0){
            return 0;
        }
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+end/2;
            if(arr[mid]>nums){
                end=mid-1;
            }
            else if(arr[mid]<nums){
                start=mid+1;
            }
              return mid;
        }
            return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,5,7,8,10};
        int nums=7;
        System.out.print(binaySearch(arr,nums));
    }
}
