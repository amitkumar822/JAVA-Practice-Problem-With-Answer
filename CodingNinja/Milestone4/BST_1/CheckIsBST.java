package CodingNinja.Milestone4.BST_1;


import java.util.Scanner;

public class CheckIsBST {
    //This function time complexity O(n^2)

    //This function is created a BST Tree
    public static BST_Node<Integer> takeInput(Scanner sc){
        int rootData = sc.nextInt();
        if (rootData==-1) return null;
        BST_Node<Integer> root = new BST_Node<>(rootData);
        root.left = takeInput(sc);
        root.right = takeInput(sc);
        return root;
    }

    /*----------------------1st BST Program TimeComplexity O(n^2)------------------*/
    //Check isBalanced Binary Tree
    public static  int minimum(BST_Node<Integer> root){
        if (root == null) return Integer.MAX_VALUE;

        return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
    }

    public static  int maximum(BST_Node<Integer> root){
        if (root == null) return Integer.MIN_VALUE;

        return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
    }
    public static boolean isBST(BST_Node<Integer> root){
        if (root == null) return true;

        int leftMax = maximum(root.left);
        int rightMin = minimum(root.right);
        if (root.data <= leftMax){
            return false;
        }
        if (root.data > rightMin){
            return false;
        }

        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);

        if(isLeftBST && isRightBST){
            return true;
        }else {
            return false;
        }
    }
    /*-------------End BST Function Time Complexity O(n^2) Upper code--------------------*/


    /*--------------------Better solution Time Complexity O(n) Lower Function -----------------------------------*/

    public  static Pair<Boolean,Pair<Integer,Integer>> isBetterBST(BST_Node<Integer> root){
        if (root==null){
            Pair<Boolean,Pair<Integer,Integer>> output = new Pair<Boolean,Pair<Integer,Integer>>();
            output.first = true;
            output.second = new Pair<Integer,Integer>();
            output.second.first = Integer.MAX_VALUE;
            output.second.second = Integer.MIN_VALUE;
            return output;
        }
        Pair<Boolean,Pair<Integer,Integer>> leftOutput = isBetterBST(root.left);
        Pair<Boolean,Pair<Integer,Integer>> rightOutput = isBetterBST(root.right);
        int min= Math.min(root.data,Math.min(leftOutput.second.first,rightOutput.second.first));
        int max= Math.max(root.data,Math.max(leftOutput.second.second,rightOutput.second.second));

        boolean isBst =(
                (root.data > leftOutput.second.second)
                && (root.data <= rightOutput.second.first)
                && leftOutput.first && rightOutput.first
        );

        Pair<Boolean,Pair<Integer,Integer>> output = new Pair<Boolean,Pair<Integer,Integer>>();
        output.first = isBst;
        output.second = new Pair<Integer,Integer>();
        output.second.first = min;
        output.second.second = max;
        return output;
    }

    /*--------------------Better solution END Time Complexity O(n) Lower Function -----------------------------------*/

    public static boolean isBST3(BST_Node<Integer> root,int min,int max){
        if (root==null) return true;

        if(root.data < min || root.data > max){
            return false;
        }

        boolean isLeftOk = isBST3(root.left,min,root.data-1);
        boolean isRightOk = isBST3(root.right,root.data,max);
        return isRightOk && isLeftOk;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST_Node<Integer> root = takeInput(sc);
        System.out.println("isBST Result: "+isBST(root));
        System.out.println("isBetterBSt Result: "+isBetterBST(root).first);
        System.out.println("IsBST3 Result: "+isBST3(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }
}
/*
4 2 1 -1 -1 3 -1 -1 6 5 -1 -1 7 -1 -1
isBST Result: true
 */