import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Salary : ");
        double basic = sc.nextDouble();
        double hra = 0.10*basic;
        double da = 0.05*basic;
        double gross = basic+hra+da;
        System.out.println("HRA : "+hra);
        System.out.println("DA : "+da);
        System.out.println("GROSS : "+gross);
        
    }
}