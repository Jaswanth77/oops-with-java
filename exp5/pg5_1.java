package exp5;
import year1.year1marks;
import year2.year2marks;
import java.util.Scanner;
public class pg5_1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Students[] s=new Students[10];
        year1marks[] y1=new year1marks[10];
        year2marks[] y2=new year2marks[10];
        System.out.println("enter no. of students");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter roll no and name:");
            int a= in.nextInt();
            String b= in.next();
            s[i]=new Students(a,b);
            System.out.println("enter First year marks:");
            double c=in.nextInt();
            double d=in.nextInt();
            y1[i]=new year1marks(c,d);
            System.out.println("enter Second year marks:");
            double e= in.nextInt();
            double f= in.nextInt();
            y2[i]=new year2marks(e,f);
            System.out.println("NAME:"+s[i].name);
            System.out.println("ROLLNO:"+s[i].r_no);
            System.out.println("YEAR1 MARKS");
            System.out.println(y1[i].Sub1(c));
            System.out.println(y1[i].Sub1(d));
            System.out.println("YEAR2 MARKS");
            System.out.println(y2[i].Sub2(e));
            System.out.println(y2[i].Sub2(f));
        }



    }
}

class Students{
    int r_no;
    String name;
    Students(int a,String b){
        r_no=a;
        name=b;
    }
}
