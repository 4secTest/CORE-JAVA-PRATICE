package List;

import java.util.concurrent.CopyOnWriteArrayList;
public class CopyOnWriteArrayListClass {
    static void main() {

        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList();

        // "Copy on Write" means that whenever a write operation
        //like adding of removing an element
        // instead of directly modifying the existing list
        // a new copy of the list is created, and the modification is applied to the copy
        //  this ensures that other threads reading the list while it's being modified are unaffected

        // read operations : Fast and direct, since they happen in a stable list without interference from modification

        // write operations:  A new copy of the list is created for every modification
        // the refrence to the list is then updated so that subsequent reads use this new list.
    }
}
