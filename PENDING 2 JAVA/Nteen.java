import java.util.Scanner;
class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n;
        System.out.println(String.valueOf(sq).endsWith(String.valueOf(n)));
    }
}
