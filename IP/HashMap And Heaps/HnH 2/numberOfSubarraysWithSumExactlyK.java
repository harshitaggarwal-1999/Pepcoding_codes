class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] ps = new int[n];
        ps[0] = nums[0];
        for (int i = 1; i < n; i++) {
            ps[i] = ps[i - 1] + nums[i];
        }
        Map<Integer, Integer> mp = new HashMap<>();

        int count = 0;
        for (int i = 0; i < n; i++) {
            int numToFind = ps[i] - k;

            if (mp.containsKey(numToFind) == true) {
                count += mp.get(numToFind);

            }

            if (ps[i] == k) {
                count++;
            }

            mp.put(ps[i], mp.getOrDefault(ps[i], 0) + 1);
        }
        return count;
    }
}