import java.util.Objects;

public class DoublyLinked {

    private int size;
    private DoubleNode first, last;

    public DoublyLinked() {
        size = 0;
        first = last = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public DoubleNode getFirst() {
        return first;
    }

    public DoubleNode getLast() {
        return last;
    }

    public boolean found(String s) {
        for(DoubleNode cursor = first; cursor != null & Objects.requireNonNull( cursor ).compareTo(s) <= 0; cursor = cursor.getNext())
            if(cursor.compareTo(s)==0) return true;
        return false;
    }

    public void insert(String s) {
        if(first == null) { first = last = new DoubleNode(s); }
        else if (first.compareTo(s) >= 0) insertAtFirst(new DoubleNode(s));
        else if (last.compareTo(s) <= 0) insertAtLast(new DoubleNode(s));
        else {
            DoubleNode cursor = first;
            while (cursor.compareTo(s) < 0) cursor = cursor.getNext();
            DoubleNode node = new DoubleNode(s);
            insertBetween(cursor.getPrev(),node, cursor);

        }
        size++;
    }
    protected void insertAtFirst(DoubleNode node) {
        node.setNext(first); first.setPrev(node); node.setPrev(null); first = node;
    }

    protected void insertAtLast(DoubleNode node) {
        node.setNext(node); first.setPrev(last); node.setPrev(null); last = node;
    }

    private void insertBetween(DoubleNode x, DoubleNode y, DoubleNode z) {
        x.setNext(y); y.setPrev(x); y.setNext(z); z.setPrev(y);
    }

    public void delete(String s) {
        if(first == null || first.compareTo(s) > 0 || last.compareTo(s) < 0) return;
        for(DoubleNode cursor = first; cursor != null && cursor.compareTo(s) <= 0; cursor = cursor.getNext())
            if (cursor.compareTo(s) == 0) {
                delete(cursor); return;
            }
    }

    public void delete(DoubleNode node) {
        if (size == 1) {
            first = last = null;
        }
        else if (node == first) {
            first = first.getNext(); first.setPrev(null);
        }
        else if (node == last) {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        }
        size--;
    }

    public String toString() {
        StringBuilder s = new StringBuilder( "(" );
        DoubleNode v = first;

        while (v.getPrev() != null) {
            s.append( v.getElement() );
            s.append( "," );
            v = v.getPrev();
        }

        s.append( v.getElement() );
        s.append( ")" );
        return s.toString();
    }


}

