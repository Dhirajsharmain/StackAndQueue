package bridgelabz;

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
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
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
     * Method for removing the first element from the list.
     */
    public void pop() {
        if (null != head) {
            Node<T> newHead = head.next;
            head = newHead;
        }
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
     * @param searchValue: Data to be searched.
     * @param InsertValue: Data to be inserted.
     */
    public void searchAndInsert(T searchValue, T InsertValue){
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

    public void searchValueAndDelete (T searchValue){
        int index = searchByValue(searchValue);
        popAtIndex(index);
    }

    /**
     * Returns the size of elements in this list.
     *
     * @return
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
