
package exp3;

public class Sample1 {
    public static void main(String[] args){
        Student obj=new Student("jash","chennai",2,80000,"cs");
        System.out.println(obj.getAddress());
        System.out.println(obj.getName());
        obj.setAddress("madurai");
        System.out.println(obj.getFee());
        System.out.println(obj.getProgram());
        System.out.println(obj.getyear());
        obj.setFee(60000);
        obj.setYear(3);
        obj.setProgram("phy");
        System.out.println(obj.tostring());
        Staff o2=new Staff("harsh","bangalore","kv",45000);
        System.out.println(o2.getAddress());
        System.out.println(o2.getName());
        System.out.println(o2.getPay());
        System.out.println(o2.getSchool());
        o2.setPay(50000);
        o2.setSchool("tc");
        System.out.println(o2.tostring());
    }
}

class Person{
    String name,address;
    
    Person(String a,String b){
        name=a;
        address=b;
    }
    
    String getName(){
        return name;
    }
    String getAddress(){
        return address;
    }
    void setAddress(String add){
        address=add;
    }
    String tostring(){
       return "name:"+name+" address:"+address;
    }
}

class Student extends Person{
    int year;
    double fee;
    String program;
    Student(String a,String b,int y,double f,String p){
        super(a,b);
        year=y;
        fee=f;
        program=p;
    }
    String getProgram(){
        return program;
    }
    void setProgram(String a){
        program=a;
    }
    int getyear(){
        return year;
    }
    void setYear(int y){
        year=y;
    }
    double getFee(){
        return fee;
    }
    void setFee(double f){
        fee=f;
    }
    String tostring(){
        return "name:"+name+" address:"+address+" program:"+program+" year:"+year+" fee:"+fee;
    }
}

class Staff extends Person{
    String school;
    double pay;
    Staff(String a,String b,String c,double d){
        super(a,b);
        school=c;
        pay=d;
    }
    String getSchool(){
        return school;
    }
    void setSchool(String s){
        school=s;
    }
    double getPay(){
        return pay;
    }
    void setPay(double p){
        pay=p;
    }
    String tostring(){
        return "name:"+name+" address:"+address+" school:"+school+"pay:"+pay;
    }
}
