package exp4;

import java.util.Scanner;
public class Sample1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter no. of sides,width and height of rectangle:");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        Rectangle o=new Rectangle(a,b,c);
        System.out.println("enter no. of sides,length of sides of triangle:");
        int p=in.nextInt();
        int q=in.nextInt();
        int r=in.nextInt();
        int s=in.nextInt();
        Triangle o1=new Triangle(p,q,r,s);
        System.out.println("******RECTANGLE*****");
        System.out.println("no. of sides:"+o.get());
        System.out.println("area of reactangle:"+o.getArea());
        System.out.println("perimeter of rectangle:"+o.getPerimeter());
        System.out.println("*****TRIANGLE*****");
        System.out.println("no. of sides:"+o1.get());
        System.out.println("area of triangle:"+o1.getArea());
        System.out.println("perimeter of triangle:"+o1.getPerimeter());
    }

}

abstract class Shape{
    int numsides;
    Shape(int a){
        numsides=a;
    };
    int get(){

        return numsides;
    }
    abstract int getArea();
    abstract int getPerimeter();

}

class Rectangle extends Shape{
    int width,height;
    Rectangle(int n,int wid,int hi){
        super(n);
        width=wid;
        height=hi;
    }

    @Override
    int getArea(){
        int area=width*height;
        return area;
    }
    @Override
    int getPerimeter(){
        int per=2*(width+height);
        return per;
    }
}

class Triangle extends Shape{
    int width,height,slant;
    Triangle(int n,int wi,int hi,int sl){
        super(n);
        width=wi;
        height=hi;
        slant=sl;
    }
    @Override
    int getArea(){
        int area1=(height*width)/2;
        return area1;
    }
    @Override
    int getPerimeter(){
        int per1=width+height+slant;
        return per1;
    }
}
