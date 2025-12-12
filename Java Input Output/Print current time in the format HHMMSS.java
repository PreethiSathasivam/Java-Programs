import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int hr = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();
        System.out.printf("%02d:%02d:%02d",hr,min,sec);
        }
}