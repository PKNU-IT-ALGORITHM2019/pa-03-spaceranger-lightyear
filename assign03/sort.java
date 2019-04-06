import java.util.Arrays;

public class sort {
	public double bubble_sort(int data[], int n)
	{
		long startTime = System.currentTimeMillis();

		for( int i = n -1; i > 0 ; i --)
			for( int j = 0; j < i; j++)
				if(data[j] > data[j+1])
					swap(data,j,j+1);

		long endTime = System.currentTimeMillis();

		return Double.parseDouble(String.format("%.5f",(endTime - startTime)/1000.0));
	}
	
	public double selection_sort(int data[], int n)
	{
		long startTime = System.currentTimeMillis();
		for ( int i = n -1 ; i > 1 ; i-- ) {
			for( int j = 0; j < i; j++){
				if( data[i] < data[j] ) 
					swap(data,i,j);
			}
		}
		long endTime = System.currentTimeMillis();

		return Double.parseDouble(String.format("%.5f",(endTime - startTime)/1000.0));
	}
	
	public double insertion_sort(int data[], int n)
	{
		long startTime = System.currentTimeMillis();

		for ( int i = 1; i < n ; i++) {
			int tmp = data[i];
			int j = i-1;

			while( j>=0 && tmp < data[j]) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = tmp;
		}

		long endTime = System.currentTimeMillis();

		return Double.parseDouble(String.format("%.5f",(endTime - startTime)/1000.0));
	}

	public double merge_sort(int data[], int begin, int end)
	{
		long startTime = System.currentTimeMillis();

		if( begin < end ) {
			int mid = ( begin + end )/2;
			merge_sort(data, begin, mid);
			merge_sort(data, mid+1, end);
			merge(data, begin, mid, end);
		}
		long endTime = System.currentTimeMillis();

		return (double)((endTime - startTime)/1000.0);
	}

	public void merge(int data[], int begin, int mid, int end)
	{
		int i = begin;
		int j = mid + 1;
		int n = begin;
		int [] tmp = new int [data.length];

		while(i <= mid && j <= end) {
			if(data[i] < data[j])
				tmp[n++] = data[i++];
			else
				tmp[n++] = data[j++];
		}
		while( i <= mid)
			tmp[n++] = data[i++];
		while( j <= end )
			tmp[n++] = data[j++];

		for(int num = begin; num < n ; num++) 
			data[num] = tmp[num];
	}
	
	public double quick_sort1(int data[], int begin, int end)
	{
		long startTime = System.currentTimeMillis();

		if( begin < end ) {
			int mid = partition(data, begin, end, end);
			quick_sort1(data, begin, mid-1);
			quick_sort1(data, mid + 1, end);
		}

		long endTime = System.currentTimeMillis();

		return (double)((endTime - startTime)/1000.0);
	}

	public double quick_sort2(int data[], int begin, int end)
	{
		long startTime = System.currentTimeMillis();

		if( begin < end ) {
			int mid = partition(data, begin, end, getMiddle(data, 0, (end)/2, end));
			quick_sort1(data, begin, mid-1);
			quick_sort1(data, mid + 1, end);
		}

		long endTime = System.currentTimeMillis();

		return (double)((endTime - startTime)/1000.0);
	}

	public int partition(int[] data, int begin, int end, int pivot) {
		int i = begin - 1;
		int x = data[pivot];
		swap(data, end, pivot);

		for ( int j = begin; j <= end-1; j++) {
			if( data[j] <= x) {
				i++;
				swap(data, i, j);
			}
		}
		swap(data, i+1, end);
		return i+1;
	}
	
	public int getMiddle(int data[], int begin, int mid, int end) {	//중앙값 받기 (for quick2)
		if( (data[begin]<=data[mid] && data[mid]<=data[end]) || (data[end]<=data[mid] && data[mid]<=data[begin]))
			return mid;
		else if( (data[mid]<=data[begin] && data[begin]<=data[end]) || (data[end]<=data[begin] && data[begin]<=data[mid]))
			return begin;
		else if( (data[begin]<=data[end] && data[end]<=data[mid]) || (data[mid]<=data[end] && data[end]<=data[begin]))
			return end;
		return 0;
	}

	public void swap (int[] data, int i, int j) {
		int tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}
	
	public double heap_sort (int [] data, int heapSize) {

		long startTime = System.currentTimeMillis();

		buildMaxHeap(data, data.length);

		for(int i = heapSize - 1; i > 0 ; i-- ) {
			swap(data, 0, i);
			heapSize--;
			heapify(data, 0, data.length);
		}

		long endTime = System.currentTimeMillis();

		return (double)((endTime - startTime)/1000.0);
	}

	public void buildMaxHeap (int [] data, int heapSize) {
		for( int i = (heapSize/2) - 1 ; i >= 0 ; i--)
			heapify(data, i, data.length);
		heapSize = data.length;
	}

	public void heapify (int [] data, int index, int heapSize) {
		int ch = 0;
		
		while((2*index)+1 <= heapSize-1){
			
			if((2*index)+2 <= heapSize-1)
				ch = (data[(2*index)+1] > data[(2*index)+2] ? 2*index+1 : (2*index)+2 );
			else
				ch = 2*index+1;
			
			if( data[index] >= data[ch] )
				return;
			swap(data, index, ch);
			index = ch;
		}
	}
public double contain_sort(int [] data) {
		
		long startTime = System.currentTimeMillis();

		Arrays.sort(data);

		long endTime = System.currentTimeMillis();

		return (double)((endTime - startTime)/1000.0);
	}
}
