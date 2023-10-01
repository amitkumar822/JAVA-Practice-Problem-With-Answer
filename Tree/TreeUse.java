package Revesion.Tree;

import java.util.Scanner;

public class TreeUse {
    public static int TreeNodeCount(TreeNode<Integer> root){
        if(root==null) return 0;
        int ans =1;
        ans += TreeNodeCount(root.left);
        ans += TreeNodeCount(root.right);
        return ans;
    }
    public static void printTree(TreeNode<Integer> root){
        if(root==null) return;
        String ans = root.data+"";
        if(root.left != null){
            ans += "L"+root.left.data+",";
        }
        if(root.right != null) {
            ans += "R:"+root.right.data;
        }
        System.out.println(ans);
        printTree(root.left);
        printTree(root.right);

    }

    public static int largest(TreeNode<Integer> root){
        if (root==null) return -1;
        int largestLeft = largest(root.left);
        int largestRight = largest(root.right);

        return Math.max(root.data,Math.max(largestLeft,largestRight));
    }

    public static int numLeaves(TreeNode<Integer> root){
        if(root == null) return 0;
        if(root.left == null && root.right==null){
            return 1;
        }

        return numLeaves(root.left)+numLeaves(root.right);
    }

    public static TreeNode<Integer> takeInput(Scanner sc ){
        int rootData;
        //System.out.println("Enter root data");
        rootData = sc.nextInt();
        if(rootData==-1) return null;
        TreeNode<Integer> root = new TreeNode<>(rootData);
        root.left=takeInput(sc);
        root.right=takeInput(sc);
        return root;
    }

    public static void printAtDepthK(TreeNode<Integer> root,int k){
        if(root==null) return;
        if(k==0){
            System.out.println(root.data);
            return;
        }

        printAtDepthK(root.left,k-1);
        printAtDepthK(root.right,k-1);
    }

    //this function in balanced tree related
    public static int height(TreeNode<Integer> root){
        if(root==null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1+leftHeight+rightHeight;
    }

    //this function is balanced tree (Time complexity - n*h->(n^2 or n*logn))
    public static boolean isBalanced(TreeNode<Integer> root){
        if (root==null) return true;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight-rightHeight)>1){
            return false;
        }
        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }

    //this function is BalancedTree(Better time complexity- O(n)) compare to Upper Balanced tree
    public static BalancedTreeReturn isBalancedBetter(TreeNode<Integer> root){
        if (root==null){
            int height = 0;
            boolean isBal = true;
            BalancedTreeReturn ans = new BalancedTreeReturn();
            ans.height = height;
            ans.isBalanced = isBal;
            return ans;
        }

        BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
        BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
        boolean isBal = true;
        int height = 1+Math.max(leftOutput.height, rightOutput.height);

        if (Math.abs(leftOutput.height - rightOutput.height)>1){
            isBal = false;
        }

        if (!leftOutput.isBalanced || !rightOutput.isBalanced){
            isBal = false;
        }

        BalancedTreeReturn ans = new BalancedTreeReturn();
        ans.height=height;
        ans.isBalanced = isBal;
        return ans;

    }

    //this function is removeLeaves
    public static TreeNode<Integer> removeLeaves(TreeNode<Integer> root){
        if(root==null) return null;

        if(root.left==null && root.right==null) return null;

        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }

    //this function count Diameter of a tree
    public static int diameter(TreeNode<Integer> root){
        if (root==null) return 0;
        int option1 = hd(root.left)+hd(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);
        return Math.max(option1,Math.max(option2,option3));
    }
    public static int hd(TreeNode<Integer> root){
        if (root==null) return 0;
        int lh = hd(root.left);
        int rh = hd(root.right);
        return 1+Math.max(lh,rh);
    }

    //This function and upper same but time complexity differance this is better
    public static Pair<Integer,Integer> heightDiameter(TreeNode<Integer> root){
        if (root==null) {
            Pair<Integer,Integer> output = new Pair<>();
            output.first=0;
            output.Second=0;
            return output;
        }
        Pair<Integer,Integer> leftOutput = heightDiameter(root.left);
        Pair<Integer,Integer> RightOutput = heightDiameter(root.right);
        int height = 1 + Math.max(leftOutput.first, RightOutput.first);

        int option1 = leftOutput.first+ RightOutput.first;
        int option2 = leftOutput.Second;
        int option3 = RightOutput.Second;

        int diameter = Math.max(option1,Math.max(option2,option3));
        Pair<Integer,Integer> output = new Pair<>();
        output.first = height;
        output.Second = diameter;
        return output;
    }

    // Inorder print BSt
    public static void inorder(TreeNode<Integer> root){
        if (root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //PreOrder BST
    public static void preOrder(TreeNode<Integer> root){
        if (root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //PostOrder
    public static void postOrder(TreeNode<Integer> root){
        if (root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    //Check Balanced tree yes or no
    public static  int minimum(TreeNode<Integer> root){
        if (root == null) return Integer.MAX_VALUE;

        return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
    }

    public static  int maximum(TreeNode<Integer> root){
        if (root == null) return Integer.MIN_VALUE;

        return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
    }
    public static boolean isBST(TreeNode<Integer> root){
        if(root==null) return true;

        int leftMax = maximum(root.left);
        int rightMin = minimum(root.right);
        if(root.data <= leftMax){
            return false;
        }
        if(root.data > rightMin){
            return false;
        }
        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);

        if(isLeftBST && isRightBST){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(sc);
//        printTree(root);
        //System.out.println("total node:->"+TreeNodeCount(root));
        //System.out.println("Largest : "+largest(root));

//        System.out.println("Number of leaves node: "+numLeaves(root));
        //printAtDepthK(root,2);

        //System.out.println(isBalanced(root));

//        TreeNode<Integer> newRoot = removeLeaves(root);
//        printTree(newRoot);
        //System.out.println("Diameter: "+diameter(root));
//        System.out.println("IsBalancedBetter: "+isBalancedBetter(root).isBalanced);

//        System.out.println("Diameter Better: "+heightDiameter(root).Second);
//        System.out.println("Height Better: "+heightDiameter(root).first);

//        inorder(root);
//        preOrder(root);
//        postOrder(root);

        System.out.println(isBST(root));

        sc.close();
    }
}

/*
input: 5 2 9 -1 -1 -1 -1 7 8 -1 -1 3 -1 -1
output: Number of leaves node: 3

--------------------

10 5 2 9 -1 -1 6 -1 -1 7 -1 -1 7 8 -1 -1 3 -1 -1
Number of leaves node: 5

--------------
input(diameter):-
1 2 3 9 10 11 -1 -1 -1 -1 -1 5 -1 6 -1 7 -1 8 -1 -1 4 -1 -1
Diameter: 8

--------------------------------
input(Better Diameter):
1 2 4 8 9 -1 -1 -1 -1 5 -1 6 -1 7 -1 -1 3 -1 -1
Diameter Better: 6
Height Better: 5
-----------------------
input(Inorder): 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1
Inorder output: 4 2 5 1 6 3 7

---------------
Input(PreOrder): 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1
output: 1 2 4 5 3 6 7

----------------------------
input(PostOrder): 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1
output: 4 5 2 6 7 3 1

--------------------------
input(Check BST Yes or No):-
input: 4 2 1 -1 -1 3 -1 -1 6 5 -1 -1 7 -1 -1
result: true
 */