package SCA;
import java.util.Scanner;
public class AcceptingChar {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);
        System.out.println(ch);
    }
}
