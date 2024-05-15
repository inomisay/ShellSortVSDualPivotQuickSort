import java.util.Random;

public class ArrayGenerator implements ArrayGenerator_Interface {
	
	@Override // Generating Array for Case Equal & Case Random
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
	
	@Override // Generating Array for Case Increasing & Case Decreasing
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
