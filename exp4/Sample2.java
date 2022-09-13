package exp4;

import java.util.Scanner;
public class Sample2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the length and breadth of rectangle:");
        int a=in.nextInt();
        int b=in.nextInt();
        Rect o1=new Rect(a,b);
        System.out.println("enter the radius of the circle:");
        int c=in.nextInt();
        Circle o2=new Circle(c);
        System.out.println("enter x to resize the shapes:");
        int d=in.nextInt();
        o1.resize(d);
        o2.resize(d);
        System.out.println("***RECTANGLE***");
        o1.area();
        o1.perimeter();
        System.out.println("***TRIANGLE***");
        o2.area();
        o2.perimeter();
    }

}
interface Resizable{
    void resize(int x);
}

class Rect implements Resizable{
    int l,b;
    Rect(int x,int y){
        l=x;
        b=y;
    }
    @Override
    public void resize(int x){
        l*=x;
        b*=x;
    }

    void perimeter(){
        int per=2*(l+b);
        System.out.println("perimeter :"+per);
    }
    void area(){
        int ar=l*b;
        System.out.println("area :"+ar);
    }
}

class Circle{
    int radius;
    Circle(int r){
        radius=r;
    }
    public void resize(int x){
        radius*=x;
    }
    void perimeter(){
        double per=2*3.14*radius;
        System.out.println("perimeter: "+per);
    }
    void area(){
        double ar=3.14*radius*radius;
        System.out.println("area: "+ar);
    }
}
