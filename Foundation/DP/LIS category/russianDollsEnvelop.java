class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        Pair[] arr = new Pair[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = new Pair(envelopes[i][0],envelopes[i][1]);
        }
        
        Arrays.sort(arr);
        
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int ans = 1;
        for(int ei = 1; ei < n; ei++){
            for(int si = 0; si < ei; si++){
                if(arr[si].h < arr[ei].h){
                    dp[ei] = Math.max(dp[ei], dp[si]+1);
                }
            }
            ans = Math.max(dp[ei],ans);
        }
        return ans;
    }
    
    public class Pair implements Comparable<Pair>{
        int w;
        int h;
        
        Pair(int w, int h){
            this.w = w;
            this.h = h;
        }
        
        public int compareTo(Pair o){
            if(this.w != o.w){
                return this.w - o.w;
            }else{
                return o.h - this.h;
            }
        }
    }
}