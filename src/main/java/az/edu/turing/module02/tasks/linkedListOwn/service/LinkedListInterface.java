package az.edu.turing.module02.tasks.linkedListOwn.service;

public interface LinkedListInterface<T> {
    void addHead(T item);

    void addTail(T item);

    T removeHead();

    T removeTail();

    void insert(int index, T item);

    void update(int index, T item);

    void delete(int index);

    void delete(T item);

    void deleteAll();

    T[] toArray();

    String toString();
}

