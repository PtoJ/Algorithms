package Sort;

public class SelectionSort {

	public void sort( int[] array ) {
		int min;
		int minIndex;
		
		for(int i=0; i<array.length-1; i++) {
			min = array[i];
			minIndex = i;
			for(int j=i+1; j<array.length; j++) {
				if(array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}
			array[minIndex] = array[i];
			array[i] = min;
		}
	}
}
