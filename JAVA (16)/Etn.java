import java.util.Scanner;
public class Etn{
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int temp = i, sum = 0;
            while (temp > 0) {
                sum += fact(temp % 10);
                temp /= 10;
            }
            if (sum == i) System.out.print(i + " ");
        }
    }
}
