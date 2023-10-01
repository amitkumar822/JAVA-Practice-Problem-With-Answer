package CodingNinja.Milestone4.BinaryTrees;

import java.util.Scanner;

public class BinaryTreeUseProblemSolved {
    public static void printTree(BinaryTreeNode<Integer> root){
        if(root==null) return;
        String toBePrinted = root.data+"";
        if(root.left != null){
            toBePrinted += "L:"+root.left.data+",";
        }
        if(root.right != null){
            toBePrinted += "R:"+root.right.data;
        }
        System.out.println(toBePrinted);
        printTree(root.left);
        printTree(root.right);
    }
    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        int rootData;
        System.out.println("Enter root data");
        rootData =  s.nextInt();
        if(rootData==-1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left =  takeInput(s);
        root.right = takeInput(s);
        return root;
    }
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       BinaryTreeNode<Integer > root = takeInput(s);
       printTree(root);
       s.close();
    }
}
/*
input:-


Enter root data
1
Enter root data
2
Enter root data
4
Enter root data
-1
Enter root data
-1
Enter root data
5
Enter root data
-1
Enter root data
-1
Enter root data
3
Enter root data
-1
Enter root data
6
Enter root data
-1
Enter root data
-1

-------
output:-
1L:2,R:3
2L:4,R:5
4
5
3R:6
6
 */