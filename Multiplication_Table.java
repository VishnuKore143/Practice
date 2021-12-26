package CWH;
import java.util.Scanner;
public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(T+" X "+i+" = "+T*i);
        }
    }
}
