package List;

import java.util.*;

public class ArrayLists {
    static class integerComparator implements Comparator<Integer>{


        @Override
        public int compare(Integer o1, Integer o2) {

            // here we have 2 variable o1 nd o2 ok you if we need
//            to sort the array then that is the trick
            return o2 - o1;

            // 5 3
            //3 5

//            for decending order
//            return o2 - o3;
//            if here is the result in negative then o1 will stay that place
//                    if the result is in the positive then o1 goes to the o2 position
        }
    }

    static class StringLengthComparator implements Comparator<String>{

// We  can write the logic here what we want to compare
        // like in which order you want to sort the things

        @Override
        public int compare(String o1, String o2) {

            return o2.length() - o1.length();
        }
    }

class Student{
        private String name;
        private double gpa;


        public Student(String name, double gpa){
            this.name = name;
        this.gpa = gpa;
}

public String getName () {return name;}

    public double getGpa() {
        return gpa;
    }

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


        //shorting in arraylist

        ArrayList<Integer> shortingList = new ArrayList<>();

        shortingList.add(2);
        shortingList.add(23);
        shortingList.add(245);
        shortingList.add(1);
        shortingList.add(25);

        Collections.sort(shortingList);
        System.out.println(shortingList);

        shortingList.add(3);
        shortingList.add(545);
        shortingList.add(2);
        shortingList.add(66);

        shortingList.sort(new integerComparator());  // comparator natural order of shorting

        System.out.println(shortingList);


        List<String> Words = Arrays.asList("mango", "banana", "date");

        Words.sort( new StringLengthComparator());
        System.out.println(Words);

        // Lembda expression\


        Words.set(2 ,"YOutube");

        Words.sort((a, b) -> a.length() - b.length());
        System.out.println(Words);
    }


} }
