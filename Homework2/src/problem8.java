import java.util.Scanner;
public class problem8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x = scanner.nextInt();
        if (x>0 & x<25 ){
            System.out.println("F");
        }else if(25<=x & x<45){
            System.out.println("E");
        }else if (45<=x & 50>x){
            System.out.println("D");
        }else if(50<=x & 60>x){
            System.out.println("C");
        }else if (60<=x & 80>x){
            System.out.println('B');
        }else if (80<=x){
            System.out.println("A");
        }
    }
}
