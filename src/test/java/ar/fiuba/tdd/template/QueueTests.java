package ar.fiuba.tdd.template;

/**
 * Created by juanma on 29/08/16.
 */


import junit.framework.AssertionFailedError;
import org.junit.Rule;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class QueueTests {


    @Test
    public void TestQueueIsEmptyWhenCreated() {
        Queue<String> queue = new OneLineQueue<>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void TestEmptyQueueSizeIsZero(){
        Queue<String> queue = new OneLineQueue<>();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    public void testAddingOneItemToAnEmptyQueueIncreasesItsSizeToOne(){
        Queue<String> queue = new OneLineQueue<>();
        queue.add("queue item1");
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.size());
    }

    @Test
    public void testEachItemAddedToAQueueIncressesItsSizeByOne(){
        Queue<String> queue = new OneLineQueue<>();
        int numberOfItems = 5;
        for (int i = 1; i <= numberOfItems; i++ ){
            queue.add(Integer.toString(i));
        }
        assertEquals(5, queue.size());
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testTheTopItemOfAQueueIsTheFirstItemAddedToTheQueue(){
        Queue<String> queue = new OneLineQueue<>();
        String firstItem = "firstItem";
        queue.add(firstItem);
        assertEquals(firstItem, queue.top());
    }

    @Test
    public void testRemovingAnItemFromAQueueWithOneItemEmptiesTheQueue(){
        Queue<String> queue = new OneLineQueue<>();
        String firstItem = "firstItem";
        queue.add(firstItem);
        queue.remove();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testRemovingAnItemFromAQueueDecreasesItsSizeByOne(){
        Queue<String> queue = new OneLineQueue<>();
        int numberOfItems = 5;
        for (int i = 1; i <= numberOfItems; i++ ){
            queue.add(Integer.toString(i));
        }
        for (int i = 1; i <= numberOfItems ; i++ ){
            queue.remove();
            assertEquals(numberOfItems - i, queue.size());
        }
    }

    @Test
    public void testQueueHasAFIFOStructure(){
        Queue<String> queue = new OneLineQueue<>();

        int numberOfItems = 8;
        String[] expectedItems = new String[numberOfItems];

        for (int i = 1; i <= numberOfItems; i++ ){
            String index = Integer.toString(i);
            queue.add(index);
            expectedItems[i-1] = index;
        }

        for (int i = 1; i <= numberOfItems; i++ ){
            assertEquals(expectedItems[i-1], queue.top());
            queue.remove();

        }
    }

    @Test (expected = AssertionError.class)
    public void testGettingTheTopItemOfAnEmptyQueueThrowsAssertionError(){
        Queue<String> queue = new OneLineQueue<>();
        queue.top();
    }

    @Test (expected = AssertionError.class)
    public void testRemovingAnItemFromAnEmptyQueueThrowsAssertionError(){
        Queue<String> queue = new OneLineQueue<>();
        queue.remove();
    }




}
