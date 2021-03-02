/*
* Sara Patyi
* Exam 1 2720
* Problem One
*/

class GenericArrayJava {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5};
		int[] arr1 = {0,1,2,3,5,6};

		int insertEl = 4;
		int insertIn = 2;

		isEmpty(arr);
		isEqual(arr, arr1);
		sizeOf(arr);
		print(arr);

		insertAt(arr, insertIn, insertEl);
		insertAt(arr1, insertIn, insertEl);

	}


	//method to see if the given array is empty or not
	public static void isEmpty (int[] x) {
		boolean empty;
		if (x.length > 0) {
			empty = false;
			System.out.println("This array isn't empty.");
		}
		else {
			empty = true;
			System.out.println("This array is empty.");
		}
	}


	//method to see if two given arrays are equal to one another
	public static void isEqual (int[] x, int[] y) {
		if (x.length == y.length) {
			boolean equal = true;

			for (int i = 0; i < x.length; i++) {
				
				if (x[i] == y[i]) {
					equal = true;
					
				}
				else {
					equal = false;
					
				}
			}

			if (equal == true) {
				System.out.println("The two arrays are equal to one another.");
			}
			else {
				System.out.println("The two arrays aren't equal to one another.");
			}
		}

		else {
			System.out.println("The two arrays aren't equal to one another.");
		}
	}


	//inefficient method for inserting an element at pre-specified index into a given array
	public static void insertAt (int[] x, int z, int e) {
		int arrSize = x.length + 1;
		int[] newArr = new int[arrSize];
		int increment = arrSize - z;

		for (int i = 0; i < x.length; i ++) {
			if (i < z) {
				newArr[i] = x[i];
			}
			else if (i == z) {
				newArr[z] = e;
			}
			else if (i == increment) {
				for (int j = (z+1); j <= increment; j++) {
					newArr[j] = x[j-1];
				}
				
			}
			
		}
		for (int j = 0; j < newArr.length; j++) {
			System.out.print(newArr[j] + " ");
		}
		System.out.println();
	}



	//method to print out the number of elements in the given array or the size of the array
	public static void sizeOf (int[] x) {
		System.out.println("This array has " + x.length + " elements in it.");
	}


	/*public static void removeDuplicates (int[] x) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] == x[i+1]) {
				int[] = 
			}
		}
	}*/



	//method for printing out the elements in the array
	public static void print (int[] x) {
		System.out.print("The array is as follows: ");
		for (int i = 0; i < x.length; i ++) {
			System.out.print( x[i] + " ");
		}
		System.out.println();
	}




	/*public static void sortArray (int[] x) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] > x[i + 1]) {
				int index = i + 1;

			}
		}
	}*/

}