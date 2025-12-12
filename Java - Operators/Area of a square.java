import java.util.Scanner;
public class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        double  side= sc.nextDouble();
        double areasquare = side*side;
        System.out.println(areasquare);
    }
}