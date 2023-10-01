package ApnaCollegeGraph.Queue;

public class A_2CircularQueue {
    static class Queue{
        static int arr[];
        static int rear =-1;
        static int front =-1;
        static int size;

        Queue(int size){
            arr = new int[size];
            this.size = size;
        }
        //emptyCheck
        public static boolean isEmpty(){
            return rear ==-1 && front ==-1;
        }

        //full
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        //add or enqueue Element
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            //first element add
            if(front==-1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear]=data;
        }
        //remove Element -O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result =arr[front];
            if(rear == front){
                rear = front=-1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }
        //peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
