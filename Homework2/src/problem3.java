import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Type 2 numbers");
        double i= scanner.nextDouble(),
        t = scanner.nextDouble();
        boolean x = i<1 & i>0 & t<1 & t>0;
        if (i< 1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
