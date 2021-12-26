package CWH;
import java.util.Scanner;
public class Multiplication_Table_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=10; i>=1; i--){
            System.out.println(T+" X "+i+" = "+T*i);
        }
    }
}
