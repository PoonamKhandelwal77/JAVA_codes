public class removeDuplicates {
    
        public int removDuplicates(int[] nums) {
             
         int j,k,count=0;
        int n=nums.length;  
        for(int i=0;i<n;i++){
             for(j=i+1;j<n;j++){
                 if(nums[i]==nums[j]){
                     count++;
                     for(k=j+1;k<n;k++){
                         nums[j]=nums[k];
                     }
                     n--;
                     j--;
                 }
                 
             }
         }
              
        for(j=0;j<n;j++){
             System.out.print(nums[j]+"  ");
         }
     //System.out.println(count);
            return count;
        }
    public static void main(String[] args) {
        int nums[]={1,1,2,2,3,3,4,4,2};
        removeDuplicates r1=new removeDuplicates();
        r1.removDuplicates(nums);
    }
}
