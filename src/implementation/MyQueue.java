package implementation;

import myinterface.QueueADT;

public class MyQueue<E extends Comparable<E>>
        implements QueueADT<E> {

    private E[] arr;
    private int[] brr;
    private int front;
    private int rear;
    private int size;

    public MyQueue(E[] arr) {
        this.arr = arr;
    }

    @Override
    public void enqueue(E data) {
        //must call rearrange
    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    private void rearrange(){
        for (int i = rear ; i > 0 ; i--) {
            if(brr[i] > brr[i-1] ){
                //swap
                int temp = brr[i];
                brr[i] = brr[i-1];
                brr[i-1] = temp;
            }
            else{
                break;
            }
        }
    }

    //second function for rearrange with Type parameter E
    private void rearrangeGeneric(){
        for (int i = rear; i > 0 ; i--) {
            {
                if (arr[i].compareTo(arr[i - 1]) == 1){
                    //swap
                    E temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
        }
    }
}
