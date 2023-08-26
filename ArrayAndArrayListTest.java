package arrayandarraylist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayAndArrayListTest {

	// declare myArrayAndArrayList which is the object for testing
	ArrayAndArrayList myArrayAndArrayList;
	
	@BeforeEach
	void setUp() throws Exception {
		// initialize myArrayAndArrayList for testing
		this.myArrayAndArrayList = new ArrayAndArrayList();
	}
	
	/**
	 * Test howMany method in ArrayAndArrayList.
	 */
	@Test
	void testHowMany() {
		// element in the array
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(2, this.myArrayAndArrayList.howMany(array, 1));
		assertEquals(2, this.myArrayAndArrayList.howMany(array, 3));
		
		// element not in the array
		assertEquals(0, this.myArrayAndArrayList.howMany(array, 10));
		assertEquals(0, this.myArrayAndArrayList.howMany(array, 0));
		assertEquals(0, this.myArrayAndArrayList.howMany(array, 8)); 
		
	}
	
	/**
	 * Test findMax method in ArrayAndArrayList.
	 */
	@Test
	void testFindMax() {
		// findMax in an nonEmpty array
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(9, this.myArrayAndArrayList.findMax(array));
		
		int[] array1 = {2, 4, 8, 12, 12, 4};
		assertEquals(12, this.myArrayAndArrayList.findMax(array1));

		int[] array2 = {1, 1, 1};
		assertEquals(1, this.myArrayAndArrayList.findMax(array2));

		int[] array3 = {0, 2};
		assertEquals(2, this.myArrayAndArrayList.findMax(array3));
		
	}

	/**
	 * Test maxArray method in ArrayAndArrayList.
	 */
	@Test
	void testMaxArray() {
		// test a valid array. 
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		ArrayList<Integer> testArrayList = new ArrayList<Integer>();
		testArrayList.add(9);
		assertEquals(testArrayList, this.myArrayAndArrayList.maxArray(array));
		
		int[] array_1 = {2, 4, 8, 12, 12, 4};
		ArrayList<Integer> testArrayList1 = new ArrayList<Integer>();
		// testArrayList1.add(12);  WRONG
		// can do:     ArrayList<Integer> testArrayList1 = new ArrayList<>(Arrays.asList(12, 12));
    	// 				assertEquals(testArrayList1, this.myArrayAndArrayList.maxArray(array_1));
		// OR can do: add 12 twice
		assertEquals(testArrayList1, this.myArrayAndArrayList.maxArray(array_1));

		int[] array_2 = {1, 1, 1};
		ArrayList<Integer> testArrayList2 = new ArrayList<Integer>();
		testArrayList2.add(1);
		testArrayList2.add(1);
		testArrayList2.add(1);
		assertEquals(testArrayList2, this.myArrayAndArrayList.maxArray(array_2));

		int[] array_3 = {0, 2};
		ArrayList<Integer> testArrayList3 = new ArrayList<Integer>();
		testArrayList3.add(2);
		assertEquals(testArrayList3, this.myArrayAndArrayList.maxArray(array_3));
		
	}

	/**
	 * Test swapZero method in ArrayAndArrayList.
	 */
	@Test
	void testSwapZero() {
		// test an array containing 0
		int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
		int[] testArray = {1, 2, 3, 5, 0, 0, 0, 0};
		this.myArrayAndArrayList.swapZero(array);
		assertArrayEquals(testArray, array);
		
		
		int[] array1 = {1, 3, 5, 7, 9, 10};
		int[] testArray1 = {1, 3, 5, 7, 9, 10};
		this.myArrayAndArrayList.swapZero(array1);
		assertArrayEquals(testArray1, array1);

		int[] array2 = {0, 0, 0, 1, 0, 0};
		int[] testArray2 = {1, 0, 0, 0, 0, 0};
		this.myArrayAndArrayList.swapZero(array2);
		assertArrayEquals(testArray2, array2);

		int[] array3 = {};
		int[] testArray3 = {};
		this.myArrayAndArrayList.swapZero(array3);
		assertArrayEquals(testArray3, array3);
		
	}
}
