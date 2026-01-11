package While;
public class ConditionLogic {

    static void main() {

        int i = 50;
        int num = 1;

        while (num <= i){
            if (num % 2 == 0){
                System.out.println(num);
                num = num +2;
            }
           num++;
        }
    }
}
