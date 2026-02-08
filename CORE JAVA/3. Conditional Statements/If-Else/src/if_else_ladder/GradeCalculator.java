package if_else_ladder;

public class GradeCalculator {
    static void main() {
        int marks = 60;
        if(marks >= 90 && marks <= 100){
            System.out.println("A+ Excellent");
        }else if(marks >= 80 && marks <= 89){
            System.out.println("A Good");
        }else if(marks >= 70 && marks <= 79 ){
            System.out.println("B Average");
        }else if(marks >= 60 && marks <= 69){
            System.out.println("C Below Average");
        }else if(marks >= 40 && marks <= 59){
            System.out.println("D Pass");
        }else {
            System.out.println("F Failed");
        }
    }
}
