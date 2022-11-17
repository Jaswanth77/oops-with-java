package exp6;
import java.util.Scanner;
public class exp6emp {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter employee id and hour pay:");
        String a = obj.next();
        String b = obj.next();
        excepthandle ex = new excepthandle(a, b);
        ex.emp_no_except();
        ex.Hr_pay_except();
    }
}
