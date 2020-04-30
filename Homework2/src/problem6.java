import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int h = x / 3600,
        r = x % 3600,
        m = r / 60,
        s = r % 60;
        System.out.println("h ="+ h);
        System.out.println("m =" + m);
        System.out.println("s ="+ s);

    }
}
