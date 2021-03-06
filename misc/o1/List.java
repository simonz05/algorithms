/**
 * This list implementation is modelled after Google Go's container/list pkg.
 * http://golang.org/pkg/container/list/
 */

public class List<T> {
    private int len;
    private Node first;
    private Node last;

    /** Set len to zero */
    public List()
    {
        len = 0;
    }

    /** @return returns the first node in the list */
    public Node First() {
        return first;
    }

    /** @return returns the last node in the list */
    public Node Last() {
        return last;
    }

    /** @return returns true if list is empty  */
    public boolean IsEmpty() {
        if (len == 0)
            return true;
        return false;
    }

    /** @return returns the list's current lenght */
    public int Len() {
        return len;
    }

    /** Push adds a new node to the front of the list. */
    public <T> void Push(T data) {
        Node node = newNode(null, null, data);
        if (IsEmpty()) {
            first = node;
            last = node;
            len++;
        } else {
            InsertBefore(node, first);
        }
    }

    /** Remove a Node */
    public void Remove(Node node) {
        if (node.Prev() == null) {
            first = node.Next();
        } else {
            node.Prev().Next(node.Next());
        }
        if (node.Next() == null) {
            last = node.Prev();
        } else {
            node.Next().Prev(node.Prev());
        }
        node.Next(null);
        node.Prev(null);
        len--;
    }

    /** Move a node before the marker */
    public void Move(Node node, Node mark) {
        Remove(node);
        InsertBefore(node, mark);
    }

    /** Insert a new node after marked node in List. */
    public <T> void InsertAfter(T data, Node mark) {
        Node n = newNode(null, null, data);
        InsertAfter(n, mark);
    }

    /** Insert a new node before marked node in List. */
    public <T> void InsertBefore(T data, Node mark) {
        Node n = newNode(null, null, data);
        InsertBefore(n, mark);
    }

    /** Insert the node after marked node. */
    public void InsertAfter(Node node, Node mark) {
        if (mark.Next() == null) {
            last = node;
        } else {
            mark.Next().Prev(node);
        }
        node.Next(mark.Next());
        node.Prev(mark);
        mark.Next(node);
        len++;
    }

    /** Insert the node before marked node. */
    public void InsertBefore(Node node, Node mark) {
        if (mark.Prev() == null) {
            first = node;
        } else {
            mark.Prev().Next(node);
        }
        node.Prev(mark.Prev());
        node.Next(mark);
        mark.Prev(node);
        len++;
    }

    public void Print() {
        Node head = first;
        while (head != null) {
            System.out.print(head.Data() + " ");
            head = head.Next();
        }
        System.out.println();

    }

    /** @return return a new node. */
    private <T> Node newNode(Node next, Node prev, T data) {
        return new Node(next, prev, data);
    }

}
