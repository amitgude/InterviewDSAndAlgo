package tree;

import java.util.Stack;

public class MinHeap {


    public static int checkMinHeap(Node root){

        if(root== null)
            return -1;


        Stack<Node> stack = new Stack<>();
        Node current=root;
        stack.push(root);


        while(!stack.isEmpty()){
            current = stack.pop();
            if(!isLeafNode(current)){

                if(current.right != null) {
                    if (current.key < current.right.key) {
                        stack.push(current.right);
                    }else{
                        return -1;
                    }
                }

                if(current.left != null) {
                    if (current.key < current.left.key) {
                        stack.push(current.left);
                    }else{
                        return -1;
                    }
                }
            }
        }
        return 1;
    }

    private static boolean isLeafNode(Node current) {

        if(current == null || (current.right == null && current.left==null))
            return true;

        return false;
    }

}
