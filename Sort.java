/**
 * A class to give a comaprative view of common sorting algorithms. 
 * The maintains a private static variable that counts the number of array assignments that are performed 
 * (as an approximate measure of the complexity of the algorithm).
 * @author xyu974
 * @version 1.0
 **/
public interface Sort {
	
	/**
	 * Returns the number of array assignment operations 
	 * performed by this class since the count variable was reset. 
	 * @return the number of assignments
	 **/
	public int getCount();
	
	/**
	 * Executes the insertion sort algorithm 
	 * sorting the argument array. 
	 * There is no return as the parameter is to be mutated. 
	 * @param a - the array of long integers to be sorted
	 **/
	public void insertionSort(long[] a);
	
	/**
	 * Executes the merge sort algorithm sorting the argument array. 
	 * There is no return as the parameter is to be mutated.
	 * @param a - the array of long integers to be sorted
	 **/
	public void mergeSort(long[] a);
	
	/**
	 * Executes the quicksort algorithm sorting the argument array.
	 * There is no return as the parameter is to be mutated.
	 * @param a - the array of long integers to be sorted
	 **/
	public void quickSort(long[] a);
	
	/**
	 * Resets the counter variable to 0 
	 **/
	public void reset();
}
