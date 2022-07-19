import java.util.Arrays;

public class mergeSort {

    public static void main(String[] args) {
        int[] b={2,1,4,3};
        int[] out=mergesrt(b);
        System.out.println(Arrays.toString(out));
        for(int i=0; i<out.length;i++){
            System.out.println(out[i]);
        }
    }
    static int[] mergesrt(int[] arr){
       
        int[] a;
        if(arr.length==1){
        return arr;
       }
        int m= arr.length/2;
        int[] left=mergesrt(Arrays.copyOfRange(arr, 0, m));
        int[] right=mergesrt(Arrays.copyOfRange(arr, m, arr.length));

        a=merge(left,right);
        
        return a;
    }

    static int[] merge( int[] left, int[] right){
        int[] a=new int[left.length+right.length];
        int i=0,j=0,k=0;
        
        while(i<left.length && j<right.length){
        if (left[i]<right[j]) {
            a[k]=left[i];
            i++;
        }else{
            a[k]=right[j];
            j++;
        }
        k++;
         }
         while(i<left.length){
            a[k]=left[i];
            k++;
            i++;
         }
         while(j<right.length){
            a[k]=right[j];
            k++;
            j++;
         }
        return a;
    }
}