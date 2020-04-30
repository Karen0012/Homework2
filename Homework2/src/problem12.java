import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String z = scanner.next();
        if (z.equals("*")){
            System.out.println(x+z+y+"="+(x*y));
        } else if (z.equals("+")){
            System.out.println(x+z+y+"="+(x+y));
        }else if (z.equals("-")){
            System.out.println(x+z+y+"="+(x-y));
        } else if (z.equals("/")){
            if (y==0){
                System.out.println("can't divide by 0");
            } else
            System.out.println(x+z+y+"="+(x/y)) ;

        }else {
            System.out.println("Only opetator");
        }
    }
}
