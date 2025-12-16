import java.util.Scanner;
public class Thtn{
    static int sumDigits(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp > 9)
                temp = sumDigits(temp);
            if (temp == 1) System.out.print(i + " ");
        }
    }
}
