public class DoubleNode {

    private String element; // String element stored by a node
    private DoubleNode next,prev; // References to next and previous nodes

    public DoubleNode(String s, DoubleNode prev, DoubleNode next) {
        element = s;
        this.prev = prev;
        this.next = next;

    }

    public DoubleNode(String s) {
        element = s; next = prev = null;
    }

    public String getElement() {
        return element;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setElement(String s) {
        element = s;
    }
    public void setPrev(DoubleNode next) {
        this.next = next;
    }

    public void setNext(DoubleNode prev) {
        this.prev = prev;
    }

    public String toString() {
        return element;

    }

    public int compareTo(String s) {
        return element.compareTo(s);
    }




}
