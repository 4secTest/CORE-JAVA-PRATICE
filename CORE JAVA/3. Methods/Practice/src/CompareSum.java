import java.util.Scanner;

public class CompareSum {
    static void CompareSumAndCast(double a, double b, String c, String d){

        int num1 = (int) a;
        int num2 = (int) b;
        int num3 = Integer.parseInt(c);
        int num4 = Integer.parseInt(d);

        int  doubleSum = num1 + num2;
        int stringSum = num3 + num4;

        if(doubleSum > stringSum){
            System.out.println("Double sum is greater Which is "+ doubleSum);
        }
        else if (doubleSum < stringSum){
            System.out.println("String sum is greater Which is " + stringSum);
        }else {
            System.out.println("both sum are equal");
        }

    }

    static void main() {
        Scanner io = new Scanner(System.in);
        System.out.print("Enter the Num1 for double: ");
        double num1 = io.nextDouble();
        System.out.print("Enter the Num2 for double: ");
        double num2 = io.nextDouble();
        System.out.print("Enter the Num3 for String: ");
        String num3 = io.next();
        System.out.print("Enter the Num4 for String: ");
        String num4 = io.next();

        CompareSumAndCast(num1,num2,num3,num4);
    }
}