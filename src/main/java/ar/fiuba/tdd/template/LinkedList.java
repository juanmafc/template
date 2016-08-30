package ar.fiuba.tdd.template;

/**
 * Created by juanma on 28/08/16.
 */
public interface LinkedList<T> {
    int size();
    void add(T item);
    T getFirst();

    boolean isEmpty();

    void removeFirst();
}
