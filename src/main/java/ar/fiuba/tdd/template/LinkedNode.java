package ar.fiuba.tdd.template;

/**
 * Created by juanma on 28/08/16.
 */
public interface LinkedNode<T> {
    T getItem();

    LinkedNode<T> getLastNode(LinkedNode<T> previousNode);

    void setNextNodeWithItem(T nextItem);

    void setNextNode(LinkedNode<T> nextNode);

    LinkedNode<T> getNext();

    int getNumberOfSubsequentNodes();
}
