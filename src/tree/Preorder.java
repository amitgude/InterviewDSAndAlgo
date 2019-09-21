package tree;

import java.util.Stack;

public class Preorder {

    public static void preorderTraversal(Node root){

        if(root == null)
            return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node current;
        while(!stack.isEmpty()){

            current = stack.pop();
            System.out.print(current.key + " ");

            if(current.right != null)
                stack.push(current.right);

            if(current.left != null)
                stack.push(current.left);

        }

    }
}
