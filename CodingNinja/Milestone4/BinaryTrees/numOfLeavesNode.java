package CodingNinja.Milestone4.BinaryTrees;

import java.util.Scanner;

public class numOfLeavesNode {
    public static int numLeave(BinaryTreeNode<Integer> root){
        if (root == null) return 0;
        if(root.left==null && root.right==null) return 1;
        return numLeave(root.left)+numLeave(root.right);
    }
    public static BinaryTreeNode<Integer> takeInput(Scanner sc){
        int rootData = sc.nextInt();
        if (rootData == -1) return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left=takeInput(sc);
        root.right = takeInput(sc);
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(sc);
        System.out.println("Number of leaves node: "+numLeave(root));
    }
}
/*
input:-
1 2 -1 -1 4 5 -1 -1 3 -1 -1
output:-
Number of leaves node: 3
 */