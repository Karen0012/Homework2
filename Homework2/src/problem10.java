import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x>y & x>z){
            System.out.println(x + " is the Greatest");
        }else  if(z>y & z>x){
            System.out.println(z +" is the Greatest");
        }else if(y>z & y>x){
            System.out.println(y +" is the greatest");
        }else if (x==y ||y==z||z==x){
            System.out.println("can't determine the greatest");
        }
        if(x<y & x<z){
            System.out.println(x + "  is the youngest");
        } else if(z<y& z<x){
            System.out.println(z +" is the youngest");
        } else if (y<x & y<z){
            System.out.println(y + " is the youngest");
        }else if (x==y || y==z || z==x){
            System.out.println("can't determine the youngest!!!");
        }
    }
}
