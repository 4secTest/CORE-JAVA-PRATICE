public class ScopeAndLifetime {

    static void scopeDrill() {
        int x = 10; // outer x
        System.out.println("outside if: x = " + x);

        if (true) {
            int x2 = 20; // use different name for clarity
            System.out.println("inside if: outer x still accessible: x = " + x);
            System.out.println("inside if: x2 = " + x2);

            // int x = 20; //  WOULD NOT COMPILE: cannot declare a local variable 'x'
            // in an inner block when 'x' already exists in an enclosing scope
            // (Java does not allow this kind of shadowing for local variables)
        }

        // System.out.println(x2); //  WOULD NOT COMPILE: x2 is block-scoped to the if-block

        for (int i = 0; i < 3; i++) {
            System.out.println("inside for: i = " + i + ", x = " + x);
        }

        // System.out.println(i); //  WOULD NOT COMPILE: i is scoped only to the for-loop
    }


    static void main() {

        scopeDrill();


    }
}
