package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    Node root;

    BinaryTree(int item){
        this.root = new Node(item);
    }

    BinaryTree(){
        this.root = null;
    }

    public static void insert(Node root, int item) {
        Queue<Node> q = new LinkedList();
        q.add(root);

        while(!q.isEmpty()){
            Node node =  q.peek();
            q.remove();

            if(node.left == null) {
                node.left = new Node(item);
                break;
            }
            else
                q.add(node.left);

            if(node.right == null) {
                node.right = new Node(item);
                break;
            }
            else
                q.add(node.right);

        }

    }

    static void inorder(Node temp)
    {
        if (temp == null)
            return;

        inorder(temp.left);
        System.out.print(temp.key+" ");
        inorder(temp.right);
    }

    static void preorder(Node root)
    {
        if(root == null)
            return;

        System.out.println(root.key+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root){
        if(root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.key+" ");
    }


    static void inorderStack(Node root){
        if(root == null)
            return;

        Stack<Node> stack = new Stack<>();
        Node current = root;
        while(current!= null || !stack.empty()){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.key+ " ");
            current = current.right;
        }


    }


    static void preorderStack(Node root){

        if(root == null)
            return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        Node current;
        while(!stack.empty()){
            current = stack.pop();
            System.out.print(current.key+ " ");
            if(current.right != null)
                stack.push(current.right);
            if(current.left != null)
                stack.push(current.left);
        }

    }

    static ArrayList<Integer> postOrderStack(Node root){
        if(root == null)
            return null;
        ArrayList<Integer> integers = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node current;
        while(!stack.isEmpty()){
            current = stack.pop();
            integers.add(0,current.key);
            if(current.left != null)
                stack.push(current.left);
            if(current.right != null)
                stack.push(current.right);

        }
        return integers;
    }

}
