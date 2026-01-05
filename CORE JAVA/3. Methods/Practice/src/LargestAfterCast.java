import java.util.Scanner;

public class LargestAfterCast {

    static void largestAfterCasting(int a, double b, String c){

        int b1 = (int) b;
        int c1 = Integer.parseInt(c);

        if (a > b1){
            if(a > c1){
                System.out.println(a + " is the greatest");
            }
        }else if (b1 >c1){
            System.out.println(b1 + " is the greatest");
        }else {
            System.out.println(c1+ " is the greatest");
        }
    }

    static void main() {
        Scanner io = new Scanner(System.in);
        System.out.print("Enter the num1 in int: ");
        int num1 = io.nextInt();
        System.out.print("Enter the num2 in double: ");
        double num2 = io.nextDouble();
        System.out.print("Enter the num3 in String: ");
        String num3 = io.next();

        largestAfterCasting(num1,num2,num3);

    }
}
