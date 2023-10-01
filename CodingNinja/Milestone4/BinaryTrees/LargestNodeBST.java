package CodingNinja.Milestone4.BinaryTrees;

import java.util.Scanner;

public class LargestNodeBST {
    public static BinaryTreeNode<Integer> takeInput(Scanner sc){
        int rootData;
        rootData = sc.nextInt();

        if(rootData==-1) return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left = takeInput(sc);
        root.right = takeInput(sc);
        return root;
    }

    public static int largestNode(BinaryTreeNode<Integer> root){
        if (root==null) return 0;
        int largestLeft = largestNode(root.left);
        int largestRight = largestNode(root.right);
        return Math.max(root.data,Math.max(largestLeft,largestRight));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(sc);
        System.out.println("Largest Node: "+largestNode(root));
    }
}

/*
input:-> 1 2 -1 -1 4 5 -1 -1 3 -1 -1
output:-> Largest Node: 5
 */
