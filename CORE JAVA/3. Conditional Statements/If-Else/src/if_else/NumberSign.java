package if_else;

import java.util.Scanner;

public class NumberSign {
    static void main() {
        Scanner io = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = io.nextInt();
        if(num > 0){
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("negative");
        }else {
            System.out.println("num is zero");
        }
    }
}
