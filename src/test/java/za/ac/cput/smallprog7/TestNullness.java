package za.ac.cput.smallprog7;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TestNullness extends TestCase{
    @Test
    public void testNull() throws Exception{
        Nullness tp = new Nullness();
        assertNull(tp.getNm());
    }
    
}
