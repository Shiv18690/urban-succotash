import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import org.junit.rules.ExpectedException;


import static org.hamcrest.MatcherAssert.assertThat;



public class LeapTestTest {


    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void isLeap(){

    assertThat("is the year Leap",LeapTest.isLeap(new Year(2000)));



    }

    @Test
    public void notALeap() throws Exception{


        thrown.expect(AssertionError.class);
        thrown.expectMessage("is the year Leap");
        assertThat("is the year Leap",LeapTest.isLeap(new Year(1700)));

        //LeapTest.isLeap(new Year(1700));

        //assertThat("is the year Leap",LeapTest.isLeap(new Year(1700)));

       // assertThat("is the year Leap",assertThrows(LeapTest.isLeap(new Year(1700))));



    }


    @Test
    public void isLeapSpecialYears(){

        assertThat("is the year Leap",LeapTest.isLeap(new Year(1852)));



    }



}