public class binarySearch {
    public static void main(String[] args) {
        int[] a={20,30,40,50,60};
        System.out.println(binSech(a, 0,a.length-1, 30)+1);
    }
    static int binSech(int[] arr,int start,int end,int target){
        int m=start+ (end-start)/2;
        if(arr[m]==target){
            return m;
        }
        if(target <arr[m]){
            return binSech(arr, start, m-1, target);
        }
        if(target> arr[m]){
            return binSech(arr, m+1, end, target);
        }
        return m;
    }
}
