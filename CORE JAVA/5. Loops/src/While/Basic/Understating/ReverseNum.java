package While;

public class ReverseNum {
    static void main() {

        int num = 34321;
        int result = 0;
        while(num > 0 ){

        int digit = num % 10;

            result = result * 10 + digit;

            num /= 10;
        }

        System.out.println(result);
    }
}
