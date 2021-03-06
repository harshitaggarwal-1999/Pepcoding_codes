import java.util.*;
public class generictreeconstruction {
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

    }

    public static class GenericTree{
        Node root;


        Node construct(int[] arr){
            Stack<Node> st = new Stack<>();

            for(int i = 0; i < arr.length; i++){
                if(arr[i]==-1){
                    st.pop();
                } else {
                    Node t = new Node();
                    t.data = arr[i];

                    if(st.size() >  0){
                        st.peek().children.add(t);
                    }

                    else {
                        root = t;

                    }

                    st.push(t);
                }

            }

            return root;
        }

        void display(Node node){
            String str = node.data+"->";
    
            for(int i = 0; i < node.children.size(); i++){
                Node child= node.children.get(i);
                str += child.data+", ";
            }
            str+=".";
    
            System.out.println(str);
    
            for(int i = 0; i < node.children.size(); i++){
                Node child = node.children.get(i);
                display(child);
            }
        }

        int sizeoftree(Node node){
            int size = 0;

            for(Node child: node.children){
                size+=sizeoftree(child);
            }

            size++;

            return size;
        }

        int max(Node node){
            int totalmax = node.data;

            for(Node child: node.children){
                int maxinchild = max(child);

                if(maxinchild > totalmax){
                    totalmax = maxinchild;
                }
            }
            return totalmax;
        }
    }

    public static void main(String[]args){
        int[] arr= {10,12,-1,14,18,-1,20,22,-1,24,-1,26,-1,-1,-1,16,28,-1,-1,-1};

        GenericTree gt = new GenericTree();
        Node root = gt.construct(arr);


        gt.display(root);

        System.out.println("size: " + gt.sizeoftree(root));
        System.out.println("max in tree: " + gt.max(root));
    }
    
}
