public class mergetwoarray {
    void sortA(int a[]){
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;   
                }
            }
        }
       
    }
    void display(int a[]){
         for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    void merge(int a[],int b[]){
       int alen=a.length, blen=b.length;
       int clen=alen+blen;
       int c[]=new int[clen];
       for(int k=0,l=0,m=0;k<clen; k++){
        if(l<alen)    
        c[k]=a[l++];
        else
        c[k]=b[m++];
            //l++;
        }
        
        mergetwoarray m2=new mergetwoarray();
        m2.sortA(c);
        m2.display(c);
    }
    public static void main(String[] args) {
        int a[]={12,2,43,5,45,12};
        int b[]={13,23,4,21,54};
        mergetwoarray m1=new mergetwoarray();
        System.out.println("=======first array=====");
        m1.sortA(a);
        m1.display(a);
        System.out.println("=======second array=====");
        m1.sortA(b);
        m1.display(b);
        System.out.println("=======merge array=====");
        m1.merge(a,b);
    }
}
