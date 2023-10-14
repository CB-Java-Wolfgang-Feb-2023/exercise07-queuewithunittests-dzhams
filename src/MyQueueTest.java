import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MyQueueTest {
    private MyQueue queue;

    @BeforeEach
    void setUp() {
        // Initialize a new queue with a size of 5 before each test
        queue = new MyQueue(5);
    }

    @Test
    @DisplayName("Test isEmpty() on an empty queue")
    void testIsEmptyOnEmptyQueue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    @DisplayName("Test isFull() on an empty queue")
    void testIsFullOnEmptyQueue() {
        assertFalse(queue.isFull());
    }

    @Test
    @DisplayName("Test enqueue() and dequeue() for one element")
    void testEnqueueDequeueOneElement() {
        queue.enqueue(42);
        assertEquals(42, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    @DisplayName("Test dequeue() on an empty queue")
    void testDequeueOnEmptyQueue() {
        assertEquals(-1, queue.dequeue());
    }

    @Test
    @DisplayName("Test isFull() on a full queue")
    void testIsFullOnFullQueue() {
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }
        assertTrue(queue.isFull());
    }

    @Test
    @DisplayName("Test enqueue() on a full queue")
    void testEnqueueOnFullQueue() {
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }
        queue.enqueue(6);
        assertFalse(queue.isFull());
    }

    @Test
    @DisplayName("Test isEmpty() on a non-empty queue")
    void testIsEmptyOnNonEmptyQueue() {
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
    }

}
