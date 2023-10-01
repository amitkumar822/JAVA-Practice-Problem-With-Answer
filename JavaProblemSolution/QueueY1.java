package ZZ_StartingTimePr;

public class QueueY1 {

    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }
        //enqueue
        public static void add(int data){
            if (rear == size-1){
                System.out.println("full queue");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        //dequeue -O(n)

        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;
            return front;
        }
        //peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Final Queue output is here : ");
        while (!q.isEmpty()){

            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
