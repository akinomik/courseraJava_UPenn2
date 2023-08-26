package CustomIntegerArrayList;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class CustomIntegerArrayListTest {

	@Test
	void testGetArrayList() {
		
		//create a new empty CustomIntegerArrayList
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);
		assertEquals(lst1, arr1.getArrayList());

		ArrayList<Integer> arr4Elements = new ArrayList<Integer>();
		arr4Elements.add(100);
		arr4Elements.add(200);
		arr4Elements.add(500);
		
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList(arr4Elements);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(100);
		lst4.add(200);
		lst4.add(500);

		assertEquals(lst4, arr4.getArrayList());
		
		// Test case 1: CustomIntegerArrayList is empty -----------------------------
		CustomIntegerArrayList emptyArr = new CustomIntegerArrayList();

		ArrayList<Integer> emptyList = new ArrayList<>();

		assertEquals(emptyList, emptyArr.getArrayList());
	
		// Test case 2: CustomIntegerArrayList with a single element ----------------
		CustomIntegerArrayList singleElementArr = new CustomIntegerArrayList();
		singleElementArr.add(42);

		ArrayList<Integer> singleElementList = new ArrayList<>();
		singleElementList.add(42);

		assertEquals(singleElementList, singleElementArr.getArrayList());
	
		// Test case 3: CustomIntegerArrayList with repeated elements ----------------
		CustomIntegerArrayList repeatedElementArr = new CustomIntegerArrayList();
		repeatedElementArr.add(5);
		repeatedElementArr.add(5);
		repeatedElementArr.add(5);

		ArrayList<Integer> repeatedElementList = new ArrayList<>();
		repeatedElementList.add(5);
		repeatedElementList.add(5);
		repeatedElementList.add(5);

		assertEquals(repeatedElementList, repeatedElementArr.getArrayList());
	
		// Test case 4: CustomIntegerArrayList with a mix of elements ----------------
		CustomIntegerArrayList mixedElementArr = new CustomIntegerArrayList();
		mixedElementArr.add(1);
		mixedElementArr.add(2);
		mixedElementArr.add(3);
		mixedElementArr.add(4);

		ArrayList<Integer> mixedElementList = new ArrayList<>();
		mixedElementList.add(1);
		mixedElementList.add(2);
		mixedElementList.add(3);
		mixedElementList.add(4);

		assertEquals(mixedElementList, mixedElementArr.getArrayList());
	
		// Test case 5: CustomIntegerArrayList with large numbers --------------------
		CustomIntegerArrayList largeNumberArr = new CustomIntegerArrayList();
		largeNumberArr.add(1000000);
		largeNumberArr.add(999999);

		ArrayList<Integer> largeNumberList = new ArrayList<>();
		largeNumberList.add(1000000);
		largeNumberList.add(999999);

		assertEquals(largeNumberList, largeNumberArr.getArrayList());
	}

	@Test
	void testGet() {
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// Test case 1: Get from an empty CustomIntegerArrayList (should throw IndexOutOfBoundsException) ---
		CustomIntegerArrayList emptyArr = new CustomIntegerArrayList();
		assertThrows(IndexOutOfBoundsException.class, () -> emptyArr.get(0));

		// Test case 2: Get from a CustomIntegerArrayList with a single element -----------------------------
		CustomIntegerArrayList singleElementArr = new CustomIntegerArrayList();
		singleElementArr.add(42);

		ArrayList<Integer> singleElementList = new ArrayList<Integer>();
		singleElementList.add(42);

		assertEquals(singleElementList.get(0), singleElementArr.get(0));

		// Test case 3: Get from a CustomIntegerArrayList with repeated elements ----------------------------
		CustomIntegerArrayList repeatedElementArr = new CustomIntegerArrayList();
		repeatedElementArr.add(5);
		repeatedElementArr.add(5);
		repeatedElementArr.add(5);

		ArrayList<Integer> repeatedElementList = new ArrayList<Integer>();
		repeatedElementList.add(5);
		repeatedElementList.add(5);
		repeatedElementList.add(5);

		assertEquals(repeatedElementList.get(0), repeatedElementArr.get(0));
		assertEquals(repeatedElementList.get(1), repeatedElementArr.get(1));
		assertEquals(repeatedElementList.get(2), repeatedElementArr.get(2));

		// Test case 4: Get from a CustomIntegerArrayList with a mix of elements ----------------------------
		CustomIntegerArrayList mixedElementArr = new CustomIntegerArrayList();
		mixedElementArr.add(1);
		mixedElementArr.add(2);
		mixedElementArr.add(3);
		mixedElementArr.add(4);

		ArrayList<Integer> mixedElementList = new ArrayList<Integer>();
		mixedElementList.add(1);
		mixedElementList.add(2);
		mixedElementList.add(3);
		mixedElementList.add(4);
		
		assertEquals(mixedElementList.get(0), mixedElementArr.get(0));
		assertEquals(mixedElementList.get(1), mixedElementArr.get(1));
		assertEquals(mixedElementList.get(2), mixedElementArr.get(2));
		assertEquals(mixedElementList.get(3), mixedElementArr.get(3));

		// Test case 5: Get from a CustomIntegerArrayList with negative index (should throw IndexOutOfBoundsException)
		CustomIntegerArrayList negativeIndexArr = new CustomIntegerArrayList();
		assertThrows(IndexOutOfBoundsException.class, () -> negativeIndexArr.get(-1));
	}

	@Test
	void testAddInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// ------------------------------------------------------------

		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(10);
		arr2.add(20);
		arr2.add(30);
		arr2.add(40);

		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(10);
		lst2.add(20);
		lst2.add(30);
		lst2.add(40);

		assertEquals(lst2.get(0), arr2.get(0));
		assertEquals(lst2.get(1), arr2.get(1));
		assertEquals(lst2.get(2), arr2.get(2));
		assertEquals(lst2.get(3), arr2.get(3));

		// ------------------------------------------------------------

		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(100);
		arr3.add(100);
		arr3.add(100);
		arr3.add(100);

		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(100);
		lst3.add(100);
		lst3.add(100);
		lst3.add(100);

		assertEquals(lst3.get(0), arr3.get(0));
		assertEquals(lst3.get(1), arr3.get(1));
		assertEquals(lst3.get(2), arr3.get(2));
		assertEquals(lst3.get(3), arr3.get(3));

		// ------------------------------------------------------------

		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(158);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(158);

		assertEquals(lst4.get(0), arr4.get(0));
	}

	@Test
	void testAddIntInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// ------------------------------------------------------------------

		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0, 10);
		arr2.add(0, 20);
		arr2.add(0, 30);		// 30 20 10

		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0, 10);
		lst2.add(0, 20);
		lst2.add(0, 30);

		assertEquals(lst2.get(0), arr2.get(0));
		assertEquals(lst2.get(1), arr2.get(1));
		assertEquals(lst2.get(2), arr2.get(2));

		// ------------------------------------------------------------------

		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(0, 100);
		arr3.add(1, 100);
		arr3.add(2, 100);			// 100 100 100

		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(0, 100);
		lst3.add(1, 100);
		lst3.add(2, 100);

		assertEquals(lst3.get(0), arr3.get(0));	
		assertEquals(lst3.get(1), arr3.get(1));
		assertEquals(lst3.get(2), arr3.get(2));

		// ------------------------------------------------------------------

		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(0, 158);
		arr4.add(1, 185);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(0, 158);
		lst4.add(1, 185);

		assertEquals(lst4.get(0), arr4.get(0));
	}

	@Test
	void testRemoveInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(0);
		arr1.remove(1);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);
		lst1.remove(0);
		lst1.remove(1);
		
		assertEquals(lst1.get(0), arr1.get(0));

		// ---------------------------------------------------------------
		
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0, 10);
		arr2.add(0, 20);
		arr2.add(0, 30);
		arr2.remove(0);
		arr2.remove(1);

		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0, 10);
		lst2.add(0, 20);
		lst2.add(0, 30);
		lst2.remove(0);
		lst2.remove(1);

		assertEquals(lst2.get(0), arr2.get(0));
		
		// ---------------------------------------------------------------

		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(0, 100);
		arr3.add(1, 100);
		arr3.add(2, 100);
		arr3.remove(0);
		arr3.remove(1);

		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(0, 100);
		lst3.add(1, 100);
		lst3.add(2, 100);
		lst3.remove(0);
		lst3.remove(1);

		assertEquals(lst3.get(0), arr3.get(0));

		// ---------------------------------------------------------------

		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(0, 158);
		arr4.add(1, 185);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(0, 158);
		lst4.add(1, 185);

		assertEquals(lst4.get(0), arr4.get(0));
	}

	@Test
	void testRemoveIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(3, 3);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals(lst1, arr1.getArrayList());

		// -------------------------------------------------------------------

		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0, 1);
		arr2.add(0, 2);
		arr2.add(0, 3);
		arr2.add(0, 4);
		arr2.remove(0, 2);
	
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0, 3);
		lst2.add(0, 4);
	
		assertEquals(lst2, arr2.getArrayList());

		// -------------------------------------------------------------------
	
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(0, 1);
		arr3.add(0, 2);
		arr3.add(0, 3);
		arr3.add(0, 4);
		arr3.remove(10, 2);
	
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(0, 1);
		lst3.add(0, 2);
		lst3.add(0, 3);
		lst3.add(0, 4);
	
		assertEquals(lst3, arr3.getArrayList());

		// -------------------------------------------------------------------

		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(0, 1);
		arr4.add(0, 2);
		arr4.add(0, 3);
		arr4.add(0, 4);
		arr4.remove(0, 10);		// remove more than the size of the array

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(0, 1);
		lst4.add(0, 2);
		lst4.add(0, 3);
		lst4.add(0, 4);

		assertEquals(lst4, arr4.getArrayList());
	}

	@Test
	void testSpliceIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);				// add 2, 3, 4, 5, 6
		arr1.splice(3, 2);		// remove 5, 6
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals(lst1.get(0), arr1.get(0));		// should get 2, 3, 4
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// ------------------------------------------------------------------

		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(10);
		arr2.add(20);
		arr2.add(30);
		arr2.add(40);
		arr2.add(50);				// add 10, 20, 30, 40, 50.
		arr2.splice(1, 3);		// remove 20, 30, 40
	
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(10);
		lst2.add(50);
	
		assertEquals(lst2.get(0), arr2.get(0));
		assertEquals(lst2.get(1), arr2.get(1));

		// ------------------------------------------------------------------
	
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(100);
		arr3.add(200);
		arr3.add(300);				// add 100, 200, 300
		arr3.splice(1, 5);		// remove 200, 300
	
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(100);
	
		assertEquals(lst3.get(0), arr3.get(0));

		// ------------------------------------------------------------------

		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(0, 158);
		arr4.add(1, 185);		// add 158, 185
		arr4.splice(0, 0);		// remove nothing

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(0, 158);
		lst4.add(1, 185);

		assertEquals(lst4.get(0), arr4.get(0));
	}

	@Test
	void testSpliceIntIntIntArray() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 1, new int[] { 4, 5 });
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(4);
		lst1.add(5);
		lst1.add(6);
		
		assertEquals(lst1, arr1.getArrayList());

		// ---------------------------------------------------------------

		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(10);
		arr2.add(20);
		arr2.add(30);
		arr2.add(40);
		arr2.add(50);
		arr2.splice(1, 3, new int[] { 20, 30, 40 });			// replace 20, 30, 40 with 20, 30, 40

		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(10);
		lst2.add(20);
		lst2.add(30);
		lst2.add(40);
		lst2.add(50);

		assertEquals(lst2, arr2.getArrayList());

		// ---------------------------------------------------------------

		CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
		arr3.add(100);
		arr3.add(200);
		arr3.add(300);
		arr3.splice(1, 5, new int[] { 300, 200 });			// replace 200, 300 with 300, 200

		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(100);
		lst3.add(300);
		lst3.add(200);

		assertEquals(lst3, arr3.getArrayList());

		// ---------------------------------------------------------------

		CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
		arr4.add(0, 158);
		arr4.add(1, 185);
		arr4.splice(0, 0, new int[] { 158, 185 });			// replace nothing with 158, 185

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(0, 158);
		lst4.add(1, 185);
		
		assertEquals(lst4, arr4.getArrayList());
	}

}
