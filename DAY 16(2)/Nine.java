import java.util.Scanner;
public class Nine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();
        int decimal = 0;

        for (int i = 0; i < bin.length(); i++) {
            decimal = decimal * 2 + (bin.charAt(i) - '0');
        }
        System.out.println(decimal);
    }
}
