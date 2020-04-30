import java.util.Scanner;

public class problem9 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt();
        if (x>0 & y>0){
            System.out.println("True!!!");
        }else if (x<0 & y<0){
            System.out.println("True!!!");
        }else{
            System.out.println("False!!!");
        }

    }
}
