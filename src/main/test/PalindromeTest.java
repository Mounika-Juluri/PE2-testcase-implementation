
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {
    Palindrome object;
    @Before
    public void setUp()
    {

        object = new Palindrome();
    }

    @After
    public void tearDown(){

        object = null;
    }

    @Test
    public void testSuccess() {

        String expectedValue = "Palindrome";
        //Act
        String actualValue = object.reverse("abcdcba");
        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testFailure() {
        String expectedValue = "Palindrome";
        //Act
        String actualValue = object.reverse("abcd");
        //Assert
        assertNotEquals(expectedValue,actualValue);
    }
}
