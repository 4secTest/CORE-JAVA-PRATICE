public class Variables {
    static void main() {

int a,b,c,d,e,f,g;
int  A= 2;
int B= A;
String name = "Rohit";
final double pi = 3.14;


//        int x;
//        System.out.println(x);

//        int a = 10;
//        {
//            int a = 20;
//            System.out.println(a);
//        }
//
//        When the compiler sees int a = 20; in the inner block, it finds that a is already defined in the outer scope.
//        Java doesn't allow you to "shadow" a variable name in a nested block if both are local variables.


         a = 5;
         b = a;
        b = 10; // in local variable the actual value is copy


        int x = 10;
        change(x);
        System.out.println(x);
        System.out.println(changed(x));



        int o = 10;
        if (true) {
            int p = 20;
            System.out.println(x);
        }
        System.out.println(x);


    }
    static void change(int x) {
        x = 50;
    }

    static int changed(int t){

        t = 20;
        return  t;

    }
}