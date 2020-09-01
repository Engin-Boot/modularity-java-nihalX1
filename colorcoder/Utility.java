package colorcoder;

public class Utility {
	
	static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = 
            MajorColor.fromIndex(zeroBasedPairNumber / MajorAndMinorColors.numberOfMinorColors);
        MinorColor minorColor =
            MinorColor.fromIndex(zeroBasedPairNumber % MajorAndMinorColors.numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }
    static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * MajorAndMinorColors.numberOfMinorColors + minor.getIndex() + 1;
    }
    
//    static <T extends Enum<T>> T getIndex(int index, Class<T> enumType) {
//    	
//    	for (T c : enumType.getEnumConstants()) {
//            if(c.get)
//       }
////    	e.getDeclaringClass().
////    	for(Object color: o.values()) {
////            if(color.getIndex() == index) {
////                //return color;
////            }
////        }
//    	//return null;
//    }

}
