package Sort;

public class BubbleSort {

	/** 
	 * Constructor
	 */
	public BubbleSort() { 
		// nothing needs to be done
	}
		
	public void sort(int[] array) {
		int temp;
		for(int i=0; i < array.length-1; i++) {
			for(int j=0; j<array.length-i-1; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}	
}
