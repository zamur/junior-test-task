package course.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Iterator;

import org.junit.Test;

import junit.framework.TestCase;


public class IntIteratorTest extends TestCase {
	
	@Test
	 public void testForeach() {
	        int[] arr = {1, 2, 3, 4, 5};
	        IntIterable intIterable = new IntIterable(arr);
	        Integer i = 0;
	        for (Integer el : intIterable) {
	            assertEquals(i + " element doesn't match", Integer.valueOf(arr[i]), el);
	            i++;
	        }
	        assertEquals("Didn't went throw array", i, Integer.valueOf(arr.length));
	    }

	    @Test
	    public void testBlankForeach() {
	        int[] arr = new int[0];
	        for (Iterator<Integer> iterator = new IntIterable(arr).iterator(); iterator.hasNext();) {
				
				assertFalse("Shouldn't come here", true);
			}
	    }
	
}

