public class Operators {
    static void main() {

        //Assignment Operator

        int a, b, c;
        a = b = c = 10;
        System.out.println(a + b + c);

//        int x = 5;
//        if(x = 10) {} error due to x is already defined and the condition cannot true as assigning

        boolean d;
        if(d = true){
            System.out.println(d);

//            b = true assigns true to b and produces the value true.
//                    The if statement expects a boolean expression; here, the assignment expression produces true.
//                    So, the code is valid Java—even if it often signals a bug (you probably meant == for comparison).
//
        }

        // Arithmetic Operators

int nu1 = -8;
        int nu2 = 3;
        System.out.println(nu1 / nu2);

        System.out.println(10 / 3);
        System.out.println(10.0 / 3);

//        Integer division (/ with two ints) discards the decimal part.
//        Floating-point division (/ with any double/float) keeps the decimal/fraction.
//        java automatically do this

        System.out.println(-10 % 3);
        System.out.println(-10.0 % 3);

        //Order of Operations

        int x = 10;
        System.out.println(x++ + x++);

        int s = 5;
        s = s++ + ++s;
        System.out.println(s);

        // Shorthand Operator

       byte   g = 4;
         g += 5;
        System.out.println(g);

        int u = 5;
        u += u++ + ++u;
        System.out.println(u);



    }
}
