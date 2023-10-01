package CodingNinja.Milestone4.BinaryTree_2;

import java.util.Scanner;

public class heightDiameter {
    //constructor
    public static class Pair<T,V>{
        public T first;
        public V second;
    }

    //this function is BST Tree
    public static BSTNode<Integer> takeInput(Scanner sc){
        int rootData = sc.nextInt();
        if (rootData==-1) return null;
        BSTNode<Integer> root = new BSTNode<>(rootData);
        root.left = takeInput(sc);
        root.right = takeInput(sc);
        return root;
    }
    //This function is Height and Diameter Count
    public static Pair<Integer,Integer> heightDiameter(BSTNode<Integer> root){
        if (root==null) {
            Pair<Integer,Integer> output = new Pair<>();
            output.first=0;
            output.second=0;
            return output;
        }

        Pair<Integer,Integer> leftOutput = heightDiameter(root.left);
        Pair<Integer,Integer> rightOutput = heightDiameter(root.right);

        int height = 1+Math.max(leftOutput.first,rightOutput.first);

        int option1 = leftOutput.first+rightOutput.first;
        int option2 = leftOutput.second;
        int option3 = rightOutput.second;

        int diameter = Math.max(option1,Math.max(option2,option3));
        Pair<Integer,Integer> output = new Pair<>();
        output.first = height;
        output.second = diameter;
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTNode<Integer> root = takeInput(sc);
        System.out.println("Diameter Count: "+heightDiameter(root).second);
        System.out.println("Height Count: "+heightDiameter(root).first);
    }
}

/*
input(Better Diameter):
1 2 4 8 9 -1 -1 -1 -1 5 -1 6 -1 7 -1 -1 3 -1 -1
Diameter Better: 6
Height Better: 5
 */