package bridgelabz;

public class Stack<T> {
    /**
     * Created a object of LinkedList class.
     */
    LinkedList<T> listObj = new LinkedList<T>();

    /**
     * Method for inserting (push) data into the stack.
     * @param value
     */
    public void push(T value) {
        listObj.addAtStart(value);
    }

    /**
     * Method for printing the stack data.
     */
    public void show() {
        listObj.show();
    }

    /**
     *  retrieve or fetch the first element of the Stack and The element retrieved does not get deleted or removed from the Stack.
     */
    public T peek() {
        return listObj.peek();
    }

    /**
     * pop or fatch an element from the top of stack.
     * @return : The element at the top of the stack.
     */
    public Node<T> pop() {
        return listObj.pop();

    }

}
