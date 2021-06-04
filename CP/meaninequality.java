// Java implementation of naive method for sorting
// an array in wave form.
import java.util.*;

public class meaninequality {
	public static void swap(int arr[], int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static int[] sortInWave(int arr[], int n)
	{
		// Sort the input array
		Arrays.sort(arr);

		// Swap adjacent elements
		for (int i=0; i<n-1; i += 2)
			swap(arr, i, i+1);

        return arr;
	}

	// Driver method
    static Scanner scn = new Scanner(System.in);
	public static void main(String args[])
	{
        int t = scn.nextInt();
        while(t--> 0){
            int n = scn.nextInt();
            n= 2*n;
            
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = scn.nextInt();
            }
            Arrays.sort(arr);
            int[] ans = new int[n];
            int j = arr.length-1;
            for(int i = 0 ;i < n; i+=2){
                ans[i] = arr[j];
                j--;
            }
            j = 0;
            for(int i = 1; i < n; i+=2){
                ans[i] = arr[j];
                j++;
            }

            for(int i = 0; i < n; i++){
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
        
	}
}
