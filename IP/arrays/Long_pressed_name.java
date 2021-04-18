//leetcode 925
//time complexity O(n+m) -> n = name.length() and m = typed.length()
// space complexity O(1)
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        boolean ans = true;
        
        int i = 0;
        int j = 0;
        while(j < typed.length()){
            if( i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
            }else if(j == 0 || typed.charAt(j) != typed.charAt(j-1)){
                return false;
            }
            j++;
        }
        if(i < name.length())return false;
        return ans;
    }
}