import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		
		String result = (mark >= 30) ? "Pass" : "Fail";
        System.out.println(result);
	}
}