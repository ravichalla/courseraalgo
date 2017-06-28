import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {
       private Item[] queue;
       private int first;
       private int last;
       private int n;
	 public RandomizedQueue()                 // construct an empty randomized queue
	 {
       queue= (Item []) new Object[1];
       first=0;
       last=0;
       n=0;
		 
	 }
	   public boolean isEmpty()                 // is the queue empty?
	   {
		   return n==0;
	   }
	   public int size()                        // return the number of items on the queue
	   {
		   return n;
	   }
	   public void enqueue(Item item)           // add the item
	   {
		   if(item==null) throw new NullPointerException();
		   if(last==queue.length) resize(queue.length*2);
		   
	   }
	   public Item dequeue()                    // remove and return a random item
	   public Item sample()                     // return (but do not remove) a random item
	   public Iterator<Item> iterator()         // return an independent iterator over items in random order
	   public static void main(String[] args)   // unit testing (optional)
	
}
