package if_else;

import java.util.Scanner;

public class EvenOddExtend {
    static void main() {
        Scanner io = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = io.nextInt();
        if(n % 2 == 0 && n > 10){
            System.out.println("Large Even");
        }else if(n % 2 == 0 && n <= 10){
            System.out.println("Small Even");
        }else if(n % 2 != 0 && n > 10){
            System.out.println("Large Odd");
        }else {
            System.out.println("Small odd");
        }
    }
}
