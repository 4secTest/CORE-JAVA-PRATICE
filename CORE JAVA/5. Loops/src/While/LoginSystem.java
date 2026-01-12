package While;

import java.util.Scanner;

public class LoginSystem {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the password");
        String userpass = input.next();

        String pass = "RohitDagur";
        int i = 3;
        while (i > 0){
            if(userpass.equals(pass)){
                System.out.println("Login Successful");
                break;
            }
                System.out.println("Wrong Password, try again...");
                i--;
          }
        }



    }

