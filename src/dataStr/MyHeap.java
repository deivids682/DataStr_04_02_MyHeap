package dataStr;

public class MyHeap <T> {

    private T[] heap;

    private int elementCounter = 0;

    private final int defaultSize = 15;

    private int size = defaultSize;

    public MyHeap(){

        heap = (T[]) new Object[size];
    }

    public MyHeap(int size) {

        if(size > 0 )
            this.size = size;

        heap = (T[]) new Object[size];
    }

    public boolean isEmpty(){
       return (elementCounter == 0)? true : false;
    }

    public boolean isFull(){
        return (size == elementCounter)? true : false;
    }

    

    public int getElementCounter(){
        return  elementCounter;
    }
}
