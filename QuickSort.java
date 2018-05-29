public class QuickSort {

	void quicksort(int arr[], int low, int high)
	{
	
	if(low<high)
	{
	int pivot = partition(arr, low, high);
	
	quicksort(arr,low,pivot-1);
	quicksort(arr,pivot+1,high);
	}
	
	}
	
	public int partition(int arr[], int low, int high)
	{
	int i = low-1;
	int pivot = arr[high];
	
	for(int j=low;j<high;j++)
	{
		if(arr[j]<=pivot)
		{
			i++;
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	pivot = arr[i+1];
	arr[i+1] = pivot;
	
	return (i+1);
	}
}
