import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class ArrayLists {
    static void main() {



  ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(7);
        System.out.println(list.get(3));
        System.out.println(list.size());


        for( int i = 0;i < list.size(); i++  ){
            System.out.println(list.get(i));
        }

        for (int x: list){
            System.out.println(x);
        }

        System.out.println(list.contains(6));
        System.out.println(list.contains(5));

        list.remove(2);

        for (int x: list){
            System.out.println(x);
        }
        list.add(2,3);

        for (int x: list){
            System.out.println(x);
        }

        list.set(4,70);
        System.out.println(list);

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        list.remove(3);
        list.remove(3);
        list.remove(3);
        list.remove(3);
        list.remove(3);
        list.remove(3);
        list.remove(3);
        list.remove(3);
        list.remove(3);
        list.remove(3);
        list.remove(3);

        list.trimToSize();

        ArrayList<Integer> newList = new ArrayList<Integer>(1155);
        System.out.println("So this has now internal array value is 1155");


        List<String > name = new ArrayList<>();
        System.out.println(name.getClass().getName());

       List<String > list2 =  Arrays.asList("helo", "how", "are", "you");
        System.out.println(list2.getClass().getName());
       String [] array2 ={"banana", "mango", "apple"};
        List<String> list3 = Arrays.asList(array2);
//        list3.add("hello");

        list3.set(2,"youtube");

        System.out.println(list3);
        System.out.println(list3.getClass().getName());

        List<Integer> ofList = List.of(1,3,4,4,5);

        List<Integer> modification  = new ArrayList<>(ofList);

        modification.add(1);
        System.out.println(modification);


        List<Integer> integers1 = new ArrayList<>();

        integers1.add(1);
        integers1.add(4);
        integers1.add(1);
        integers1.add(1);

        List<Integer> integers2 = List.of(2, 3, 4, 45, 5, 6);


        integers1.addAll(integers2);
        System.out.println(integers1);

        // OBject and index method

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("kiwi");
        fruits.add("Orange");
        fruits.add("date");
        fruits.add("Banana");

        fruits.remove("Apple");
        System.out.println(fruits);

        ArrayList<Integer> table = new ArrayList<>();
        table.add(2);
        table.add(4);
        table.add(6);
        table.add(8);
        table.add(10);
        table.add(12);
        table.add(14);

        table.remove(Integer.valueOf(2));
        System.out.println(table);


        // List to array

        Object[] array = table.toArray();

        Integer[] array1 = table.toArray(new Integer[0]);

        System.out.println(array1.getClass().getName());

    }

}
