import java.util.Scanner;
public class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areatriangle = 0.5*base*height;
        System.out.println(areatriangle);
    }
}