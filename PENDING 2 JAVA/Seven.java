import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), temp = n, sum = 0;
        while (n>0) {
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }
        System.out.println(temp == sum );
    }
}
