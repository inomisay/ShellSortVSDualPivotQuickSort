
public class SortingClass implements SortingClass_Interface {
	
	// ShellSort  Algorithm
	@Override
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
    @Override
    public void dualPivotQuickSort(int[] arrayToSort) {
        if (arrayToSort == null || arrayToSort.length <= 1) {
            return; // Controlling if array is already sorted or empty
        } // now calling another dualPivotQuickSort function with more arguments 
        dualPivotQuickSort(arrayToSort, 0, arrayToSort.length - 1);
    }

    private void dualPivotQuickSort(int[] array, int left, int right) {
        if (left < right) {
            int[] pivots = partition(array, left, right); // gives us the index value of pivot
            // Recursive functions starts to sort our array our key here is pivots[0] from left to middle then the key is pivots[1] from middle to right
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

