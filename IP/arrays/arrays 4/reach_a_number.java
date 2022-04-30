class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int steps = 1;
        int numsteps = 0;
        int i = 0;
        while((i < target) || (i-target)%2 != 0){
            i = i+steps;
            steps++;
            numsteps++;
        }
        return numsteps;
    }
}