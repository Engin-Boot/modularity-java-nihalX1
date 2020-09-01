package colorcoder;

import colorcoder.Utility.*;

public class Tests {
	
	static void testNumberToPair(int pairNumber,
	        MajorColor expectedMajor,
	        MinorColor expectedMinor)
	    {
	        ColorPair colorPair = Utility.GetColorFromPairNumber(pairNumber);
	        System.out.println("Got pair " + colorPair.ToString());
	        assert(colorPair.getMajor() == expectedMajor);
	        assert(colorPair.getMinor() == expectedMinor);
	    }

	    static void testPairToNumber(
	        MajorColor major,
	        MinorColor minor,
	        int expectedPairNumber)
	    {
	        int pairNumber = Utility.GetPairNumberFromColor(major, minor);
	        System.out.println("Got pair number " + pairNumber);
	        assert(pairNumber == expectedPairNumber);
	    }

}
