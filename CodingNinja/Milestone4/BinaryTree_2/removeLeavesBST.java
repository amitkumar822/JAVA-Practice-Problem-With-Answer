package CodingNinja.Milestone4.BinaryTree_2;


import java.util.Scanner;

public class removeLeavesBST {
    // this function create a BST Tree
    public static BSTNode<Integer> takeInput(Scanner sc){
        int rootData = sc.nextInt();
        if (rootData==-1) return null;
        BSTNode<Integer> root = new BSTNode<>(rootData);
        root.left = takeInput(sc);
        root.right = takeInput(sc);
        return root;
    }

    //BST Tree Print
    public static void printTreeBST(BSTNode<Integer> root){
        if (root==null) return;
        String result = root.data+"";
        if(root.left != null){
            result += "L:"+root.left.data+",";
        }
        if (root.right != null){
            result += "R:"+root.right.data;
        }
        System.out.println(result);
        printTreeBST(root.left);
        printTreeBST(root.right);
    }

    // remove Leave Node BST
    public static BSTNode<Integer> removeLeaves(BSTNode<Integer> root){
        if (root==null) return null;

        if (root.left==null && root.right==null) return null;

        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTNode<Integer> root = takeInput(sc);
        BSTNode<Integer> newRoot = removeLeaves(root);
        printTreeBST(newRoot);
    }
}


/*
input:-
3 2 -1 -1 4 -1 -1
output:-
3
------------------------------------------------------------
input:-  3 4 5 6 -1 -1 -1 -1 7 -1 2 8 -1 -1 9 -1 -1
output:-
3L:4,R:7
4L:5,
5
7R:2
2
 */