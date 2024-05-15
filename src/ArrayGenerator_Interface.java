
public interface ArrayGenerator_Interface {

    /*
     * Generates arrays filled with equal or random integers.
     * 
     * @param numArrays The number of arrays to generate.
     * @param caseSize An array containing the sizes of the arrays to generate.
     * @param random If true, generates arrays filled with random integers. 
     *               If false, generates arrays filled with the same random integer.
     * @return An array of integer arrays generated.
     */
    int[][] generateArrays(int arrayToCreate, int[] caseSize, boolean random);

    /*
     * Generates arrays filled with increasing or decreasing integers.
     * 
     * @param increasing If true, generates arrays filled with increasing integers. 
     *                   If false, generates arrays filled with decreasing integers.
     * @param numArrays The number of arrays to generate.
     * @param caseSize An array containing the sizes of the arrays to generate.
     * @return An array of integer arrays generated.
     */
    int[][] generateArrays(boolean increasing, int arrayToCreate, int[] caseSize);

}
