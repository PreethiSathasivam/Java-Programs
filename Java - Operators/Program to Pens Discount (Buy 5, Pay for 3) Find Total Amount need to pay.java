import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Pens : ");
        int total = sc.nextInt();
        System.out.println("Enter Price per pen : "); 
        int price = sc.nextInt();
        
        int groups = total/5;
        int remaining = total%5;
        int paypens = (groups * 3) + remaining;
        int amount = paypens*price;
        
         System.out.println("Pens with Offer Groups: " + groups);
        System.out.println("Remaining Pens: " + remaining);
        System.out.println("Total Pens to Pay For: " + paypens);
        System.out.println("Total Amount to Pay: " + amount);
        
    }
}