class Solution {
    
    // hashmap approach O(n) space , time complexity O(n)
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer,Integer> hs = new HashMap<>();
        
//         for(int i = 0; i < nums.length; i++){
//             hs.put(nums[i],i);
//         }
        
//         for(int i = 0; i < nums.length; i++){
//             int numsToFind = target-nums[i];
//             // System.out.println("target :" + target + " nums[i] : "+nums[i]+" numsToFind : "+numsToFind);
//             if(hs.containsKey(numsToFind) && hs.get(numsToFind) != i){
//                 int[] ans = {i,hs.get(numsToFind)};
//                 return ans;
//             }
//         }
//         return new int[2];
        
//     }
    
    
    // array approach O(1) space tme complexity O(nLogn)
    
    public class pair implements Comparable<pair>{
        int val;
        int idx;
        
        pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
        
        public int compareTo(pair o){
            return this.val-o.val;
        }
    }
    public int[] twoSum(int[] nums, int target) {
        pair[] arr = new pair[nums.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new pair(nums[i], i);
        }
        
        Arrays.sort(arr);
        int[] ans = new int[2];
        int i = 0; 
        int j = arr.length-1;
        while(i < j){
            if((arr[i].val + arr[j].val) == target){
                ans[0] = arr[i].idx;
                ans[1] = arr[j].idx;
                break;
            }else if((arr[i].val + arr[j].val) > target){
                j--;
            }else{
                i++;
            }
        }
        
        return ans;
    }
}