import java.util.Random;

public class Test {
    public static void main(String[] args) {
    	
        SortingClass sortingClass = new SortingClass();
        ArrayGenerator arrayGenerator = new ArrayGenerator();
        SortingTimeMeasurer sortingTime = new SortingTimeMeasurer();

        // Input cases also tested for 100000, 1000000, 10000000 to better understand the result in milliseconds
        int[][] equalArrays = arrayGenerator.generateArrays(3, new int[]{1000, 10000, 100000}, false);
        int[][] randomArrays = arrayGenerator.generateArrays(3, new int[]{1000, 10000, 100000}, true);
        int[][] increasingArrays = arrayGenerator.generateArrays(true, 3, new int[]{1000, 10000, 100000});
        int[][] decreasingArrays = arrayGenerator.generateArrays(false, 3, new int[]{1000, 10000, 100000});

        // Time
        long[][] shellSortTimes = sortingTime.shellSort_Time(sortingClass, equalArrays, randomArrays, increasingArrays, decreasingArrays);
        long[][] dualPivotTimes = sortingTime.dualPivotQuickSort_Time(sortingClass, equalArrays, randomArrays, increasingArrays, decreasingArrays);
        
        System.out.println();
        System.out.println("					DUAL PIVOT QUICKSORT VS SHELLSORT");
        System.out.println();
        // Result
        printResultsTable(dualPivotTimes, shellSortTimes);
        System.out.println();
     
        /*
        // Test ShellSort Algorithm
        int[] shellSortArray = {55, 91, 12, 37, 68};
        System.out.println("Before ShellSort:");
        printArray(shellSortArray);
        sortingClass.shellSort(shellSortArray);
        System.out.println("After ShellSort:");
        printArray(shellSortArray);

        // Test DualPivotQuickSort Algorithm
        int[] dualPivotQuickSortArray = {55, 91, 12, 37, 68};
        System.out.println("Before DualPivotQuickSort:");
        printArray(dualPivotQuickSortArray);
        sortingClass.dualPivotQuickSort(dualPivotQuickSortArray);
        System.out.println("After DualPivotQuickSort:");
        printArray(dualPivotQuickSortArray);
        */
    }

    // Methods
    private static void printResultsTable(long[][] dualPivotTimes, long[][] shellSortTimes) {
        int rows = 4, cols = 3;

        System.out.println("\t\t\t\tDUAL PIVOT QUICKSORT\t\t\t\t\tSHELLSORT");
        System.out.println("\t\t\t---------------------------------------------------------------------------------------");
        System.out.println("Input Size\t\t1000\t\t10000\t\t100000\t\t1000\t\t10000\t\t100000");
        System.out.println("\t\t\t---------------------------------------------------------------------------------------");
        String[] rowHeaders = {"Equal Integers", "Random Integers", "Increasing Integers", "Decreasing Integers"};

        for (int i = 0; i < rows; i++) {
            if(i != 2 && i != 3) { // Separating increasing and decreasing case for the table to be in the same line
                System.out.print(rowHeaders[i] + "\t\t");

            }else {
                System.out.print(rowHeaders[i] + "\t");
            }
            for (int j = 0; j < cols; j++) {
                System.out.print(dualPivotTimes[i][j] + "\t\t");
            }
            for (int j = 0; j < cols; j++) {
                System.out.print(shellSortTimes[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    // testing print the sort array at the end to make sure the algorithm worked properly 
    private static void printArray(int[] array) {
    	for (int i = 0; i < array.length; i++) {
        	System.out.print(array[i]);
        	if (i != array.length - 1) {
            	System.out.print(" ");
        	}
    	}
    	System.out.println();
	}

    // Inner Classes
    public static class SortingTimeMeasurer{
    	
    	public long[][] shellSort_Time(SortingClass sortingClass, int[][] equalArrays, int[][] randomArrays, int[][] increasingArrays, int[][] decreasingArrays) {
            long[][] sortingTimes = new long[4][3]; // Rows represent input types, columns represent array sizes

            // Equal Integers case
            for (int i = 0; i < equalArrays.length; i++) {
                //long startTime = System.currentTimeMillis();
                long startTime = System.nanoTime();
                sortingClass.shellSort(equalArrays[i]);
                //sortingTimes[0][i] = System.currentTimeMillis() - startTime;
                sortingTimes[0][i] = System.nanoTime() - startTime;
            }

            // Random Integers case
            for (int i = 0; i < randomArrays.length; i++) {
                //long startTime = System.currentTimeMillis();
            	long startTime = System.nanoTime();
                sortingClass.shellSort(randomArrays[i]);
                //sortingTimes[1][i] = System.currentTimeMillis() - startTime;
                sortingTimes[1][i] = System.nanoTime() - startTime;
            }

            // Increasing Integers case
            for (int i = 0; i < increasingArrays.length; i++) {
                //long startTime = System.currentTimeMillis();
            	long startTime = System.nanoTime();
                sortingClass.shellSort(increasingArrays[i]);
                //sortingTimes[2][i] = System.currentTimeMillis() - startTime;
                sortingTimes[2][i] = System.nanoTime() - startTime;
            }

            // Decreasing Integers case
            for (int i = 0; i < decreasingArrays.length; i++) {
                //long startTime = System.currentTimeMillis();
            	long startTime = System.nanoTime();
                sortingClass.shellSort(decreasingArrays[i]);
                //sortingTimes[3][i] = System.currentTimeMillis() - startTime;
                sortingTimes[3][i] = System.nanoTime() - startTime;
            }

            return sortingTimes;
        }

    	public long[][] dualPivotQuickSort_Time(SortingClass sortingClass, int[][] equalArrays, int[][] randomArrays, int[][] increasingArrays, int[][] decreasingArrays) {
            long[][] sortingTimes = new long[4][3]; // Rows represent input types, columns represent array sizes

            // Equal Integers case
            for (int i = 0; i < equalArrays.length; i++) {
            	//long startTime = System.currentTimeMillis();
            	long startTime = System.nanoTime();
                sortingClass.shellSort(equalArrays[i]);
             	//sortingTimes[0][i] = System.currentTimeMillis() - startTime;
                sortingTimes[0][i] = System.nanoTime() - startTime;
            }

            // Random Integers case
            for (int i = 0; i < randomArrays.length; i++) {
            	//long startTime = System.currentTimeMillis();
            	long startTime = System.nanoTime();
                sortingClass.shellSort(randomArrays[i]);
                //sortingTimes[1][i] = System.currentTimeMillis() - startTime;
                sortingTimes[1][i] = System.nanoTime() - startTime;
            }

            // Increasing Integers case
            for (int i = 0; i < increasingArrays.length; i++) {
            	//long startTime = System.currentTimeMillis();
            	long startTime = System.nanoTime();
                sortingClass.shellSort(increasingArrays[i]);
                //sortingTimes[2][i] = System.currentTimeMillis() - startTime;
                sortingTimes[2][i] = System.nanoTime() - startTime;
            }

            // Decreasing Integers case
            for (int i = 0; i < decreasingArrays.length; i++) {
            	//long startTime = System.currentTimeMillis();
            	long startTime = System.nanoTime();
                sortingClass.shellSort(decreasingArrays[i]);
                //sortingTimes[3][i] = System.currentTimeMillis() - startTime;
                sortingTimes[3][i] = System.nanoTime() - startTime;
            }

            return sortingTimes;
        }
    }

    public static class SortingClass {
    	
    	// ShellSort  Algorithm
        public void shellSort(int[] arrayToSort) {
            int length = arrayToSort.length;
            for (int gap = length / 2; gap >= 1; gap /= 2) { // Array broke into SubArrays 
                for (int i = gap; i < length; i++) { 
                    int temp = arrayToSort[i];
                    int j;
                    for (j = i; j >= gap && arrayToSort[j - gap] > temp; j -= gap) { // subArrays goes to the correct position so the actual sorting happens here 
                    	arrayToSort[j] = arrayToSort[j - gap];
                    }
                    arrayToSort[j] = temp;
                }
            }
        }
        
    	// Dual Pivot QuickSort Algorithm
        public void dualPivotQuickSort(int[] arrayToSort) {
            if (arrayToSort == null || arrayToSort.length <= 1) {
                return; // Controlling if array is already sorted or empty
            } // now calling another dualPivotQuickSort function with more arguments
            dualPivotQuickSort(arrayToSort, 0, arrayToSort.length - 1);
        }

        private void dualPivotQuickSort(int[] array, int left, int right) {
            if (left < right) {
                int[] pivots = partition(array, left, right); // gives us the index value of pivot
                // Recursive functions starts to sort our array, our key here is pivots[0] from left to middle then the key is pivots[1] from middle to right
                dualPivotQuickSort(array, left, pivots[0] - 1); // Sort left subArray
                dualPivotQuickSort(array, pivots[0] + 1, pivots[1] - 1); // Sort middle subArray
                dualPivotQuickSort(array, pivots[1] + 1, right); // Sort right subArray
            }
        }

        private int[] partition(int[] array, int left, int right) {
            if (array[left] > array[right]) {
            	swap(array, left, right);
            }

            int smallerPivot = left + 1;
            int biggerPivot = right - 1;
            int i = left + 1;

            while (i <= biggerPivot) {
                if (array[i] < array[left]) {
                	swap(array, i, smallerPivot);
                	smallerPivot++;
                } else if (array[i] >= array[right]) {
                    while (array[biggerPivot] > array[right] && i < biggerPivot) {
                    	biggerPivot--;
                    }
                    swap(array, i, biggerPivot);
                    biggerPivot--;

                    if (array[i] < array[left]) {
                    	swap(array, i, smallerPivot);
                    	smallerPivot++;
                    }
                }
                i++;
            }
            
            swap(array, left, --smallerPivot);
            swap(array, right, ++biggerPivot);

            return new int[]{smallerPivot, biggerPivot};
        }

        private void swap(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static class ArrayGenerator {
    	
    	// Generating Array for Case Equal & Case Random
    	public int[][] generateArrays(int arrayToCreate, int[] caseSize, boolean random) {
            int[][] array2D = new int[arrayToCreate][];
            Random rnd = new Random();

            for (int i = 0; i < arrayToCreate; i++) {
                int[] array1D = new int[caseSize[i]];
                if (random) { // case random
                    for (int j = 0; j < caseSize[i]; j++) {
                    	array1D[j] = rnd.nextInt();
                    }
                } else { //case equal
                    int randomNum = rnd.nextInt();
                    for (int j = 0; j < caseSize[i]; j++) {
                    	array1D[j] = randomNum;
                    }
                }
                array2D[i] = array1D;
            }
            return array2D;
        }
    	
    	// Generating Array for Case Increasing & Case Decreasing
    	public int[][] generateArrays(boolean increasing, int arrayToCreate, int[] caseSize) {
    	    int[][] array2D = new int[arrayToCreate][];
    	    
    	    for (int i = 0; i < arrayToCreate; i++) {
    	        int[] array1D = new int[caseSize[i]];
    	        if (increasing) { // case increasing
    	            for (int j = 0; j < caseSize[i]; j++) {
    	            	array1D[j] = j;
    	            }
    	        } else { // case decreasing 
    	            for (int j = 0; j < caseSize[i]; j++) {
    	            	array1D[j] = caseSize[i] - j;
    	            }
    	        }
    	        array2D[i] = array1D;
    	    }
    	    return array2D;
    	}
    	
    }

}
