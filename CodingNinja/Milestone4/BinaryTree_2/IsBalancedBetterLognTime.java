package CodingNinja.Milestone4.BinaryTree_2;

import java.util.Scanner;

public class IsBalancedBetterLognTime {
    public static class BSTReturn{
        int height;
        boolean isBalanced;
    }

    public static BSTReturn isBalancedBetter(BSTNode<Integer> root){
        if (root == null){
            int height = 0;
            boolean isBal = true;
            BSTReturn ans = new BSTReturn();
            ans.height = height;
            ans.isBalanced = isBal;
            return ans;
        }

        BSTReturn leftOutput = isBalancedBetter(root.left);
        BSTReturn rightOutput = isBalancedBetter(root.right);
        boolean isBal = true;
        int height = 1+Math.max(leftOutput.height, rightOutput.height);

        if (Math.abs(leftOutput.height- rightOutput.height)>1){
            isBal = false;
        }

        BSTReturn ans = new BSTReturn();
        ans.height = height;
        ans.isBalanced = isBal;
        return ans;
    }

    //This function is Represent Balanced Binary Tree
    public static BSTNode<Integer> takeInput(Scanner sc){
        int rootData = sc.nextInt();
        if (rootData==-1) return null;
        BSTNode<Integer> root = new BSTNode<>(rootData);
        root.left = takeInput(sc);
        root.right = takeInput(sc);
        return root;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTNode<Integer> root = takeInput(sc);
        System.out.println("Balanced Tree Result:- "+isBalancedBetter(root).isBalanced);
        sc.close();
    }
}
/*
input(BST): 1 2 3 9 10 11 -1 -1 -1 -1 -1 5 -1 6 -1 7 -1 8 -1 -1 4 -1 -1
Balanced Tree Result:- false
---------------------
input(BST): 2 4 8 -1 -1 -1 3 -1 3 -1 -1
Balanced Tree Result:- true
 */