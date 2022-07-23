import java.util.Arrays;

public class remove_even {
 public static void main(String[] args) {
     int a[]={10,10,20,30,1,1};
     int n=a.length,j;
     for(int i=0;i<n;i++){
         if(a[i]%2==0){
            for( j=i+1;j<n;j++){
                a[i]=a[j];
            }
            i--;
            n--;
            j--;
         }
     }
     for(j=0;j<n;j++){
         System.out.println(a[j]+"  ");
     }
  }   
}
