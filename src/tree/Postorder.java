package tree;

import java.util.ArrayList;
import java.util.Stack;

public class Postorder {

    public static ArrayList<Integer> postOrderTraversal(Node root){

        if(root == null)
            return null;

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        ArrayList<Integer> postorderList = new ArrayList<>();
        Node current;
        while(!stack.isEmpty()){

            current = stack.pop();
            postorderList.add(0,current.key);

            if(current.left != null)
                stack.push(current.left);

            if(current.right != null)
                stack.push(current.right);
        }

        return postorderList;
    }
}
