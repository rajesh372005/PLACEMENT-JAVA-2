import java.util.Scanner;
class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char lower = (char) (ch + 32);
        System.out.println("lowercase: " + lower);
    }
}
