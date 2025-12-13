import java.util.Scanner;
public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int lastDigit = (n) % 10;
        if(lastDigit % 2 == 0) {
            System.out.println("Last digit is even.");
        } else {
            System.out.println("Last digit is odd.");
        }
    }
}
