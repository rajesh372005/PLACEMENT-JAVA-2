import java.util.Scanner;
public class Twel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n >= 0 && n <= 9) {
            System.out.println("Single-digit number.");
        } else if(n >= 10 && n <= 99) {
            System.out.println("Two-digit number.");
        } else if(n >= 100 && n <= 999) {
            System.out.println("Three-digit number.");
        } else {
            System.out.println("No 3 digit");
        }
    }
}
