import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rollno = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Roll No:"+rollno+","+"Name:"+name);
    }
}