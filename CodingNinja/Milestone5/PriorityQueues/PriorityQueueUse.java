package CodingNinja.Milestone5.PriorityQueues;

public class PriorityQueueUse {
//    private static void insertIntoVirtualHeap(int[] arr,int i){
//        int childIndex = i;
//        int parentIndex = (childIndex-1)/2;
//        while(childIndex>0){
//            if(arr[childIndex] < arr[parentIndex]){
//                int temp = arr[childIndex];
//                arr[childIndex] = arr[parentIndex];
//                arr[parentIndex] = temp;
//
//                childIndex = parentIndex;
//                parentIndex = (childIndex-1)/2;
//            }else{
//                return;
//            }
//        }
//        //return;
//    }


    private static int removeMinFromVirtualHeap(int[] arr, int heapSize){
        int temp = arr[0];
        arr[0]=arr[heapSize-1];
        heapSize--;
        int index = 0;
        int leftChildIndex = 2 * index+1;
        int righttChildIndex = 2 * index+2;

        while(leftChildIndex < heapSize){
            int minIndex = index;
            if(arr[leftChildIndex]  < arr[minIndex]){
                minIndex = leftChildIndex;
            }
            if(righttChildIndex < heapSize && arr[righttChildIndex] < arr[minIndex]){
                minIndex = righttChildIndex;
            }

            if(minIndex != index){
                int temp1 = arr[index];
                arr[index] = arr[minIndex];
                arr[minIndex] = temp1;
                index = minIndex;
                leftChildIndex = 2 * index+1;
                righttChildIndex = 2 * index+2;
            }else{
                break;
            }
        }
        return temp;
    }

    public static void main(String[] args)  throws PriorityQueueException{
        Priority_Queue1 pq = new Priority_Queue1();
//        int[] arr = {5,1,9,2,0,6};
        int[] arr = {2,6,8,5,4,3};
//        for(int i=0; i<arr.length; i++){
//            insertIntoVirtualHeap(arr, i);
//        }

        for(int i=0; i<arr.length; i++){
            arr[arr.length-1-i] = removeMinFromVirtualHeap(arr, arr.length-i);
        }

        for(int i=0; i<arr.length; i++){ //9 6 5 2 1 0
            System.out.print(arr[i]+" ");
        }

        /*======================================================*/
        System.out.println();
        for(int i=0; i<arr.length; i++){
            pq.insert(arr[i]);
        }

        while (!pq.isEmpty()){
            System.out.print(pq.removeMin()+" ");
        }
        System.out.println();
    }
}
