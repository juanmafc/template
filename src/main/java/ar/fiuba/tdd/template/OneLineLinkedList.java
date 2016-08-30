package ar.fiuba.tdd.template;

/**
 * Created by juanma on 28/08/16.
 */
public class OneLineLinkedList<T> implements LinkedList<T> {

    private LinkedNode<T> root = new OneLineLinkedNode<T>(null);

    @Override
    public int size() {
        return getFirstNode().getNumberOfSubsequentNodes();
    }

    private LinkedNode<T> getFirstNode() {
        return this.root.getNext();
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public void removeFirst() {
        this.root.setNextNode(this.getFirstNode().getNext());
    }

    @Override
    public void add(T item) {
        this.getFirstNode().getLastNode(this.root).setNextNodeWithItem(item);
    }

    @Override
    public T getFirst() {
        return getFirstNode().getItem();
    }
}
