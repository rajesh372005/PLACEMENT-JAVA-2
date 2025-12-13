import java.util.Scanner;
public class ProductSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int prod = a * b;
        if(prod > 0) {
            System.out.println("Prod is positive.");
        } else if(prod < 0) {
            System.out.println("Prod is negative.");
        } else {
            System.out.println("Prod is zero.");
        }
    }
}
