import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side3: ");
        double c = sc.nextDouble();

        double perimeter = a + b + c;
        System.out.println("Perimeter of triangle: " + perimeter);
    }
}
