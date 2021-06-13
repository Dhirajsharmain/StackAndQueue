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

}
