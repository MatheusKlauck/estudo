package estudo.SinglyLinkedList.SLLTail;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public Node(T data) {
        this(data, null);
    }

    public String toString() {
        if (data == null)
            return "";
        return data.toString();

    }
}

public class SLLTail<T> {
    Node<T> head;
    Node<T> tail;
    private int size = 0;

    public void addToBack(T data) {
        // To add to back of a sll we just have to point the .next node of the head to
        // the new node with the new data.
        if (head == null) {
            head = new Node<T>(data);
            tail = head;
            size++;
            return;
        }

        Node<T> current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<T>(data);
        tail = current.next;
        size++;
        System.out.println(this.toString());
    }

    public void addToFront(T data) {
        if (head == null) {
            head = new Node<T>(data);
            tail = head;
            size++;
            return;
        }
        // To add to front, we have to

        // 1. create the new node object with data inside
        Node<T> nw = new Node<T>(data);

        // 2. set the next node of the new node with the pointer to the current head
        nw.next = head;

        // 3. point head to the new node
        head = nw;

        size++;
        System.out.println(this.toString());
    }

    public void removeFromBack() {
        // removing from back have some edge cases

        // 1. we cannot remove from an empty list, so we break the operation
        if (head == null)
            return;

        // 2. if the list have only 1 value (head), we simply set head as null
        if (head.next == null) {
            head = null;
            tail = null;
            size--;
        }

        // to remove from back in lists that we have 2+ nodes, we must:

        Node<T> current = head;

        // we iterate through the sll until we reach the previous node before the last
        // one;
        while (current.next.next != null) {
            current = current.next;
        }

        // we then remove the next value of the current node (last value of the list)
        current.next = null;
        tail = current;
        size--;
        System.out.println(this.toString());
    }

    public void removeFromFront() {
        if (head == null)
            return;

        if (head.next == null) {
            head = null;
            tail = null;
            size--;
        }

        // To remove from front we simply:

        // 1. Set the head to the next node;
        head = head.next;
        size--;
        System.out.println(this.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node<T> current = head;

        while (current != null) {
            sb.append(current.toString());
            if (current.next != null)
                sb.append(", ");
            current = current.next;
        }
        sb.append(" size: " + size);

        sb.append("| head: " + head.toString());

        sb.append("| tail: " + tail.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        SLLTail<Integer> sll = new SLLTail<Integer>();

        sll.addToBack(23);

        sll.addToBack(24);
        sll.addToBack(25);

        sll.addToFront(22);

        sll.removeFromBack();

        sll.removeFromFront();
    }
}
