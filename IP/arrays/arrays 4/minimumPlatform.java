import java.util.*;

public class minimumPlatform {
    public static class Pair implements Comparable<Pair>{
        int time;
        String type;
    
        Pair(int time, String type) {
            this.time = time;
            this.type = type;
        }

        @Override
        public int compareTo(Pair o){
            return this.time - o.time;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int[] dep = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            dep[i] = scn.nextInt();
        }
        int ans = findPlatform(arr, dep, n);
        System.out.println(ans);
    }


    public static int findPlatform(int arr[], int dep[], int n) {
        // add your code here
        Pair[] alltimes = new Pair[arr.length + dep.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            alltimes[j] = new Pair(arr[i], "A");
            j++;
        }

        for (int i = 0; i < dep.length; i++) {
            alltimes[j] = new Pair(dep[i], "D");
            j++;
        }

        Arrays.sort(alltimes);
        int ans = 0;
        int temp = 0;
        for (int i = 0; i < alltimes.length; i++) {
            if (alltimes[i].type == "A")
                temp++;
            else {
                temp--;
            }

            ans = Math.max(ans, temp);
        }
        return ans;

    }
}