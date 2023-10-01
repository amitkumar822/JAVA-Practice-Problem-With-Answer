package CodingNinja.Milestone4.BinaryTrees;

import java.util.Scanner;

public class printAtDepthKNode {
    public static BinaryTreeNode<Integer> takeInput(Scanner sc){
        int rootData = sc.nextInt();
        if (rootData==-1) return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left=takeInput(sc);
        root.right=takeInput(sc);
        return root;
    }

    public static void countDepthNode(BinaryTreeNode<Integer> root, int k){
        if (root==null) return;
        if(k==0){
            System.out.print(root.data+" ");
            return;
        }
        countDepthNode(root.left,k-1);
        countDepthNode(root.right,k-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(sc);
        System.out.println("Number of depth Node:");
        countDepthNode(root,3);
    }
}

/*
input:-
10 5 2 9 -1 -1 -1 -1 7 8 -1 -1 3 -1 -1
Number of depth Node:
2 8 3
-----------------------
input2:-
10 5 2 9 -1 -1 -1 -1 7 8 -1 -1 3 -1 -1
Number of depth Node:
9
 */