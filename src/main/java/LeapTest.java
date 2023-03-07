public  class LeapTest {



    public  static boolean isLeap(Year year) {

        int yearL = getYear(year);
/**
 if(yearL % 400 == 0 )
 {
 return true;
 }
 */
        if (yearL % 100 == 0 && yearL % 400 == 0) {
            return true;
        } else if (yearL % 4 == 0 && yearL % 100 != 0) {
            return true;
        }
        return false;

    }

    private static int getYear(Year year)
    {

        return year.getYear();
    }

}
