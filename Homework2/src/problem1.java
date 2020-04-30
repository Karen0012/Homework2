import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number");
        int a = scanner.nextInt();
        System.out.println("Second number");
        int b = scanner.nextInt();
        System.out.println("Third number");
        int c = scanner.nextInt();
        System.out.println("Fourth number");
        int d = scanner.nextInt();
        boolean i = a==b & b==c & c==d;
        if (i){
            System.out.println(i);
        }
        else{
            System.out.println(i);
        }
    }
}
