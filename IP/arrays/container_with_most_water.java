class Solution {
    public int maxArea(int[] height) {
        int maxvol = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length-1;
        
        while(i < j){
            int storage = (j-i)*Math.min(height[i], height[j]);
            maxvol = Math.max(maxvol, storage);
            if(height[j] < height[i]){
                j--;
            }else if(height[i] == height[j]){
                i++;j--;
            }else{
                i++;
            }
        }
        
        return maxvol;
    }
}