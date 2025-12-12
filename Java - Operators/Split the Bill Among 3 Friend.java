import java.util.Scanner;
public class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        double split = bill/3;

        System.out.println(split);
    }
}