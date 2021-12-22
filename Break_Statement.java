package Practices;
import java.util.*;
public class Break_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		for(int i=0; i<=100; i++) {
//			if(i==35) { 
//				break; // print only 34 numbers
//			}
//			System.out.println(i);
//		}
		

		for(int i=0; i<50; i++) {
			System.out.println(i);
			if(i==5) {
				System.out.println("now loop is ending");
				break;
			}
			System.out.println("end of the loop");
		}
	
	}

}
