package test.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import test.MyApp;

/**
 * Unit test for simple MyApp.
 */
public class AppTest 
    extends TestCase
{
	MyApp app = new MyApp();
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testAddition() {
    	assertEquals(10, app.addition(5, 5));
    }
}
