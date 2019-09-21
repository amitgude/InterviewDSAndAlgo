package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {


    public static void levelOrderTraversal(Node root){

        if(root == null)
            return;

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        Node current;
        while(!nodes.isEmpty()){

            current = nodes.remove();
            System.out.print(current.key + " ");

            if(current.left != null)
                nodes.add(current.left);

            if(current.right != null)
                nodes.add(current.right);

        }


    }
}
