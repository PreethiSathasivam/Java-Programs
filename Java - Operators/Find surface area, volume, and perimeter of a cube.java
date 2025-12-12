import java.util.Scanner;
public class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double surface = 6*(a*a);
        double volume = a*a*a;
        double perimeter = 12*a;
        System.out.println("Surface area : " + surface);
        System.out.println("Volume : " + volume);
        System.out.println("Surface Perimeter : " + perimeter);
    }
}