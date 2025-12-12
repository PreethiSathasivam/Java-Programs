import java.util.Scanner;
public class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double areacircle = Math.PI * radius * radius;
        System.out.println(areacircle);
    }
}