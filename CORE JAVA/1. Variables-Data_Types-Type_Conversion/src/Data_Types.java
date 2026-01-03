public class Data_Types {
    static void main() {
//        int i;
//        float b;
//        double c;
//        byte f;
//        short u;
//        long m;
//        char l;
//        boolean you;

        byte b = 10;
        b =  (byte )(b + 1);
        System.out.println(b);

        short s = 5;
        s = (short)(s * 2);
        System.out.println(s);

        char c = 'A';
        int i = c;
        System.out.println(i);

        int first = 65;
        char second = (char)first;
        System.out.println(second);


//        float f = 10.5; error becuase default decimal value is double
        float f = 10.5f;
        float foo = 10; // because defualt value of integer is int and float is bigger then int


        double d = 100.04;
        long l = (long) d;
        int bar = (int) l;
        System.out.println(bar);


        System.out.println(10 + 20 + "Java");
        System.out.println("Java" + 10 + 20);
        //Now it becomes 30 + "Java", so 30 is converted to a string and concatenated:
      //  Result: "30Java"
        //
//        "Java" + 10 is evaluated first (since there's a string on the left):
//        "Java" + 10 = "Java10" (concatenation, not addition)
//        Then "Java10" + 20 = "Java1020" (concatenation again)
//        Result: "Java1020"
//        When the first operand is a number, normal addition happens until a string is encountered.
//                Once a string is found, the + operator does string concatenation for everything after.

        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte)(b1 + b2);

        char c1 = 'a';
        char c2 = 'b';
        System.out.println(c1 + c2);

        char cd = 65535;

        int x = 5;
        System.out.println(x++ + ++x);

        byte e = 127;
        e++;
        System.out.println(e);



        char ch = 'a';
        System.out.println((int)ch);

    }
}
