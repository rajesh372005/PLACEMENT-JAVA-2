import java.util.Scanner;
public class Ottt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last = n % 10;
        int first = n / 100;
        System.out.println(first + last);
    }
}
