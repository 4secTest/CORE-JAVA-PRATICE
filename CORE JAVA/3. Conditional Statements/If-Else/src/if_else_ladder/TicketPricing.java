package if_else_ladder;

public class TicketPricing {
    static void main() {

        int age = -43;

        if(age <= 2){
            System.out.println("Free");
        }else if(age <= 12){
            System.out.println("Child Ticket = 100");
        }else if (age <= 17){
            System.out.println("Teen Ticket = 150" );
        }else if (age <= 59){
            System.out.println("Adult ticket = 300");
        }else if(age >= 60){
            System.out.println("Senior Citizen = 200");
        }else {
            System.out.println("Invalid age");
        }



    }
}
