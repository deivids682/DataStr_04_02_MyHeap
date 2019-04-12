package dataStr;

public class MyHeap <T> {

    private T[] heap;

    private int elementCounter = 0;

    private final int defaultSize = 15;

    private int size = defaultSize;

    public MyHeap() {

        heap = (T[]) new Object[size];
    }

    public MyHeap(int size) {

        if (size > 0)
            this.size = size;

        heap = (T[]) new Object[size];
    }

    public boolean isEmpty() {
        return (elementCounter == 0) ? true : false;
    }

    public boolean isFull() {
        return (size == elementCounter) ? true : false;
    }


    public int getElementCounter() {
        return elementCounter;
    }

    public boolean enqueue(T element) {
        if (isFull()) {
            return false;
        } else {
            //TODO add element
            heap[elementCounter] = element;
            elementCounter++;
            //reHeapUp() TODO call when it is created
            return true;
        }
    }

    public T dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Heap is Empty");
        } else {
            T temp = heap[0];
            heap[0] = heap[--elementCounter];
            //reHeapDown() TODO call it when its created
            return temp;
        }
    }

    public void clear() {
        elementCounter = 0;
    }

    private int getLeftChIndex(int parentIndex) throws Exception {
        if (isEmpty()) {
            throw new Exception("There is left child because heap is empty");
        } else {
            int chldIndex = parentIndex * 2 + 1;

            if (chldIndex < elementCounter) {
                return chldIndex;
            } else {
                return -1;
            }

        }
    }

    private int getRightChIndex(int parentIndex) throws Exception {
        if (isEmpty()) {
            throw new Exception("There is right child because heap is empty");
        } else {
            int chldIndex = parentIndex * 2 + 2;

            if (chldIndex < elementCounter) {
                return chldIndex;
            } else {
                return -1;
            }

        }
    }

    private T getLeftCh(int parentIndex) throws Exception {
        int childIndex = getLeftChIndex(parentIndex);
        if (childIndex == -1) {
            throw new Exception("There is not left child");
        } else {
            return heap[childIndex];
        }
    }

    private T getRightCh(int parentIndex) throws Exception {
        int childIndex = getRightChIndex(parentIndex);
        if (childIndex == -1) {
            throw new Exception("There is not Right child");
        } else {
            return heap[childIndex];
        }
    }

    private void reHeapUp(int elementIndex){

    }



    public void display(int childIndex) {

        int perentIndex = 0;

        try {
            System.out.print("Parent: " + heap[perentIndex]);
            System.out.println("LC: " + getLeftCh(perentIndex));
            System.out.println("RC" + getRightCh(perentIndex));

            if (getLeftChIndex(perentIndex) != -1) {
                display(getLeftChIndex(perentIndex));
            }
            if (getRightChIndex(perentIndex) != -1) {
                display(getRightChIndex(perentIndex));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
