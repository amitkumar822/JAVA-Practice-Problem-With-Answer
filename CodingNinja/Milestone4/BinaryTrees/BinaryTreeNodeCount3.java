package CodingNinja.Milestone4.BinaryTrees;

import java.util.Scanner;

public class BinaryTreeNodeCount3 {
    public static int NodeCount(BinaryTreeNode<Integer> root){
        if(root == null) return 0;
        int ans = 1;
        ans += NodeCount(root.left);
        ans += NodeCount(root.right);
        return ans;
    }

    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        int rootData;
        rootData = s.nextInt();
        if(rootData == -1) return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left = takeInput(s);
        root.right =  takeInput(s);
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(sc);
        System.out.print("Total number of Node: ");
        System.out.print(NodeCount(root));
    }
}
//input:-1 2 4 -1 -1 5 -1 -1 3 -1 6 -1 -1
//output:- 6(total node)