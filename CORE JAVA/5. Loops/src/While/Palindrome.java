package While;

public class Palindrome {
    static void main() {
        int num = 121;
        int oriNum = num;
        int result = 0;

        while(num > 0 ){
                int digit = num % 10;
                result = result * 10 + digit;
                num /= 10;
            }

        if (oriNum == result){
            System.out.println("Yes Palindrome");
        }else {

            System.out.println("No Palindrome");
        }

        }
    }


