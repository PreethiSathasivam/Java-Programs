import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter orginal price : ");
        double price = sc.nextDouble();
        System.out.println("Enter discount price : ");
        double discount = sc.nextDouble();
        
        double discountamount = (price * discount) / 100;
        double finalPrice = price - discountamount;
        
        System.out.println("Price after discount : "+finalPrice);
        
            
    }
}