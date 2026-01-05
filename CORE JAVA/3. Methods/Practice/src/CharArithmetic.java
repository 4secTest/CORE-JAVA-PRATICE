import java.util.Scanner;
import java.util.SimpleTimeZone;

public class CharArithmetic {


    static double calculateOperation(String a, String b, char c){

        double num1 = Double.parseDouble(a);
        double num2 = Double.parseDouble(b);

        double result = 0;
        if (c == '+') {
         result = num1 + num2;
        } else if  (c == '-') {
             result = num1 - num2;
        }else if(c=='*'){
          result = num1 * num2;
        }else if (c == '/'){
          result = num1 / num2;
        }else{
            System.out.println("Operator invalid");
        }

       return result;


    }

    static void main() {
        Scanner io = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        String num1 = io.next();
        System.out.print("Enter the number 2: ");
        String num2 = io.next();
        System.out.print("Enter the Operation you want: ");
        String input = io.next();
       char op = input.charAt(0);
        System.out.print(calculateOperation(num1,num2,op));

    }
}
