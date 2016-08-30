package ar.fiuba.tdd.template;


/**
 * Created by juanma on 28/08/16.
 */
public class OneLineQueue<T> implements Queue<T> {

    private LinkedList<T> linkedList = new OneLineLinkedList<T>();

    @Override
    public boolean isEmpty() {
        return this.linkedList.isEmpty();
    }

    @Override
    public int size() {
        return this.linkedList.size();
    }

    @Override
    public void add(T item) {
        this.linkedList.add(item);
    }

    @Override
    public T top() {
        return this.linkedList.getFirst();
    }

    @Override
    public void remove() {
        this.linkedList.removeFirst();
    }
}
