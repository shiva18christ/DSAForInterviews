public class LinkedList {
    Node head;
    boolean isCircular;

    public LinkedList() {
        head = null;
        isCircular = false;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head.previous = node;
        head = node;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        node.previous = current;
        current = node;
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        for (Node node = head; node != null; node = node.next) {
            if (node.value == value) {
                node.previous.next = node.next;
                node.next.previous = node.previous;
                return;
            }
        }
        System.out.println("value not found in list");
    }

    public void display() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        if (head == null) {
            System.out.println("The list id empty");
            return;
        }
        Node current = head;
        Node temp = null;
        while (current != null) {
            temp = current.previous;
            current.previous = current.next;
            current.next = temp;
            current = current.previous;
        }
        head = temp.previous;
    }

    public void toggleList() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node current = head;
        while (current.next != null && current.next != head) {
            current = current.next;
        }
        if (!isCircular) {
            current.next = head;
            head.previous = current;
            isCircular = true;
            System.out.println("the list is now circular");
        } else {
            current.next = null;
            head.previous = null;
            isCircular = false;
            System.out.println("The list is now non circular");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.display();
        list.delete(30);
        list.display();
        list.reverse();
        list.display();
        list.addFirst(50);
        list.display();
        list.reverse();
        list.display();
        list.toggleList();
        list.toggleList();

    }
}
