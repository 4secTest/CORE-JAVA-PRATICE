public class ConvertandCalculate {

    static int result(String a, double b){

   int num1 = Integer.parseInt(a);

int num2 = (int) b;

return num2 + num1;
    }

    static void main() {
        System.out.println(result("12",2.5));
    }

}
