import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] a={12,23,11,10,4,24,1,2,5};
        System.out.println(Arrays.toString(insertionSrt(a)));
    }
    static int[] insertionSrt(int[] arr){
        int i,j,temp;
        for(i=1;i<arr.length;i++){
            j=0;
            while(j<=i){
                if(arr[i]<arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                }
                j++;
            }
        }
        return arr;
    }
}
