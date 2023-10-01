package ZZ_StartingTimePr;

import ZZ_StartingTimePr.QueueY1;

public class QuickUsingLinkedList {
    //Quick Using Linked List
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null & tail == null;
        }
        //enqueue
        public static void add(int data){
            Node newNode = new Node(data);
            if (tail == null){
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;

        }

        //dequeue -O(1)

        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            if (head == tail){
                tail = null;
            }
            head = head.next;
            return front;
        }
        //peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        QueueY1.Queue q = new QueueY1.Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()){

            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
