package Sample1;
import java.util.Scanner;
public class sample2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the digit a:");
        int a=in.nextInt();
        int b=a,sum=0,prd=1,c;
        while(b>0){
            c=b%10;
            prd*=c;
            sum+=c;
            b=b/10;
        }
        System.out.println("sum of digits:"+sum);
        System.out.println("product of digits:"+prd);
    }
    
}
