import java.util.Scanner;

public class Arrays {
    static void main() {
        Scanner input = new Scanner(System.in);
        //array declaration

        int[] newArray = {2,4,33,4354,21,4};

        int [] myArr = new int[10];
        // array access
        myArr[0] = 2;
        myArr[1] = 5;
        myArr[3] = 12;
        myArr[2] = 0;
        myArr[6] = 432;
        myArr[9] = 122;
        myArr[7] = 43;

//        int index = 2;

//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[5]);
//        System.out.println(myArr[9]);
//        System.out.println("Array length is " + newArray.length);

        // array traversal
//
//        int index = 0;
//        while (index < myArr.length){
//            System.out.println(myArr[index]);
//            index++;
//        }

        //array searching

        int [] searchingArray = {3,545,32,21,454,65,42,232,52,56};

        System.out.println("Welcome to array searching.....");
        System.out.print("Enter the number you want to Search: ");
        int num = input.nextInt();

        boolean isFound = isFound(searchingArray, num);
        if (isFound){
            System.out.println("Your number is in the array");
        }else {
            System.out.println("Your number is complex not fount.");
        }


    }

    public static boolean isFound(int [] arr , int num) {

        int index = 0;
        while (index < arr.length){

            if (arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
