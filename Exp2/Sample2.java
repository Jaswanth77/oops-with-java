
package exp2;
import java.util.Scanner;
public class Sample2 {
    
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
    
    int getSalary(){
        return salary;
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