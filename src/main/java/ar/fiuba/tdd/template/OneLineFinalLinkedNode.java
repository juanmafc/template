package ar.fiuba.tdd.template;

/**
 * Created by juanma on 28/08/16.
 */
public class OneLineFinalLinkedNode<T> implements LinkedNode<T> {

    @Override
    public T getItem() {
        throw new AssertionError();
    }

    @Override
    public LinkedNode<T> getLastNode(LinkedNode<T> previousNode) {
        return previousNode;
    }

    @Override
    public void setNextNodeWithItem(T nextItem) {
        //Nothing to do here
    }

    @Override
    public void setNextNode(LinkedNode<T> nextNode) {
        //Nothing to do here
    }


    @Override
    public LinkedNode<T> getNext() {
        throw new AssertionError();
    }

    @Override
    public int getNumberOfSubsequentNodes() {
        return 0;
    }
}
