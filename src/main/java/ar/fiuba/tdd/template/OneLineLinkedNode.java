package ar.fiuba.tdd.template;

/**
 * Created by juanma on 28/08/16.
 */
public class OneLineLinkedNode<T> implements LinkedNode<T>{

    private LinkedNode<T> next = new OneLineFinalLinkedNode<T>();
    private T item = null;

    public OneLineLinkedNode(T item){
        this.setItem(item);
    }

    public void setItem(T item){
        this.item = item;
    }

    @Override
    public T getItem(){
        return this.item;
    }

    @Override
    public LinkedNode<T> getLastNode(LinkedNode<T> previousNode) {
        return this.getNext().getLastNode(this);
    }

    @Override
    public void setNextNodeWithItem(T nextItem) {
        this.next = new OneLineLinkedNode<T>(nextItem);
    }

    @Override
    public void setNextNode(LinkedNode<T> nextNode) {
        this.next = nextNode;
    }

    @Override
    public LinkedNode getNext() {
        return this.next;
    }


    public boolean hasNext(){
        return this.getNext() == null;
    }


    public int getNumberOfSubsequentNodes(){
        return this.getNext().getNumberOfSubsequentNodes() + 1;
    }

}
