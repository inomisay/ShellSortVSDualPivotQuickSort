
public interface SortingTimeMeasurer_Interface {

    /**
     * Measures the time taken by ShellSort algorithm for different types and sizes of arrays.
     * 
     * @param sortingClass The instance of the SortingClass containing the ShellSort algorithm.
     * @param equalArrays Arrays with equal integers to be sorted.
     * @param randomArrays Arrays with random integers to be sorted.
     * @param increasingArrays Arrays with integers in increasing order to be sorted.
     * @param decreasingArrays Arrays with integers in decreasing order to be sorted.
     * @return A 2D array containing the time taken for sorting each type and size of array by ShellSort.
     */
    long[][] shellSort_Time(SortingClass sortingClass, int[][] equalArrays, int[][] randomArrays, int[][] increasingArrays, int[][] decreasingArrays);

    /**
     * Measures the time taken by Dual Pivot QuickSort algorithm for different types and sizes of arrays.
     * 
     * @param sortingClass The instance of the SortingClass containing the Dual Pivot QuickSort algorithm.
     * @param equalArrays Arrays with equal integers to be sorted.
     * @param randomArrays Arrays with random integers to be sorted.
     * @param increasingArrays Arrays with integers in increasing order to be sorted.
     * @param decreasingArrays Arrays with integers in decreasing order to be sorted.
     * @return A 2D array containing the time taken for sorting each type and size of array by Dual Pivot QuickSort.
     */
    long[][] dualPivotQuickSort_Time(SortingClass sortingClass, int[][] equalArrays, int[][] randomArrays, int[][] increasingArrays, int[][] decreasingArrays);

}