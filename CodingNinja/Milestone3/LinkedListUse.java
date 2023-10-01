package CodingNinja.Milestone8;

public class LinkedListUse {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);
        Node<Integer> node4 = new Node<>(40);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Node<Integer> head = node1;

        while (head != null){
            System.out.println(head.data +" ");
            head = head.next;
        }


//        Node<Integer> node1 = new Node<>(10);
//        System.out.println(node1.data);
//        System.out.println(node1.next);
//
//        Node<Integer> node2 = new Node<>(20);
//        node1.next = node2;
//        System.out.println(node2);
//        System.out.println(node1.next);

    }
}
