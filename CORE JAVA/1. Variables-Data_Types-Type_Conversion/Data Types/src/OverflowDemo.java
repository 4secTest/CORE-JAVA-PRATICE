public class OverflowDemo {
    static void main() {


        int a = Integer.MAX_VALUE;
        System.out.println(a);
        a = a + 1;
        System.out.println(a);  // wrap around after Overflow

        byte b = (byte) 130;
        System.out.println(b);




    }
}
