package Practices;
import java.util.Scanner;
public class if_else {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=18 && age<=35) {
			System.out.println("You can come to the party!");
		}
		else {
			System.out.println("You cannot come to the party!");
		}
		
		
	}
}
