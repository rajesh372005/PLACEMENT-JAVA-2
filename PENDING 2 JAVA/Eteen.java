import java.util.Scanner;
class Eteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n % 7 == 0 || n % 10 == 7) );
    }
}
