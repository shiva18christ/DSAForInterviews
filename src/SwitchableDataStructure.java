import java.util.Scanner;

public class SwitchableDataStructure {
    Node head;
    public boolean isStack;

    public SwitchableDataStructure() {
        this.head = null;
        this.isStack = true;

    }

    public void switchMode() {
        if (isStack == true) {
            isStack = false;
        } else {
            isStack = true;
        }
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return;
        }
        if (isStack == true) {
            node.next = head;
            head.previous = node;
            head = node;

        } else {
            Node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }

            tail.next = node;
            node.previous = tail;
            tail = node;
        }

    }

    public void deleteValue() {
        if (head == null) {
            System.out.println("No data found");
            return;
        }
        if (isStack == true) {
            if (head.next == null) {
                head = null;
                return;
            }
            head = head.next;
            head.previous = null;

        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.previous.next = null;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("No data found");
            return;
        }

        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;


        }
        System.out.println();
    }

    public void showMode() {
        if (isStack) {
            System.out.println("Stack");
        } else {
            System.out.println("Queue");
        }
    }

    public static void main(String[] args) {
        SwitchableDataStructure data = new SwitchableDataStructure();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a choice to proceed further:");
            System.out.println("1:Insert");
            System.out.println("2:delete");
            System.out.println("3:switchMode");
            System.out.println("4:display");
            System.out.println("5:Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value you want to insert");
                    int value = input.nextInt();
                    data.insert(value);
                    break;
                case 2:
                    data.deleteValue();
                    break;
                case 3:
                    data.switchMode();
                    break;
                case 4:
                    data.display();
                    break;
                case 5:
                    input.close();
                    return;
                default:
                    System.out.println("please enter a valid choice");
            }
        }


    }
}
