package tree;

import java.util.Stack;

public class Inorder {


    public static void inorderTraversal(Node root){

        if(root == null)
            return ;

        Stack<Node> stack = new Stack<>();
        Node current = root;

        while(current != null || !stack.isEmpty())

        {
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.key + " ");
            current = current.right;
        }
    }
}
