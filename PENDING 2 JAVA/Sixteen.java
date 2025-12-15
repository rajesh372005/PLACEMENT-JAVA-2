import java.util.Scanner;
class Sixteen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n, sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        System.out.println(sum == n );
    }
}
