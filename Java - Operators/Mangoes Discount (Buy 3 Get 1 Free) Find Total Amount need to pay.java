import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Mangoes : ");
        int total = sc.nextInt();
        System.out.println("Enter Price per Mango : "); 
        int price = sc.nextInt();
        
        int free = total/4;
        int pay = total - free;
        int amount = pay * price;
        
        System.out.println("Free Mangoes : "+free);
        System.out.println("Mangoes to pay : "+pay);
        System.out.println("Total Amount to Pay : "+amount);
        
    }
}