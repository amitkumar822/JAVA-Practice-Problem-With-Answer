package ZZ_StartingTimePr;

import java.util.*;
public class Quick4 {
    //java colection feam work

    public static void main(String[] args) {
//        Queue q = new Queue();
//        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
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
