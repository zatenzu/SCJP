// $Id$
package be.zatenzu.scjp.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queuee
{
  public static void main(String[] args)
  {
    Queue<String> q = new PriorityQueue<>();
    //add()
    //add the element to the queue
    //throws java.lang.IllegalStateException: Queue full if the queue is full
    q.add("First");
    q.add("Second");
    
    //element();
    //Get the head but not remove
    //Throws NoSuchElementException if queue is empty
    System.out.println(q.element());//First
    System.out.println(q.element());//First
    
    //peek()
    //Get the head but not remove
    //return null if queue is empty
    System.out.println(q.peek());//Fist
    System.out.println(q.peek());//First
    
    //pool()
    //get head and remove head
    System.out.println(q.poll());
    System.out.println(q.poll());
    
    //offer()
    //add element to the queue
    //if the queue is full, return false and don't add the element
    ArrayBlockingQueue<String> abq = new ArrayBlockingQueue(2);
    System.out.println(abq.offer("First"));
    System.out.println(abq.offer("First"));
    System.out.println(abq.offer("First"));
  }
}
