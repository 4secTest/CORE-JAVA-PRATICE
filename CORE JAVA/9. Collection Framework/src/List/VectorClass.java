package List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorClass {
    static void main() {

        //      Constructor of Vector

        Vector<Integer> vector = new Vector<>(5,4);
        vector.add(2);
        vector.add(2);
        vector.add(2);
        vector.add(2);
        vector.add(2);
        System.out.println(vector.capacity());
        vector.add(4);
        System.out.println(vector.capacity()); //generally it increase double to its size but we can hardcode

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(23);
        linkedList.add(5);


        Vector<Integer> vector1 = new Vector<>(Arrays.asList(3,4,32,4));
        Vector<Integer> vector2 = new Vector<>(linkedList);
        System.out.println(vector1);
        System.out.println(vector2);


        //         METHODS OF VECTOR

        Vector<String> stringVector = new Vector<>();

        stringVector.add("Rohit");
        stringVector.add("Roy");
        stringVector.add("Ramu");
        stringVector.add("Manoj");
        stringVector.add("riya");
        stringVector.add("khushi");
        stringVector.add("neha");
        stringVector.add("Mohit");
        System.out.println(stringVector);

        stringVector.add(2,"Rexx");
        System.out.println(stringVector);
        System.out.println(stringVector.get(4));
        System.out.println(stringVector.set(3,"Syam"));
        System.out.println(stringVector.remove("syam"));
        System.out.println(stringVector.remove(5));
        System.out.println(stringVector.size());
        System.out.println(stringVector.isEmpty());
        System.out.println(stringVector.contains("Rohit"));

        stringVector.clear();

        System.out.println(stringVector);



    }
}
