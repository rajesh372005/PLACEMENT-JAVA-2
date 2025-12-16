import java.util.Scanner;
public class Stn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int temp = i, sum = 0, digits = 0;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            temp = i;
            while (temp > 0) {
                int d = temp % 10;
                sum += Math.pow(d, digits);
                temp /= 10;
            }
            if (sum == i) System.out.print(i + " ");
        }
    }
}
