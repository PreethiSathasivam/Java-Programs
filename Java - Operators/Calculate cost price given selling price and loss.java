import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Selling Price : ");
        double sellingprice = sc.nextDouble();
        System.out.println("Enter Loss : "); 
        double loss = sc.nextDouble();
        
        double costprice = sellingprice+loss;
        System.out.println("Cost price : "+costprice);
        
    }
}