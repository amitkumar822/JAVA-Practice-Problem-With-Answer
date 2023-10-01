package CodingNinja.Milestone4.BinaryTree_2;

import java.util.Scanner;

public class DiameterBinaryTree {
    //this function is BST Tree
    public static BSTNode<Integer> takeInput(Scanner sc){
        int rootData = sc.nextInt();
        if (rootData == -1) return null;
        BSTNode<Integer> root = new BSTNode<>(rootData);
        root.left = takeInput(sc);
        root.right = takeInput(sc);
        return root;
    }

    public static int diameter(BSTNode<Integer> root){
        if (root==null) return 0;
        int option1 = height(root.left) + height(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);
        return Math.max(option1,Math.max(option2,option3));
    }
    public static int height(BSTNode<Integer> root){
        if (root==null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1+Math.max(leftHeight,rightHeight);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTNode<Integer> root = takeInput(sc);
        System.out.println("Diameter: "+diameter(root));
    }
}
/*
input(Balanced tree): 1 2 3 9 10 11 -1 -1 -1 -1 -1 5 -1 6 -1 7 -1 8 -1 -1 4 -1 -1
Diameter: 8
----------------------
input: 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
Diameter: 5

--------------------------------
2 4 6 20 -1 -1 30 8 -1 -1 -1 -1 5 -1 7 80 -1 9 -1 -1 90 -1 -1
Diameter: 8

 */