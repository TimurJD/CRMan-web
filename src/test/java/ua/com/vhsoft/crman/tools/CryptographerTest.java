package ua.com.vhsoft.crman.tools;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
public class CryptographerTest {
    
    public CryptographerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMD5Hash method, of class Cryptographer.
     */
    @Test
    public void testGetMD5Hash() {
        System.out.println("getMD5Hash");
        byte[] bytesOfMessage = "123".getBytes();
        String expResult = "202cb962ac59075b964b07152d234b70";
        String result = Cryptographer.getMD5Hash(bytesOfMessage);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDoubleMD5Hash method, of class Cryptographer.
     */
    @Test
    public void testGetDoubleMD5Hash() {
        System.out.println("getDoubleMD5Hash");
        byte[] bytesOfMessage = "123".getBytes();
        String expResult = "d9b1d7db4cd6e70935368a1efb10e377";
        String result = Cryptographer.getDoubleMD5Hash(bytesOfMessage);
        assertEquals(expResult, result);
    }

    /**
     * Test of encode method, of class Cryptographer.
     */
    @Test
    public void testEncode() {
        System.out.println("encode");
        CharSequence cs = "123";
        Cryptographer instance = new Cryptographer();
        String expResult = "d9b1d7db4cd6e70935368a1efb10e377";
        String result = instance.encode(cs);
        assertEquals(expResult, result);
    }

    /**
     * Test of matches method, of class Cryptographer.
     */
    @Test
    public void testMatches() {
        System.out.println("matches");
        CharSequence cs = "123";
        String string = "d9b1d7db4cd6e70935368a1efb10e377";
        Cryptographer instance = new Cryptographer();
        boolean expResult = true;
        boolean result = instance.matches(cs, string);
        assertEquals(expResult, result);
    }
    
}
