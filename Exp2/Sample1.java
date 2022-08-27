package exp2;
import java.util.Scanner;
public class Sample1 {
    public static void main(String[] args){
     int x;
     Scanner inp=new Scanner(System.in);
     Eb_details[] a1=new Eb_details[10]; 
     System.out.println("Enter the no. of customers:");
     int n=inp.nextInt();
     for(int i=0;i<n;i++){
         a1[i]=new Eb_details();
         a1[i].getdetails();
     }
     System.out.println("enter the cno. to display bill:");
     x=inp.nextInt();
     for(int i=0;i<n;i++){
         if(a1[i].cno==x){
             a1[i].displayprice();
         }
     }
    }
}

class Eb_details{
    int cno,prev,curr;
    String cname;
    String type;
    double tariff;
    void getdetails(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the the following details of customer:");
        System.out.println("enter no.:");
        cno= in.nextInt();
        System.out.println("Enter name:");
        cname=in.next();
        System.out.println("Enter the prev and curr month reading:");
        prev=in.nextInt();
        curr=in.nextInt();
        System.out.println("Enter type:");
        type=in.next();
    }
    void displayprice(){
        switch(type){
            case "domestic":
               int x=curr-prev;
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
                 x=prev+curr;
               if(x<=100)
                   tariff=x*2;
              
               else if(x>100 && x<=200)
                   tariff=(x-100)*(4.5)+200;
            
               else if(x>200 && x<=500)
                   tariff=(x-200)*6+650;
            
               else
                   tariff=(x-500)*6+2450;
               break;
        }
        System.out.println("Bill amount for customer: "+cname+" is "+tariff);
    }
}
