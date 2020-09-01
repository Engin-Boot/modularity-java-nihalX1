package colorcoder;

public class Main {
    
    public static void main(String[] args) {
        Tests.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        Tests.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        Tests.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        Tests.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
    
    public String toString() {
    	String colorManual="";
    	
    	for(int index = 1; index <= 25; index++) {
    		colorManual += index + " " + Utility.GetColorFromPairNumber(index).ToString()+"\n";
    	}
    	return colorManual;
    }
}
