
import java.util.Scanner;

class UseCircle {
    public static void main(String[] args) {

        Circle obj = new Circle();
        Scanner sc  = new Scanner(System.in);
        int r = sc.nextInt();
        obj.setRadius(r);
        obj.calculateArea();
        obj.calculateCircumference();
    }    
}
