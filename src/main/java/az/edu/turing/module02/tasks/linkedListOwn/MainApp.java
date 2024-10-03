package az.edu.turing.module02.tasks.linkedListOwn;

import java.util.Arrays;

import az.edu.turing.module02.tasks.linkedListOwn.service.impl.LinkedListImpl;

public class MainApp {
    public static void main(String[] args) {
        LinkedListImpl<Integer> list = new LinkedListImpl<>();

        list.addHead(1);
        list.addTail(2);
        list.addTail(3);
        list.addTail(4);

        System.out.println("Linked List after adding elements: " + list);

        System.out.println("Array: " + Arrays.toString(list.toArray()));

        list.removeHead();
        System.out.println("After removing head: " + list);

        list.removeTail();
        System.out.println("After removing tail: " + list);

        list.insert(1, 5);
        System.out.println("After inserting at index 1: " + list);

        list.update(1, 10);
        System.out.println("After updating index 1: " + list);

        list.delete(1);
        System.out.println("After deleting index 1: " + list);

        list.delete(Integer.valueOf(2));
        System.out.println("After deleting value 2: " + list);

        list.deleteAll();
        System.out.println("After deleting all elements: " + list);
    }
}
