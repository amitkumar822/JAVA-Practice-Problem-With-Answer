package LinkedListCodingNinjaMils1;

import java.util.Scanner;

public class LinkedListUse2 {
    public static Node<Integer> takeInput() {
        Node<Integer> head = null;
        System.out.println("Enter Your Node : ");
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        while (data != -1){  //Time Complexity O(N^2)
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
            }else{
                Node<Integer> temp = head;
                while (temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static void print(Node<Integer> head){
        while(head != null){
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
