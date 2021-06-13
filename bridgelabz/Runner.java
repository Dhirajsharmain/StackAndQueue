package bridgelabz;

public class Runner {
    /**
     * Main method, It is the starting point of program.
     *
     * @param args
     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.show();
        System.out.println();
        while (stack.peek() != null) {
            System.out.println("First element of the stack is " + stack.peek());
            stack.pop();
            stack.show();
        }

        /**
         * Oueue Oprations Here
         */

        System.out.println();
        System.out.println("Oueue Oprations Here : ");
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println("Before Dequeue : ");
        queue.show();
        System.out.println("After Dequeue : ");
        queue.dequeue();
        queue.show();
    }

}
