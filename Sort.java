/**
 * A class to give a comaprative view of common sorting algorithms. 
 * The maintains a private static variable that counts the number of array assignments that are performed 
 * (as an approximate measure of the complexity of the algorithm).
 * @author xyu974
 * @version 1.0
 **/
public class Sort {
	
	private int count;
	
	/**
	 * Returns the number of array assignment operations 
	 * performed by this class since the count variable was reset. 
	 * @return the number of assignments
	 **/
	public int getCount() {
		return count;
	}
	
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
	public void mergeSort(long[] a) {
		int n = q-p+1;
		int m = r-q;
		long[] an = new long[n];
		long[] am = new long[m];
		for(int i = 0; i<n; i++) {
			an[i] = a[p+i];
			count++;
		}
		for(int i = 0; i<m; i++){
			am[i] = a[q+i+1];
			count++;
		}
		int i = 0;
		int j = 0;
		for(int k = p; k<=r; k++){
			if(i==n) a[k] = am[j++];
			else if(j==m || an[i]<am[j]) a[k] = an[i++];
			else a[k] = am[j++];
			count++;
		}
	}
	
	private void mergeSort(long[] a, int p, int r)
	{
		if(p<r){
			int i = (p+r)/2;
			mergeSort(a,p,i);
			mergeSort(a,i+1,r);
			merge(a, p,i,r);
		}
	}
	
	/**
	 * Executes the quicksort algorithm sorting the argument array.
	 * There is no return as the parameter is to be mutated.
	 * @param a - the array of long integers to be sorted
	 **/
	public void quickSort(long[] a);
	
	/**
	 * Resets the counter variable to 0 
	 **/
	public void reset() {
		count = 0;
	}
}
