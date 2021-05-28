class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        HashMap<Integer,Integer> mymap = new HashMap<>();
        for(int i = 0 ; i < n; i++) {
            if(mymap.containsKey(arr[i]) == false){
                mymap.put(arr[i], 1);
            }else{
                mymap.put(arr[i],mymap.get(arr[i])+1);
            }
        }

        int requiredcount  = n/k;
        int count = 0;
        for(int i = 0 ;i < n; i++){
            if(mymap.containsKey(arr[i]) == true){
                
                if(mymap.get(arr[i]) > requiredcount){
                    count++;
                }
    
                mymap.remove(arr[i]);
            }
        }

        return count;
    }
}