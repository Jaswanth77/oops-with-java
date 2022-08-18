package Sample1;
import java.util.Scanner;
public class Sample5 {
   public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       System.out.println("enter the no. of words:");
       int n=in.nextInt();
       for(i=0;i<n;i++)
	{
		for(j=2*(n-i);j>=0;j--)
		{
			System.out.print(" ");
		}
		for(j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
   } 
}
