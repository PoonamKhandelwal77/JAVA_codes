import java.util.Scanner;
class UserInput
{
	public static void main(String[] args) 
	{
	   int a,b,c;
	   Scanner obj=new Scanner(System.in);
	   System.out.print("enter value of a");
       a=obj.nextInt();
       System.out.print("enter value of b");
       b=obj.nextInt();
       System.out.print("enter value of c");
       c=obj.nextInt();
      
       if (a>b && a>c) 
       { 
         System.out.println("A is big" +a );
       }
       else if (b>c) 
       {
       	 System.out.println("B is big" +b);
       }
       else
       	System.out.println("C is big" +c);
	}
}