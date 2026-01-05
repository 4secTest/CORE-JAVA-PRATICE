public class PerformanceEvaluator {

    public static void evaluatePerformance(int marks, double attendance, char grade) {
        // Check all criteria using logical AND and relational operators
        if (marks >= 40 && attendance >= 75.0 && grade != 'F') {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        // Example call: should print "Pass"
        evaluatePerformance(85, 80.5, 'B');
        // Example call: should print "Fail" (attendance too low)
        evaluatePerformance(90, 70.0, 'A');
        // Example call: should print "Fail" (grade is 'F')
        evaluatePerformance(55, 78.0, 'F');
    }
}