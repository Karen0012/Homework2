import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Number ");
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println(x + " is positive");
        }
        if(x == 0){
            System.out.println(x + "  isn't negative or positive");
        } else {
            System.out.println(x +"x is negative");
        }
    }
}
