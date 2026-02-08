package if_else;

public class DividibilityChecker {
    static void main() {

       int n = 15;

       if(n % 3 == 0 && n % 5 == 0){
           System.out.println("Fizzbuzz");
       }else if(n % 3 == 0){
           System.out.println("fizz");
       }else if(n % 5 == 0){
           System.out.println("Buzz");
       }else {
           System.out.println("Your number not divisible " + n);
       }







    }
}
