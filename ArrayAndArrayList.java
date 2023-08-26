package arrayandarraylist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

/**
 * Class with methods for working with and manipulating Arrays and ArrayLists. 
 */
public class ArrayAndArrayList {

	/**
	 * Counts the number of occurrences of the given element in the given array.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling howMany(array, 1) would return 2
     * - Calling howMany(array, 10) would return 0
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling howMany(array, 1) would return 0
     * 
	 * @param array to search
	 * @param element to search for
	 * @return number of times element is in array
	 */
	public int howMany(int[] array, int element) {
		int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {		// if element is found in array, count++
                count++;
            }
        }

        return count;
	}
	
	/**
	 * Finds the max number in the given array.
	 * If the array is empty, returns -1.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling findMax(array) would return 9
	 * 
	 * - For a defined array: int[] array = {2, 4, 8, 12, 12, 4};
     * - Calling findMax(array) would return 12
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling findMax(array) would return -1
     * 
	 * @param array to search
	 * @return max number in array
	 */
	public int findMax(int[] array) {
		if (array == null || array.length == 0) {
			return -1;  						// Empty array, return -1
		}
	
		int max = array[0];						//assumed max = 1st elem in array
	
		for (int i = 1; i < array.length; i++) {	// start at [1], as max assumed at[0]
			if (array[i] > max) {
				max = array[i];
			}
		}
	
		return max;

		// for (int i = 0; i < array.length; i++) {
		// 	if (array[i] > array[i + 1]) {		// if current > next, and so on.
		// 		return array[i];
		// 	}
		// }
		// return 0;
	}
	
	/**
	 * Keeps track of every occurrence of the max number in the given array.
	 * Returns an ArrayList that contains every occurrence of the max number.
	 * Uses the findMax(int[] array) method.
	 * If the array is empty, returns null.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling maxArray(array) would return an ArrayList containing 9
     * 
     * - For a defined array: int[] array = {2, 4, 8, 12, 12, 4};
     * - Calling maxArray(array) would return an ArrayList containing 12 and 12
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling maxArray(array) would return null
     * 
	 * @param array to search
	 * @return ArrayList containing every instance of the max
	 */
	public ArrayList<Integer> maxArray(int[] array) {
		if (array == null || array.length == 0) {
            return null; 					// Empty array, return null
        }

        int max = findMax(array);			// findMax is a built-in method == knows max already
        ArrayList<Integer> occurrences = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {	// all occurrences of max go into a new ArrayList
            if (array[i] == max) {
                occurrences.add(array[i]);	// appends whatever is at index to new ArrayList
            }
        }

        return occurrences;
    }

		// for (int i = 0; i < array.length; i++) {
		// 	if (array[i] == findMax(array)) {		// if current == max, and so on.
		// 		return maxArray(array);
		// 	}
		// }
		// return null;
	
	/**
	 * Puts all of the zeros in the given array, at the end of the given array.
	 * Updates the array itself.
	 * Maintains the order of the non-zeros.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
     * - Calling swapZero(array) would change the array to be: {1, 2, 3, 5, 0, 0, 0, 0};
     * 
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 10};
     * - Calling swapZero(array) wouldn't change the array, it would still be: {1, 3, 5, 7, 9, 10};
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling swapZero(array) wouldn't change the array, it would still be empty
     * 
	 * @param array to search for zeros
	 */
	public void swapZero(int[] array) {
		if (array == null || array.length <= 1) {
			return; // Nothing to swap or already in the correct state
		}
		
		int nonZeroIndex = 0;
		
			// Iterate through the array, moving non-zeros to the front
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {					// if current elem != 0 (value)
				if (i != nonZeroIndex) {			// if current elem != nonZeroIndex (index)
					array[nonZeroIndex] = array[i];	  // Assign the value of the non-zero element at index i to the position indicated by the nonZeroIndex. This effectively moves the non-zero element to the front of the array.
					array[i] = 0;			  // Assign the value of 0 to the position indicated by i. This effectively moves the zero element to the end of the array.
				}
				nonZeroIndex++;
			}
		}
	}
}