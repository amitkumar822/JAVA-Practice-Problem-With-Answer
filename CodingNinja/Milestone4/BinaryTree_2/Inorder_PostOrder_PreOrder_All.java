package CodingNinja.Milestone4.BinaryTree_2;

import java.util.Scanner;

public class Inorder_PostOrder_PreOrder_All {
    //constructor
    public static class BalanceTreeConstructor<T>{
        public T data;
        public BalanceTreeConstructor<T> left;
        public BalanceTreeConstructor<T> right;

        public BalanceTreeConstructor(T data){
            this.data = data;
        }
    }
    //Binary tree function
    public static BalanceTreeConstructor<Integer> takeInput(Scanner sc){
        int rootData = sc.nextInt();
        if (rootData==-1) return null;
        BalanceTreeConstructor<Integer> root = new BalanceTreeConstructor<>(rootData);
        root.left = takeInput(sc);
        root.right = takeInput(sc);
        return root;
    }

    //InOrder function
    public static void inOrder(BalanceTreeConstructor<Integer> root){
        if (root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    //PreOrder function
    public static void PreOrder(BalanceTreeConstructor<Integer> root){
        if (root == null) return;
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    //PostOrder
    public static void PostOrder(BalanceTreeConstructor<Integer> root){
        if (root==null) return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BalanceTreeConstructor<Integer> root = takeInput(sc);

        System.out.print("InOrder Result: ");
        inOrder(root);
        System.out.println();
        System.out.print("PreOrder Result: ");
        PreOrder(root);
        System.out.println();
        System.out.print("PostOrder Result: ");
        PostOrder(root);
    }
}

/*
input(Inorder): 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1
Inorder output: 4 2 5 1 6 3 7

---------------
Input(PreOrder): 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1
output: 1 2 4 5 3 6 7

----------------------------
input(PostOrder): 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1
output: 4 5 2 6 7 3 1
 */
