import java.util.Scanner;
public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int x = a, y = b;

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        int lcm = (x * y) / a;
        System.out.println("LCM = " + lcm);
    }
}
