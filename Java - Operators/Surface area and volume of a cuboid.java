import java.util.Scanner;
public class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h= sc.nextDouble();
        double surface = 2*( (l*w) + (l*h) + (w*h));
        double volume = l*w*h;
        System.out.println("Surface area : " + surface);
        System.out.println("Volume : " + volume);
    }
}