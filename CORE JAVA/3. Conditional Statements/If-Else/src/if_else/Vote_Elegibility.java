package if_else;

import java.util.Scanner;

public class Vote_Elegibility {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Age");
        int age = input.nextInt();
        if(age  >= 18){
            System.out.println("Eligible for Voting");
        }else {
                System.out.println(18 - age + " year wait for voting ");
            }

    }
}
