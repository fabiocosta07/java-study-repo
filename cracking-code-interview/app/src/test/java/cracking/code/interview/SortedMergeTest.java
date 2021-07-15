/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cracking.code.interview;

import org.junit.Test;
import static org.junit.Assert.*;

public class SortedMergeTest {
    @Test public void testExactEmptySpaceInA() {
        Integer[] a = new Integer[]{2,4,6,null,null,null};
        Integer[] b = new Integer[]{1,3,5};
        Integer[] result = SortedMerge.merge(a,b);
        assertTrue("merge sorted ", isSorted(result));
    }

    protected static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    public static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            if (less(a[i],a[i-1]))
                return false;
        }
        return true;
    }
}