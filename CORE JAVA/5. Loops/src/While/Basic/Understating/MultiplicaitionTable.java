package While;

public class MultiplicaitionTable {
    public static void Table(int n){
        int i = 1;
        while (i <= 10){
            int result = n * i;
            System.out.println(result);
            i++;
        }
    }

    static void main() {
        Table(34);
    }
}
