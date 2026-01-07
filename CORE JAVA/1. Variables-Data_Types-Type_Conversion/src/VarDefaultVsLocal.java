
public class VarDefaultVsLocal {
    static void main() {

        byte a ;
        short b ;
        int c ;
        long d;
        float e;
        double f;
        char g ;
        boolean h ;
        String statement ;

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);
//        System.out.println(h);

        VarDefaultVsLocal instanceAndStatic = new VarDefaultVsLocal();

        System.out.println(instanceAndStatic.a);
        System.out.println(instanceAndStatic.b);
        System.out.println(instanceAndStatic.c);
        System.out.println(instanceAndStatic.d);
        System.out.println(instanceAndStatic.e);
        System.out.println(instanceAndStatic.f);
        System.out.println(instanceAndStatic.g);
        System.out.println(instanceAndStatic.h);
        System.out.println(instanceAndStatic.statement);


    }
    byte a;
    short b;
    int c;
    long d ;
    float e ;
    double f;
    char g ;
    boolean h ;
    String statement ;

    static String field;


}
