import java.util.Scanner;
class stack{
    static final int MAX=5;
    int top=-1;
    int a[] = new int [MAX];
//=============push operation=====================
    void push(int a){
        if(top==MAX-1){
            System.out.println("Stack overflow");
        }
        else
       {
           top++;
        this.a[top]=a;
       System.out.println("you pushed an element:"+this.a[top]); 
       }
    }
//====================pop operation=================
    int pop(){
        
        if(top==-1){
            System.out.println("underflow");
        }
        else
        {System.out.println("removed element is: "+a[top]);
        top--;
        }
        return 0;
    }
//==============display operation====================
    void display(){
        for(int i=top;i>=0;i--){
            System.out.println(a[i]);
        }
    }
//================driver code==========================
    public static void main(String[] args) {
        stack s=new stack();
        Scanner sc=new Scanner(System.in);
        int ch=0,data;
        
        while(ch!=4){
            System.out.println("press 1 for push operation\npress 2 for pop operation\npress 3 for display operatiion\n press 4 for exit");
            System.out.println("enter your choice");
            ch=sc.nextInt();
            if(ch==1)
            {
                System.out.println("enter the element");
                data=sc.nextInt();
                s.push(data);
            }
            if(ch==2)
            {
                s.pop();
            }
            if (ch==3) {
                s.display();
            }

        }
        
    }
}