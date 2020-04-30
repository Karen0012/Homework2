import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (z == x+y){
            System.out.println("True!!!");
        }else{
            System.out.println("False!!!");
        }
    }
}
