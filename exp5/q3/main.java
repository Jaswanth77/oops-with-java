package out;
import procpack.sample4;
public class main extends procpack.sample4{
    public static void main(String[] args) {
        main obj=new main();
        obj.disp1();
        try{
            obj.display();
        }
        catch(Exception e){
            System.out.println("default access specifier cannot be used");
        }
    }

}