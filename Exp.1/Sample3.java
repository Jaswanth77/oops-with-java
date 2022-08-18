
package Sample1;
import java.util.Scanner;

public class Sample3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no. of days:");
        int a=in.nextInt();
        int b=a/30;
        int c=a%30;
        System.out.println(b+"month and"+c+"days:");
    }
}
