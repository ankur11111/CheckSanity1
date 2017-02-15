package CheckSanity1.CheckSanity1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest1 
    extends TestCase
{
	 
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest1( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest1.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	
    	System.out.println("Hello 1 in checksanity1");
        assertTrue( true );
      
    }
    public void test2()
    {
    	
    	System.out.println("Hello 2 in checksanity1");
        assertTrue( true );
      
    }
    
    
    
}
