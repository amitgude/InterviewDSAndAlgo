package tree;

import java.util.Stack;

public class ChildrenSum {


    public static int checkChildrenSum(Node root){

        if(root == null)
            return -1;

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node current;
        while(!stack.isEmpty()){
            int sum=0;
            current = stack.pop();

            if(!isLeafNode(current)){

              if(current.left != null){
                  sum += current.left.key;
                  stack.push(current.left);
              }
              if(current.right != null){
                  sum += current.right.key;
                  stack.push(current.right);
              }

              if( sum != current.key )
                  return -1;

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
