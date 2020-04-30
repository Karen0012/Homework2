import java.util.Scanner;

public class problem4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number");
        int x= scanner.nextInt();
        int s= x % 2;
        if (s==1){
            System.out.println("False!!!");
        } else{
            System.out.println("True!!!");
        }


    }
}
