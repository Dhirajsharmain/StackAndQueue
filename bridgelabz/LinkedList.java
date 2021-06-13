package bridgelabz;

import java.util.NoSuchElementException;

public class LinkedList<T> {
    Node<T> head;

    /**
     * Method for Appending the specified element to the end of this list.
     *
     * @param value
     */
    public void add(T value) {
        Node<T> newNode = new Node<T>();
        newNode.data = value;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node<T> last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    /**
     * Method for printing the data inside the linkedlist.
     */
    public void show() {
        Node<T> node = head;
        if (node != null) {
            while (node.next != null) {
                System.out.println(node.data);
                node = node.next;
            }
            System.out.println(node.data);
        }
    }

    /**
     * Method for Inserting the specific element at the start of the list.
     *
     * @param value : Data to be inserted.
     */
    public void addAtStart(T value) {
        Node<T> newNode = new Node<>();
        newNode.data = value;
        newNode.next = head;
        head = newNode;
    }

    /**
     * Method for Inserting the data at specific index of the list.
     *
     * @param index : position at which to be inserted
     * @param data  : data to be inserted
     */
    public void addAtIndex(int index, T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;

        if (index == 0) {
            addAtStart(data);
        } else {
            Node<T> node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
        }
    }

    /**
     * Retrieve or fetch the first element of the Stack and The element retrieved does not get deleted or removed from the Stack.
     *
     * @return
     */
    public T peek() {
        final Node<T> firstElement = head;
        return (firstElement == null) ? null : firstElement.data;
    }

    /**
     * Pop an element from the top of stack.
     *
     * @return : The element at the front of this list
     * @throws NoSuchElementException : if this list is empty
     */
    public Node<T> pop() {
        final Node<T> f = head;
        if (f == null)
            throw new NoSuchElementException();
        return unlinkFirst(f);

    }

    public Node<T> unlinkFirst(Node<T> f) {
        Node<T> removedItem = head;
        Node<T> newHead = head.next;
        head = newHead;
        return removedItem;
    }

    /**
     * Method for removing the last element from the list.
     */
    public void popLast() {
        Node<T> tail = head;
        Node<T> prevNode = head;
        while (tail.next != null) {
            prevNode = tail;
            tail = tail.next;
        }
        prevNode.next = null;
    }

    /**
     * Method for searching the node by value.
     *
     * @param value : Value to be searched
     * @return
     */
    public int searchByValue(T value) {
        Node<T> currNode = head;
        int index = 0;
        if (null != currNode) {
            while ((null != currNode.next) || (null != currNode.data)) {
                if (currNode.data == value) {
                    break;
                }
                currNode = currNode.next;
                if (null == currNode) {
                    return -1;
                }
                index++;
            }
        }
        return index;
    }

    /**
     * Method For search index by value and insert new data at next index.
     *
     * @param searchValue: Data to be searched.
     * @param InsertValue: Data to be inserted.
     */
    public void searchAndInsert(T searchValue, T InsertValue) {
        int index = searchByValue(searchValue) + 1;
        addAtIndex(index, InsertValue);
    }

    /**
     * Removes the element at the specified position in this list
     *
     * @param index
     */
    public void popAtIndex(int index) {
        if (index == 0) {
            pop();
        } else {
            Node<T> prevNode = head;
            Node<T> currNode = head;
            for (int i = 0; i < index; i++) {
                prevNode = currNode;
                currNode = currNode.next;
            }
            prevNode.next = currNode.next;
        }
    }

    /**
     * Returns the size of elements in this list.
     *
     * @return : Count or size of list.
     */
    public int size() {
        Node<T> currNode = head;
        int count = 0;
        if (null != currNode) {
            while ((null != currNode.next) || (null != currNode.data)) {
                currNode = currNode.next;
                count++;
                if (null == currNode) {
                    break;
                }
            }
        }
        return count;
    }

}
