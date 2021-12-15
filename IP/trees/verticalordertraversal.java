import java.util.*;

public class verticalordertraversal{

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
        
    }

    public static class Node implements Comparable<Node>{
        TreeNode node; 
        int vl;
        int hl;

        Node(TreeNode node, int vl, int hl){
            this.node = node;
            this.vl = vl;
            this.hl = hl;
        }
        @Override
        public int compareTo(Node o){
            if(this.vl == o.vl){
                return this.hl-o.hl;
            }
            return this.vl - o.vl;
        }
    }

    public static ArrayList<ArrayList<Integer> > verticalOrderTraversal(TreeNode root){
        if(root == null)return null;
        int[] arr = new int[2];
        HashMap<Integer, ArrayList<Node> > map = new HashMap<>();
        Arrays.fill(arr,0);
        Queue<Node> q = new ArrayDeque<>();
        q.add(new Node(root, 0, 0));
        while(q.size() > 0){
            int size = q.size();
            while(size-- > 0){
                Node temp = q.remove();
                int vl = temp.vl;
                int hl = temp.hl;
                arr[0] = Math.min(arr[0], hl);
                arr[1] = Math.max(arr[1], hl);
                if(map.containsKey(hl)){
                    map.get(hl).add(temp);
                }
                else if(map.containsKey(hl) == false){
                    map.put(hl,new ArrayList<>());
                    map.get(hl).add(temp);
                }
                
                
                if(temp.node.left != null){
                    q.add(new Node(temp.node.left, vl+1, hl-1));
                }
                if(temp.node.right != null){
                    q.add(new Node(temp.node.right, vl+1, hl+1));
                }
            }
        }
        System.out.println(map);
        ArrayList<ArrayList<Integer> > ansarr = new ArrayList<>();
        System.out.println(arr[0]+" "+ arr[1]);
        for(int i = arr[0]; i <= arr[1]; i++){
            ArrayList<Node> tempans  = map.get(i);
            ArrayList<Integer> smallans = new ArrayList<>();
            if(tempans == null)continue;
            Collections.sort(tempans);
            for(Node n : tempans){
                smallans.add(n.node.val);
            }
            ansarr.add(smallans);
        }
        return ansarr;
        
    }

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1) {
            IDX[0]++;
            return null;
        }
        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    public static void solve() {
        Scanner scn  =new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);

        ArrayList<ArrayList<Integer>> ans = verticalOrderTraversal(root);
        int idx = 0;
        for (ArrayList<Integer> i : ans) {
            System.out.print(idx++ + " -> ");
            for (Integer j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve();
    }
}