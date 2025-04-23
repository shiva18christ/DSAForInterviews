public class DynamicQueue {
    int[] array;
    int capacity;
    int head;
    int tail;

    public DynamicQueue(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        this.tail = -1;
        this.head = 0;
    }

    public void resize() {
        capacity *= 2;
        int[] newQueue = new int[capacity];
        for (int i = 0; i <= tail; i++) {
            newQueue[i] = array[i];
        }
        array = newQueue;
    }

    public void enqueue(int element) {
        if (tail == capacity - 1) {
            resize();
        }
        array[++tail] = element;
    }

    public void dequeue() {
        if (tail == -1) {
            System.out.println("Queue is empty");
            return;
        }
        head++;
        readjust();

    }

    public void readjust() {
        int j = 0;
        for (int i = head; i <= tail; i++) {
            array[j++] = array[i];
        }
        head = 0;
        tail = j - 1;
    }

    public void display() {
        if (tail == -1) {
            System.out.println("The Queue is empty");
            return;
        }
        for (int i = head; i <= tail; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicQueue queue = new DynamicQueue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.display();
        queue.enqueue(5);
        queue.dequeue();
        queue.display();
    }
}
