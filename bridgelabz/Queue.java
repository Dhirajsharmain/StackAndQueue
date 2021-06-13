package bridgelabz;

public class Queue<T> {
    LinkedList<T> listObj = new LinkedList<T>();

    /**
     * Method for Adding elements to the queue.
     * @param value : Data to be added
     */
    public void enqueue(T value) {
        listObj.add(value);
    }

    /**
     * Method for printing the data of queue till the last node's next element is null
     */
    public void show() {
        listObj.show();
    }

    /**
     *Method for dequeue or remove the element at the front of the queue.
     * @return
     */
    public Node<T> dequeue() {
        return listObj.pop();

    }
}
