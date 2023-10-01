package CodingNinja.Milestone4.BinaryTree_2;

import CodingNinja.Milestone4.BinaryTrees.BinaryTreeNode;

import java.util.Scanner;

public class CheckBST_BalancedTree {
    //This function is generate tree
    public static BinaryTreeNode<Integer> takeInput(Scanner sc){
        int rootData = sc.nextInt();
        if(rootData==-1) return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left = takeInput(sc);
        root.right = takeInput(sc);
        return root;
    }

    //this function is check tree is balance yes or no

    private static int height(BinaryTreeNode<Integer> root){
        if(root==null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1+leftHeight+rightHeight;
    }
    static boolean isBalance(BinaryTreeNode<Integer> root){
        if(root==null) return true;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight-rightHeight)>1){
            return false;
        }

        boolean isLeftBalanced = isBalance(root.left);
        boolean isRightBalanced = isBalance(root.right);

        return isLeftBalanced && isRightBalanced;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(sc);
        System.out.println(isBalance(root));
    }
}

/*
input(TreeNode):-
1 2 -1 -1 3 -1 -1
result:- true

--------------------------
input2(TreeNode):-
1 2 3 4 -1 -1 -1 -1 5 -1 6 -1 7 -1 -1
result:- false
 */
