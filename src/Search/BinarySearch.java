package Search;

public class BinarySearch{
	
	public static int binarySearch(int[] sorted, int test)
	{
		return binarySearch(sorted, test, 0, sorted.length-1);
	}

	private static int binarySearch( int[] sorted, int test, int loIndex, int hiIndex )
	{
		int midIndex = (loIndex+hiIndex)/2;
		
		if(loIndex <= hiIndex) {
			if(sorted[midIndex] == test) {
				return midIndex;
			}
			else if(sorted[midIndex] > test) {
				return binarySearch(sorted, test, loIndex, midIndex-1);
			}
			else if(sorted[midIndex] < test)
				return binarySearch(sorted, test, midIndex+1, hiIndex);
		}
		
		return -1;
	}
}