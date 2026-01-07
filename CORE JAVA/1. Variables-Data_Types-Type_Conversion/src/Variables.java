public class Variables {

    int x = 10;
    public static void scopeTrace(){

        int x = 1;

        if (true) {
            // int x = 2;
        }

    }

    static void main() {

        // Compile time error

        int x ;
        //System.out.println(x);
        {
            int a;
            //char a;
        }
        if (true){
            int y  =9;
            //int y  =9;
        }
      //  System.out.println(y);

        long num = 17l;
        //int num2 = num;

//        int u = null
//        Student s = null;  // Allowed: type specified
//        var s2 = (Student) null; // Allowed: type Student specified



        }

    }

