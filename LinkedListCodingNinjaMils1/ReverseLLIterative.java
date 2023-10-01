package LinkedListCodingNinjaMils1;

import java.util.Scanner;

public class ReverseLLIterative {

//    public static Node<Integer> reverse(Node<Integer> head){
//        Node<Integer> curr = head;
//        Node<Integer> prev = null;
//        Node<Integer> temp;
//
//        while (curr != null){
//            temp = curr.next;
//            curr.next = prev;
//            curr = temp;
//        }
//        return prev;
//    }

    public static DoubleNode reverseLLBetter(Node<Integer> head){
        if (head == null || head.next == null){
            DoubleNode ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }
        DoubleNode smallAns = reverseLLBetter(head.next);
        smallAns.tail.next = head;
        head.next = null;

        DoubleNode ans = new DoubleNode();
        ans.head = smallAns.head;
        ans.tail = head;
        return ans;
    }

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
        DoubleNode ans = reverseLLBetter(head);
        print(ans.head);
    }
}
