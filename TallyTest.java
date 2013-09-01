import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;


public class TallyTest {
    
    Tally t; // allows me to remove tally t= new tally(); from other methods
    
    @Before
    public void setUp(){
            t = new Tally();  // allows me to remove tally t= new tally(); from other methods
                                              // will be called first then each test cases
    }
    
    @Ignore
    @Test
    public void test() {
            fail("Not yet implemented");
    }
    
     //make new test cases
    
    @Test
    public void testInc(){
            //Tally t = new Tally();
            t.inc();
            assertEquals(1, t.getTally());
    }

    @Test
    public void testInc5(){
            //Tally t = new Tally();
            t.inc(5);
            assertEquals(5, t.getTally());
    }
    
    @Test
    public void testInlineInc(){
            //Tally t = new Tally();
            assertEquals(1, t.inc());
    }
    
    @Test
    public void testInc4inc5(){
            //Tally t = new Tally();
            t.inc(4);
            t.inc(5);
            assertEquals(9, t.getTally());
    }
    
    @Test
    public void testMaxInt()
    {
        t.inc(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, t.getTally());
    }
    
    @Test
    public void testMaxIntPlusOne()
    {
        t.inc(Integer.MAX_VALUE);
        t.inc();
        assertTrue(t.getTally() > Integer.MAX_VALUE);
    }
}