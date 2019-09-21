package tree;

public class SumTree {


    public static int checkSumTree(Node root){

        if(isLeafNode(root))
            return 1;



        return 1;
    }


    private static boolean isLeafNode(Node current) {

        if(current == null || (current.right == null && current.left==null))
            return true;

        return false;
    }

}
