import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



    public class MemberVariableTest {
        MemberVariable object;
        @Before
        public void setUp()
        {

            object = new MemberVariable();
        }

        @After
        public void tearDown(){

            object = null;
        }

        @Test
        public void testSuccess() throws Exception{

            String expectedName = "Harry Potter";
            //Act
            String actualName = object.memberName("Harry Potter");
            //Assert
            assertEquals(expectedName,actualName);

            int expectedAge = 30;
            //Act
            int actualAge = object.memberAge(30);
            //Assert
            assertEquals(expectedAge,actualAge);

            String expectedSalary = "2500.3";
            //Act
            String actualSalary = object.memberSalary("2500.3");
            //Assert
            assertEquals(expectedSalary,actualSalary);

        }

        @Test
        public void testFailure() throws  Exception{
            //Act
            String actualName = object.memberName(null);
            //Assort
            assertNull(actualName);

            //Act
          /*  int actualAge = object.memberAge(0);
            //Assort
            assertNull(actualAge);*/

            //Act
            String actualSalary = object.memberSalary(null);
            //Assort
            assertNull(actualSalary);
        }
    }

