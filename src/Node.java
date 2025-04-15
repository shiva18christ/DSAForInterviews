public class Node {
    int value;
    Node next;
    Node previous;

    public Node(int data) {
        this.value = data;
        this.next = this.previous = null;
    }
}
