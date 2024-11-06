
package pa6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class MaxHeapTest {

     @Test
     void testInsert() {
         MaxHeap heap = new MaxHeap(5);
         heap.insert(5);
         heap.insert(3);
         heap.insert(8);
         heap.insert(1);
         heap.insert(2);
         assertEquals(8, heap.peek());
     }
     
     @Test
     void testDelete() {
    	 MaxHeap heap = new MaxHeap(5);
         heap.insert(5);
         heap.insert(3);
         heap.insert(8);
         heap.insert(1);
         heap.insert(2);
         
         assertEquals(8, heap.delete());
         assertEquals(5, heap.delete());
         assertEquals(3, heap.delete());
         assertEquals(2, heap.delete());
         assertEquals(1, heap.delete());
         assertEquals(-1, heap.delete()); //empty
     }
     
     @Test
     void testPeek() {
    	 MaxHeap heap = new MaxHeap(5);
    	 assertEquals(-1, heap.peek()); //empty
         heap.insert(5);
         assertEquals(5, heap.peek());
     }
     
     @Test
     void testSizeIsEmpty() {
    	 MaxHeap heap = new MaxHeap(5);
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
    	 int [] srt = {9, 8, 6, 1, 1, 0};
    	 assertTrue(Arrays.equals(srt, MaxHeap.heapSort(arr)));
    	 
     }

}
