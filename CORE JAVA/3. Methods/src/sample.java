public class sample {
    static  boolean isPalindrome(int x) {

            int OrigX = x;
            int rev = 0;
            while(x > 0){
                rev = x % 10;
                x /= 10;
            }
            if (rev == OrigX){
                return true ;
            }else {
                return false;
            }
        }

        public static void main(){
           int  x = 121;

            if(isPalindrome(x)){
                System.out.print("True");

            }else{
                System.out.print("False");
            }
        }
    }

