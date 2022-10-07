package Ej4;

public class LinearListImpl<T> implements LinearList<T>{
    private Node first;
    private int dim;

    @Override
    public void add(T obj) {
        Node current = first;
        if (first == null) {
            first = new Node(obj, null);
        } else {
            while (current.tail != null) {
                current = current.tail;
            }
            current.tail = new Node(obj, null);
        }
        dim++;
    }

    @Override
    public T get(int i) {
        Node current = findNode(i);
        return current.head;
    }

    @Override
    public int indexOf(T obj) {
        int index = 0;
        Node current = first;
        while (current != null && !current.head.equals(obj)) {
            current = current.tail;
            index++;
        }
        return current == null ? -1 : index;
    }

    @Override
    public void remove(int i) {
        if (i < 0 || first == null) {
            throw new IndexOutOfBoundsException();
        }
        if (i == 0) {
            first = first.tail;
        } else {
            Node previous = findNode(i-1);
            if (previous.tail == null) {
                throw new IndexOutOfBoundsException();
            }
            previous.tail = previous.tail.tail;
        }
        dim--;
    }

    @Override
    public void set(int i, T obj) {
        Node node = findNode(i);
        node.head = obj;
    }

    @Override
    public int size() {
        return dim;
    }

    private Node findNode(int i) {
        Node current = first;
        int index = 0;
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (current != null && index < i) {
            index++;
            current = current.tail;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException();
        }
        return current;
    }

    private class Node {

        private T head;
        private Node tail;

        Node(T head, Node tail) {
            this.head = head;
            this.tail = tail;
        }

    }

}
