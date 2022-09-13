
package exp4;


public class Sample2 {
    public static void main(String[] args){
        Rect o1=new Rect(2,3);
        Circle o2=new Circle(1);
        o1.resize(2);
        o2.resize(3);
        o1.area();
        o2.area();
        o1.perimeter();
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