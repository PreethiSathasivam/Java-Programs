import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price : ");
        double costprice = sc.nextDouble();
        System.out.println("Enter Profit : "); 
        double profit = sc.nextDouble();
        
        double sellingprice = costprice+profit;
        System.out.println("Selling price : "+sellingprice);
        
    }
}