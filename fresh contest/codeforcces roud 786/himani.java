// Java implementation of the approach
import java.util.*;

public class himani
{

static int calculateCycleOperations(int len)
{
	int cycle_operations = 0;
	while (len > 0)
	{
		len /= 3;
		++cycle_operations;
	}
	return --cycle_operations;
}

// Function to return the minimum operations required
static int minimumOperations(int p[], int n)
{

	// Array to keep track of visited elements
	int []visited = new int[n+1];
	Arrays.fill(visited,0);

	// To store the final answer
	int ans = 0;

	// Looping through all the elements
	for (int i = 1; i <= n; i++)
	{

		// Current element
		int ele = p[i];

		// If current element is not present in the
		// previous cycles then only consider this
		if (visited[ele] == 0)
		{

			// Mark current element visited so that it
			// will not be considered in other cycles
			visited[ele] = 1;

			// To store the length of each cycle
			int len = 1;
			ele = p[ele];

			// Calculating cycle length
			while (visited[ele] == 0)
			{
				visited[ele] = 1;
				++len;
				ele = p[ele];
			}

			// Operations needed for this cycle to reduce
			// to length 1 (if possible)
			int operations = calculateCycleOperations(len);

			// Checking cycle length to be power of 3
			// if not, then return -1
			int num = (int)Math.pow(3, operations);
			if (num != len) {
				return -1;
			}

			// Taking maximum of the operations
			ans = Math.max(ans, operations);
		}
	}
	return ans;
}

// Driver code
public static void main(String args[])
{
	// 1-based indexing
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int []  arr = new int[n+1];
    for(int i = 1 ; i <= n; i++){
        arr[i] = scn.nextInt();
    }
	

	// Calling function
	System.out.println(minimumOperations(arr, n));
}
}

// This code is contributed by
// Surendra_Gangwar
