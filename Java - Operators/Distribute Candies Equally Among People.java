import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of candies: ");
        int totalCandies = sc.nextInt();

        System.out.print("Enter number of people: ");
        int people = sc.nextInt();

        int candiesPerPerson = totalCandies / people;
        int remainingCandies = totalCandies % people;

        System.out.println("Each person gets: " + candiesPerPerson + " candies");
        System.out.println("Remaining candies: " + remainingCandies);
    }
}
