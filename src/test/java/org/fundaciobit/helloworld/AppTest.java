package org.fundaciobit.helloworld;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
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
       int resultat  = new App().suma(2, 4);
        assertEquals(resultat, 6);
        
        int resta = new Remainder().resta(5, 3);
        assertEquals(resta, 2);
        
       int resta2 =  new Remainder().suma(4, 2);
        assertEquals(resta2, 6);
    }
}
