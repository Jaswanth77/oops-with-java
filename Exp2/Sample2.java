package exp2;
import java.util.Scanner;
public class Sample2 {
    public static void main(String[] args) {
        ElecBill obj=new ElecBill();
        obj.getDetails();
        obj.displayDetails();
    }
}

class ElecBill{
    int cno,prev,curr;
    String cname,type;

    void getDetails() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter customer no.:");
        cno = in.nextInt();
        System.out.println("Enter customer name:");
        cname = in.next();
        System.out.println("Enter type of the connection:");
        type = in.next();
        System.out.println("Enter prev month and curr month reading:");
        prev = in.nextInt();
        curr = in.nextInt();
    }

    void displayDetails(){
        double tariff=0;
        int x=curr-prev;
        switch(type){
            case "domestic":
                if(x<=100)
                    tariff=x*1;
                else if(x>100 && x<=200)
                    tariff=(x-100)*(2.5)+100;
                else if(x>200 && x<=500)
                    tariff=(x-200)*4+350;
                else
                    tariff=(x-500)*6+1550;
                break;

            case "commercial":
                if(x<=100)
                    tariff=x*2;
                else if(x>100 && x<=200)
                    tariff=(x-100)*(2.5)+200;
                else if(x>200 && x<=500)
                    tariff=(x-200)*6+650;
                else
                    tariff=(x-500)*7+2450;
                break;
        }
        System.out.println("The bill amount for the customer:"+cname+" is: "+tariff);

    }

}