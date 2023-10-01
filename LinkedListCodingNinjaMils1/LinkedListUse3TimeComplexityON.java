package LinkedListCodingNinjaMils1;

import java.util.Scanner;

public class LinkedListUse3TimeComplexityON {
    public static Node<Integer> takeInput(){
        Node<Integer> head = null , tail = null;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Node : ");
        int data = s.nextInt();
        while (data != -1){   //Time Complexity O(N)
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static void print(Node<Integer> head){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        print(head);
    }
}
