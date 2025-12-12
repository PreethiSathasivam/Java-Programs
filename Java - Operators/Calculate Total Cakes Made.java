import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cakesperday = sc.nextInt();
        int days = sc.nextInt();

        int totaldays  = cakesperday*days;
        System.out.println("Totalcakes : "+totaldays);
        
    }
}
