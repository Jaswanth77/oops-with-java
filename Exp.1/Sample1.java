
package Sample1;
public class Sample1 {
    public static void main(String[] args){
        int a=Integer.valueOf(args[0]);
        int b=Integer.valueOf(args[1]);
        if (a>b)
            System.out.println(b+"is minimum");
        else
            System.out.println(a+"is minimum");
    }

}
