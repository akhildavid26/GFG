
import java.util.*;
import java.lang.Math;
class InsertionSort
{
	void insertionSort(int arr[],int n)
		{
			int i;
			GfG ob = new GfG();
			for(i=1;i<n;i++)
			ob.insert(arr,i);
		}
	void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		//System.out.println("Enter no. of elements to be sort");
		Scanner sc = new Scanner(System.in);
		InsertionSort is = new InsertionSort();
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			//GfG ob = new GfG();
			 is.insertionSort(a,n);
			is.printArray(a,n);
			
		t--;
		}
		
	}
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* The task is to complete insert() which is used 
   as shown below to implement insertionSort() */
/* Function to sort an array using insertion sort
void insertionSort(int arr[], int n)
{
  GfG obj = new GfG();
   for (int i = 1; i < n; i++)
      obj.insert(arr, i);
} */
class GfG
{
  // Function to sort an array using insertion sort
  void insert(int arr[],int i)
  {
       
	  int k;
       for (int j=1;j<i;j++){
           
           int key=arr[j];
           
           for (k=j-1;k>=0 && key<arr[k];k--){
               
               arr[k+1]=arr[k];
               
           }
   
		arr[k+1]=key;
       }
       
       
  }
}