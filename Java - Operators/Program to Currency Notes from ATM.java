import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();

        int n2000 = amount / 2000;
        amount %= 2000;

        int n500 = amount / 500;
        amount %= 500;

        int n200 = amount / 200;
        amount %= 200;

        int n100 = amount / 100;
        amount %= 100;

        int n50 = amount / 50;
        amount %= 50;

        int n20 = amount / 20;
        amount %= 20;

        int n10 = amount / 10;
        amount %= 10;

        System.out.println("2000 Notes: " + n2000);
        System.out.println("500 Notes : " + n500);
        System.out.println("200 Notes : " + n200);
        System.out.println("100 Notes : " + n100);
        System.out.println("50 Notes  : " + n50);
        System.out.println("20 Notes  : " + n20);
        System.out.println("10 Notes  : " + n10);
    }
}
