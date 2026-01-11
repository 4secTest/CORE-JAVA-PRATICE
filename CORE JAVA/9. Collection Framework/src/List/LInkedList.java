package List;

import java.util.Arrays;
import java.util.LinkedList;

public class LInkedList {
    static void main() {

//        Node node1 = new Node();
//        Node node2 = new Node();
//
//        node2.value = 2;
//        node1.value = 1;
//        node1.next = node2;
//        node2.next = null;

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(12);
        linkedList.add(133);

        System.out.println (linkedList.get(3)); // O(n) because loop

        linkedList.addLast(3); // O(1)
        linkedList.addFirst(3); // O(1)

        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        linkedList.remove(null);
        linkedList.remove(1);
        linkedList.removeIf(x -> x % 2 == 0);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "dog", "cow"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Cat", "dog", "elephant", "lion"));

        animals.removeAll(animalsToRemove);
        System.out.println(animals);


    }

//static class Node{
//        public int value;
//        public Node next; // refence to the next node
//}

}
