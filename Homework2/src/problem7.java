import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if ( x<y & y<z  ){
            System.out.println("Increasing");
        }else if(x>y & y>z ){
            System.out.println("Decreasing");
        }else{
            System.out.println("Neither increasing or decreasing order");
        }

    }
}
