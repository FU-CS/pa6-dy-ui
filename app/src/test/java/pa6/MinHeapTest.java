
package pa6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class MinHeapTest {

     @Test
     void testInsert() {
         MinHeap heap = new MinHeap(5);
         heap.insert(5);
         heap.insert(3);
         heap.insert(8);
         heap.insert(1);
         heap.insert(2);
         assertEquals(1, heap.peek());
     }    
     
     @Test
     void testDelete() {
    	 MinHeap heap = new MinHeap(5);
         heap.insert(5);
         heap.insert(3);
         heap.insert(8);
         heap.insert(1);
         heap.insert(2);
         
         assertEquals(1, heap.delete());
         assertEquals(2, heap.delete());
         assertEquals(3, heap.delete());
         assertEquals(5, heap.delete());
         assertEquals(8, heap.delete());
         assertEquals(-1, heap.delete()); //empty
     }
     
     @Test
     void testPeek() {
    	 MinHeap heap = new MinHeap(5);
    	 assertEquals(-1, heap.peek()); //empty
         heap.insert(5);
         assertEquals(5, heap.peek());
     }
     
     @Test
     void testSizeIsEmpty() {
    	 MinHeap heap = new MinHeap(5);
    	 assertEquals(0, heap.size()); //empty
    	 assertEquals(true, heap.isEmpty());
         heap.insert(5);
         assertEquals(false, heap.isEmpty());
         assertEquals(1, heap.size()); // after insert
         heap.delete();
         assertEquals(true, heap.isEmpty());
         assertEquals(0, heap.size()); //after delete
     }
     
     @Test
     void testSort() {
    	 int[] arr =  {1, 6, 8, 9, 1, 0};
    	 int [] srt = {0, 1, 1, 6, 8, 9};
    	 assertTrue(Arrays.equals(srt, MinHeap.heapSort(arr)));
    	 
     }

}
