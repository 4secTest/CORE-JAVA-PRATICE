package While;

import java.util.Scanner;

public class Continue {
    static void main() {

        int i = 0;
        while (i < 30){
          i++;
            if(i % 3 == 0) {
                continue;
            }else {
                System.out.println(i);
            }
            }

    }
}
