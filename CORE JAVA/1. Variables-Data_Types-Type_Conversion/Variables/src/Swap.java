public class Swap {

    static void main() {
// with third variable

        int a = 10;
        int b = 20;
        System.out.println("Value before swap");
        System.out.println("a=" + a);
        System.out.println("b="+ b);
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("Value After swap");

        System.out.println("a=" + a);
        System.out.println("b="+ b);

//        without third variable;

        System.out.println("Without third variable");

        int d = 25;
        int e = 50;
        System.out.println("Value before swap");
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println("value after swap");

        d = d + e;
        e = d - e;
        d = d - e;
        System.out.println("Value after swap");

        System.out.println("d = " + d);
        System.out.println("e = " + e);


    }
}
