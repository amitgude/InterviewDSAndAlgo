package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.right = new Node(6);
        root.left.left = new Node(1);

        //BinaryTree.postorder(root);
        System.out.println();
        //Inorder.inorderTraversal(root);
        System.out.println();
        //Preorder.preorderTraversal(root);
        System.out.println();
        for (int a :Postorder.postOrderTraversal(root))
            //System.out.print(a + " ");
        System.out.println();
        //LevelOrder.levelOrderTraversal(root);
        System.out.println();
        //System.out.println(ChildrenSum.checkChildrenSum(root));

        System.out.println(MinHeap.checkMinHeap(root));
    }
}
