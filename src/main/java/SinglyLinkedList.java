public class SinglyLinkedList {


    private Node head;
    private long size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public void addFront(String s) {
        head = new Node(s,head);
        size++;
    }

    public long size() {
        return size;
    }

    public Node getHead() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void removeFirst() throws ListException {
        if (!isEmpty()) {
            head = head.getNext(); size--;
        }
        else throw new ListException("attempted removal from an empty list");

    }


    public String toString() {
        Node cursor = head;
        StringBuilder s = new StringBuilder( "(" );
        while(cursor != null) {
            s.append( cursor );
            cursor = cursor.getNext();
            if (cursor != null) s.append( "," );
        }
        return s + ")";
    }

    public boolean isPresent(String s) {
        boolean found = false;
        Node cursor = head;
        while(cursor != null && !found) {
            found = cursor.getElement().equals(s);
            cursor = cursor.getNext();
        }
        return found;
    }

    public void insert(String s) {
        if (head == null || head.compareTo(s) > 0)
            head = new Node(s,head);
        else {
            Node cursor = head;
            Node next = cursor.getNext();
            while(next != null && next.compareTo(s) <= 0) {
                cursor = next; next = next.getNext();
            }
            cursor.setNext(new Node(s,next));
        }
        size++;
    }
}
