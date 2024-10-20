package Seminar7;

import java.util.Iterator;
import java.util.ListIterator;

public class TwoWayLinkedList<E> implements MyList<E> {
    private Node<E> head, tail;
    private int size;

    /** Create a default list */
    public TwoWayLinkedList() {
    }

    /** Create a list from an array of objects */
    public TwoWayLinkedList(E[] objects) {
        for (E e : objects)
            add(e);
    }

    /** Return the head element in the list */
    public E getFirst() {
        if (size == 0) {
            return null;
        } else {
            return head.element;
        }
    }

    /** Return the last element in the list */
    public E getLast() {
        if (size == 0) {
            return null;
        } else {
            return tail.element;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(", "); // Separate two elements with a comma
            } else {
                result.append("]"); // Insert the closing ] in the string
            }
        }

        return result.toString();
    }

    /** Clear the list */
    public void clear() {
        head = tail = null;
    }

    /** Return true if this list contains the element o */
    public boolean contains(Object e) {
        System.out.println("Implementation left as an exercise");
        return true;
    }

    /** Return the element from this list at the specified index */
    public E get(int index) {
        System.out.println("Implementation left as an exercise");
        return null;
    }

    /**
     * Return the index of the head matching element in this list. Return -1 if
     * no match.
     */
    public int indexOf(Object e) {
        System.out.println("Implementation left as an exercise");
        return 0;
    }

    /**
     * Return the index of the last matching element in this list Return -1 if
     * no match.
     */
    public int lastIndexOf(Object e) {
        System.out.println("Implementation left as an exercise");
        return 0;
    }

    /**
     * Replace the element at the specified position in this list with the
     * specified element.
     */
    public E set(int index, E e) {
        System.out.println("Implementation left as an exercise");
        return null;
    }

    private class LinkedListIterator implements java.util.ListIterator<E> {
        private Node<E> current = head; // Current index

        public LinkedListIterator() {
        }

        public LinkedListIterator(int index) {
            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: "
                        + size);
            for (int nextIndex = 0; nextIndex < index; nextIndex++)
                current = current.next;
        }

        public void setLast() {
            current = tail;
        }

        @Override
        public boolean hasNext() {
            return (current != null);
        }

        @Override
        public E next() {
            E e = current.element;
            current = current.next;
            return e;
        }

        @Override
        public void remove() {
            System.out.println("Implementation left as an exercise");
        }

        @Override
        public void add(E e) {
            System.out.println("Implementation left as an exercise");
        }

        @Override
        public boolean hasPrevious() {
            return current != null;
        }

        @Override
        public int nextIndex() {
            System.out.println("Implementation left as an exercise");
            return 0;
        }

        @Override
        public E previous() {
            E e = current.element;
            current = current.previous;
            return e;
        }

        @Override
        public int previousIndex() {
            System.out.println("Implementation left as an exercise");
            return 0;
        }

        @Override
        public void set(E e) {
            current.element = e; // TODO Auto-generated method stub
        }
    }

    private class Node<E> {
        E element;
        Node<E> next;
        Node<E> previous;

        public Node(E o) {
            element = o;
        }
    }

    @Override
    public int size() {
        return size;
    }

    public ListIterator<E> listIterator() {
        return new LinkedListIterator();
    }

    public ListIterator<E> listIterator(int index) {
        return new LinkedListIterator(index);
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

// BEGIN REVEL SUBMISSION
    /** Add an element to the beginning of the list */
    public void addFirst(E e) {
        // Write your code here
    }

    /** Add an element to the end of the list */
    public void addLast(E e) {
        // Write your code here
    }

    /**
     * Add a new element at the specified index in this list The index of the
     * head element is 0
     */
    public void add(int index, E e) {
        // Write your code here
    }

    /**
     * Remove the head node and return the object that is contained in the
     * removed node.
     */
    public E removeFirst() {
        // Write your code here
        return null;
    }

    /**
     * Remove the last node and return the object that is contained in the
     * removed node.
     */
    public E removeLast() {
        // Write your code here
        return null;
    }

    /**
     * Remove the element at the specified position in this list. Return the
     * element that was removed from the list.
     */
    public E remove(int index) {
        // Write your code here
        return null;
    }
}