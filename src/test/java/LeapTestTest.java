import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import static org.hamcrest.MatcherAssert.assertThat;


@RunWith(JUnitParamsRunner.class)
public class LeapTestTest {


    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    @Parameters({"2000"})
    public void isLeap(int year){

        //System.out.println(year);
    assertThat("is the year Leap",LeapTest.isLeap(new Year(year)));



    }

    @Test
    @Parameters({"1700","1800","1900","2100","2017","2018","2019"})
    public void notALeap(int year) throws Exception{

        //System.out.println(year);
        thrown.expect(AssertionError.class);
        thrown.expectMessage("year is leap");
        assertThat("year is leap",LeapTest.isLeap(new Year(year)));

        //LeapTest.isLeap(new Year(1700));

        //assertThat("is the year Leap",LeapTest.isLeap(new Year(1700)));

       // assertThat("is the year Leap",assertThrows(LeapTest.isLeap(new Year(1700))));



    }


    @Test
    @Parameters({"1852","2008","2012","2016"})
    public void isLeapSpecialYears(int year){

        assertThat("is the year Leap",LeapTest.isLeap(new Year(year)));



    }



}