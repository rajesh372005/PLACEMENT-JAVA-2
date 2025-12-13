import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length: ");
        int side = sc.nextInt();

        int area = side * side;
        System.out.println("Area of square: " + area);
    }
}
