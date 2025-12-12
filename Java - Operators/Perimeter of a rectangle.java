import java.util.Scanner;
public class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double perimeterrec = 2*(length+breadth);
        System.out.println(perimeterrec);
    }
}