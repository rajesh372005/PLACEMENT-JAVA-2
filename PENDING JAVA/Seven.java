import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int ones = 0, zeros = 0;
        for (char ch : binary.toCharArray()) {
            if (ch == '1') ones++;
            else if (ch == '0') zeros++;
        }
        System.out.println("No of 1s: " + ones);
        System.out.println("No of 0s: " + zeros);
    }
}
