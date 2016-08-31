package ar.fiuba.tdd.template;

/**
 * Created by juanma on 28/08/16.
 */
public interface Queue<T> {
    boolean isEmpty();

    int size();

    void add(T item);

    T top();

    void remove();
}
