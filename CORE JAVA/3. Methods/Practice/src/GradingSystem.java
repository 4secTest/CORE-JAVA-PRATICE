import java.util.Scanner;

public class GradingSystem {

    static char calculateGrade(String marks){
        int marks2 = Integer.parseInt(marks);

        if (marks2 >= 90 ){
            return 'A';
        }else if (marks2 <= 89 && marks2 > 75 ){
            return 'B';
        }else if (marks2 <= 74 && marks2 > 60){
            return 'C';
        }else if(marks2 <= 59 && marks2 > 40){
            return 'D';
        }else return 'F';

    }

    static void main() {
        Scanner io = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        String marks = io.next();

        System.out.print("Your Grade is " + calculateGrade(marks));
    }
}
