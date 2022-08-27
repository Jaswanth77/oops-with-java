package exp2;
import java.util.Scanner;
public class Sample1 {
    public static void main(String[] args){
        int p,newsal;
        Scanner in=new Scanner(System.in);
        Employee obj=new Employee(1,"jaswanth","lal",10000);
        System.out.println(obj.getID());
        System.out.println(obj.getFirstName());
        System.out.println(obj.getLastName());
        System.out.println(obj.getSalary());
        System.out.println(obj.getName());
        System.out.println(obj.getAnnualSalary());
        System.out.println("Enter new salary to be changed:");
        newsal=in.nextInt();
        obj.setSalary(newsal);
        System.out.println("Enter the percentage of the salary increment:");
        p=in.nextInt();
        System.out.println(obj.raiseSalary(p));
        System.out.println(obj.toString());
    }

}

class Employee{
    int id,salary;
    String fname,lname;

    Employee(int a,String b,String c,int d ){
        id=a;
        fname=b;
        lname=c;
        salary=d;
    }

    int getID(){
        return id;
    }

    String getFirstName(){
        return fname;
    }

    String getLastName(){
        return lname;
    }

    String getName(){
        return fname+lname;
    }

    int getSalary(){
        return salary;
    }

    void setSalary(int sal){
        salary=sal;
        System.out.println("salary updated to be:"+salary);
    }

    int getAnnualSalary(){
        return salary*12;
    }

    int raiseSalary(int per){
        salary+=(salary*per)/100;
        return salary;
    }

    public String toString(){
        return "id:"+id+" name:"+fname+lname+" salary:"+salary;
    }
}
