import java.util.Scanner;

public class Rect {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length:");
        float l = sc.nextFloat();
        System.out.println("Enter Breadth");
        float b = sc.nextFloat();
        float area = l * b;
        float per = 2 * (l + b);
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + per);
    }
}
