
public class SortingTimeMeasurer implements SortingTimeMeasurer_Interface {
	
	@Override
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
	
	@Override
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
