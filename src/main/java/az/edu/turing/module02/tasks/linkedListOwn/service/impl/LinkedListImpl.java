package az.edu.turing.module02.tasks.linkedListOwn.service.impl;

import az.edu.turing.module02.tasks.linkedListOwn.model.Node;
import az.edu.turing.module02.tasks.linkedListOwn.service.LinkedListInterface;

public class LinkedListImpl<T> implements LinkedListInterface<T> {
    public Node<T> head;
    public Node<T> tail;
    private int size;

    public LinkedListImpl() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void addHead(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    @Override
    public void addTail(T item) {
        Node<T> newNode = new Node<>(item);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public T removeHead() {
        if (head == null) {
            return null;
        }
        T data = head.data;
        head = head.next;
        size--;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    @Override
    public T removeTail() {
        if (tail == null) {
            return null;
        }
        if (head == tail) {
            T data = tail.data;
            head = null;
            tail = null;
            size--;
            return data;
        }
        Node<T> current = head;
        while (current.next != tail) {
            current = current.next;
        }
        T data = tail.data;
        tail = current;
        tail.next = null;
        size--;
        return data;
    }

    @Override
    public void insert(int index, T item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            addHead(item);
        } else if (index == size) {
            addTail(item);
        } else {
            Node<T> newNode = new Node<>(item);
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    @Override
    public void update(int index, T item) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = item;
    }

    @Override
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            removeHead();
        } else if (index == size - 1) {
            removeTail();
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }
    }

    @Override
    public void delete(T item) {
        if (head == null) {
            return;
        }
        if (head.data.equals(item)) {
            removeHead();
            return;
        }
        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(item)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }

    @Override
    public void deleteAll() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public T[] toArray() {
        T[] array = (T[]) new Object[size];
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            array[i] = current.data;
            current = current.next;
        }
        return array;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        return sb.append("null").toString();
    }
}
