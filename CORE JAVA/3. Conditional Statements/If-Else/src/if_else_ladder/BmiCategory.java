package if_else_ladder;

public class BmiCategory {
    public static void main(String[] args) {

        float weight = 70;
        float height = 1.75f;

        float bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
