package LinkedListCodingNinjaMils1;

import java.util.Scanner;

public class MiddlePoint {
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
    public static Node<Integer> midpoint(Node<Integer> head){
        Node<Integer> slow =head, fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Node<Integer> mid = midpoint(head);
        System.out.println(mid.data);

    }
}
