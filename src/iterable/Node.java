package iterable;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

// write your code here
public class Node implements Iterable<Node> {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node (int data, Node next) {
        this.data = data;
        this.next = next;
    }

    @NotNull
    @Override
    public Iterator<Node> iterator() {
        NodeIterator ni = new NodeIterator(this);
        return ni;
    }
}

class NodeIterator implements Iterator<Node> {
    Node node;

    public NodeIterator(Node node) {
        this.node = node;
    }
    @Override
    public boolean hasNext() {
        return node == null;
    }

    @Override
    public Node next() {
        return node.next;
    }


}