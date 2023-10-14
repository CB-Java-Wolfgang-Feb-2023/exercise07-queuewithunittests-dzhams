public class MyQueue {
    private final int SIZE;
    private int[] queue;
    private int front, rear;

    public MyQueue(int SIZE) {
        this.SIZE = SIZE;
        queue = new int[SIZE];
        front = 0;
        rear = -1;
    }

    public boolean isFull() {
        return (rear - front + 1) == SIZE;
    }

    public boolean isEmpty() {
        return rear < front;
    }

    public void enqueue(int element) {
        if (!isFull()) {
            rear++;
            queue[rear] = element;
        } else {
            System.out.println("Die Warteschlange ist voll. Element konnte nicht hinzugefügt werden.");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int element = queue[front];
            front++;
            return element;
        } else {
            return -1; // Fehlercode für leere Warteschlange
        }
    }
}