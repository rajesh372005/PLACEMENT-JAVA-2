import java.util.Scanner;
public class Frtn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, count = 0;

        while (count < n) {
            int num = sc.nextInt();
            if (num > 0) {
                sum += num;
                count++;
            }
        }
        System.out.println(sum);
    }
}
