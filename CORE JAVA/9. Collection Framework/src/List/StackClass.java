package List;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackClass {

    static void main() {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.push(7);
        stack.push(1);
        System.out.println(stack);

        Integer removedElement = stack.pop();
        System.out.println(stack);
        System.out.println(removedElement);
        Integer peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        stack.add(2,3); // In the middle of the stack because of vector extents
        stack.remove(3);
        System.out.println(stack);

        System.out.println( stack.search(3)); // 1 based indexing


        // Linked list as a Stack

        LinkedList <Integer> linkedList = new LinkedList<>();
        linkedList.addLast(3);
        linkedList.addLast(2);
        linkedList.addLast(74);
        linkedList.addLast(22);
        linkedList.addLast(232);
        linkedList.getLast(); // peek
        linkedList.removeLast(); // pop
        linkedList.size();
        linkedList.isEmpty();

        // Arraylist as a Stack

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(14);
        arr.add(3);
        arr.get(arr.size() -1); // peek
        arr.remove(arr.size() - 1); //pop










    }

}
