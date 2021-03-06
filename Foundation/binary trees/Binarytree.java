// construction
// display function
import java.util.*;

public class Binarytree{
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
    }

    public static class Pair{
        TreeNode node;
        int state;
    }

    public static TreeNode construct(int[] arr){
        Stack<Pair> st = new Stack<>();

        TreeNode root = new TreeNode();
        root.data = arr[0];

        Pair temp = new Pair();
        temp.node = root;
        temp.state = 1;
        st.push(temp);

        for(int i = 1; i < arr.length; i++){
            Pair ontop = st.peek();
            if(ontop.state == 1){
                // if state == 1 we will be adding child tree node to the left of ontop node;
                if(arr[i] != -1){
                    TreeNode toleft  = new TreeNode();
                    toleft.data = arr[i];
                    ontop.node.left = toleft;

                    Pair tobeadded = new Pair();
                    tobeadded.node = toleft;
                    tobeadded.state = 1;
                    st.push(tobeadded);
                }else{
                    ontop.node.left = null;
                }

                ontop.state++;
            }else if(ontop.state == 2){
                // if state ==2 we will be adding child tree node to the right of ontop node;
                if(arr[i] != -1){
                    TreeNode toright  = new TreeNode();
                    toright.data = arr[i];
                    ontop.node.right = toright;

                    Pair tobeadded = new Pair();
                    tobeadded.node = toright;
                    tobeadded.state = 1;
                    st.push(tobeadded);
                }else{
                    ontop.node.right = null;
                }

                ontop.state++;

            }else{
                // if ontop state == 3 we will be just popping ontop pair as its state will be 3
                st.pop();
                // and i-- so that our data is not lost 
                // ex: 10 12 16 -1 -1 18
                // at 18 state of 16 is 3 so when we pop out 16's pair our for loop will do i++ and our 18 is lost so its mandatory fr us to do i--;
                i--;
            }

        }

        return root;

    }

    public static void display(TreeNode node){
        if(node == null){
            return;
        }
        //preorder form 
        String st = node.data+ "--";

        if(node.left != null){
            st+=node.left.data+ ", ";
        }else{
            st+=".,";
        }

        if(node.right != null){
            st+=node.right.data+ ", ";
        }else{
            st+=".,";
        }
        System.out.println(st);

        display(node.left);
        // inorder form if coded here

        display(node.right);
        // postorder form

    }

    public static ArrayList<ArrayList<Integer>> levelOrderTraversal(TreeNode node) {
        // write your code here.
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(node);
        
        ArrayList<ArrayList<Integer>> ans  = new ArrayList<>();
        
        while(queue.size() > 0){
            int size = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();
            while(size-- > 0){
                TreeNode rem = queue.removeFirst();
                temp.add(rem.val);
                
                if(rem.left != null){
                    queue.addLast(rem.left);
                }
                
                if(rem.right != null){
                    queue.addLast(rem.right);
                }
            }
            ans.add(temp);
        }
        
        return ans;

        
    }

    public static int size(TreeNode node) {
        // write your code here
        if(node == null){
            return 0;
        }
        
        int temp1 = size(node.left);
        int temp2 = size(node.right);
        
        return temp1+temp2+1;
        
      }
    
      public static int sum(TreeNode node) {
        // write your code here
        if(node == null){
            return 0;
        }
        
        int temp1 = sum(node.left);
        int temp2 = sum(node.right);
        
        return temp1+temp2+node.data;
      }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        TreeNode root = construct(arr);
        display(root);

        ArrayList<ArrayList<Integer>> levelOT = levelOrderTraversal(root);
        
        


    }
}