package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeafTraversal {


    public static int checkLeafTraversal(Node root1,Node root2){

        if(root1 == null || root2 == null)
            return -1;

        Queue<Node> queue1 = new LinkedList<>();
        Queue<Node> queue2 = new LinkedList<>();

        queue1.add(root1);
        queue2.add(root2);

        Node current1,current2;

        while(!queue1.isEmpty() || !queue2.isEmpty()){

            if(queue1.isEmpty() || queue2.isEmpty())
                return -1;

            current1 = queue1.remove();
            current2 = queue2.remove();


        }

        return 1;
    }

    private static boolean isLeafNode(Node current) {

        if((current.right == null && current.left==null))
            return true;

        return false;
    }
}
