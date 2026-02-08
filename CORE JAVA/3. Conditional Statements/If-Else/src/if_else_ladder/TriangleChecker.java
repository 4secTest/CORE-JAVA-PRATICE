package if_else_ladder;

public class TriangleChecker {
    static void main() {

        int a = 4 , b =3, c = 2;

       if (a+b >c && b + c > a && a +c > b){

           if ( a == b && b == c && c == a){
               System.out.println("Equilateral");
           }else if(a == b || b == c || a == c){
               System.out.println("isosceles");
           }else {
               System.out.println("Scalene");
           }
       }else {
           System.out.println("Not a valid triangle");
       }

    }
}
