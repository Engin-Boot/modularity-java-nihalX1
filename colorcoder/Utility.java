package colorcoder;

public class Utility {
	
	static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = 
            (MajorColor) fromIndex(MajorColor.values(), zeroBasedPairNumber / MajorAndMinorColors.numberOfMinorColors);
        MinorColor minorColor =
            (MinorColor) fromIndex(MinorColor.values(), zeroBasedPairNumber % MajorAndMinorColors.numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }
    static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * MajorAndMinorColors.numberOfMinorColors + minor.getIndex() + 1;
    }
    
    public static IColor fromIndex(Object[] colors, int index) {
        for(Object obj: colors) {
        	IColor color = (IColor)obj;
            if(color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }

}
