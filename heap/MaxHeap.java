import java.util.ArrayList;

public class MaxHeap extends Heap {

    MaxHeap(Integer[] a, int heapSize) {
        super(a, heapSize);
    }

    public void buildMaxHeap(Integer[] a) {
        this.heapSize = a.length;
        for(int i = a.length / 2; i > 0; i--) {
            MaxHeap.maxHeapify(a, i, a.length);
        }
    }

    public static void buildMaxHeap(Integer[] a, int heapSize) {
        for(int i = a.length / 2; i > 0; i--) {
            MaxHeap.maxHeapify(a, i, heapSize);
        }
    }

    public static void maxHeapify(Integer[] a, int index, int heapSize) {
        int l = left(index);
        int r = right(index);
        int largest = index;
        
        if (l <= heapSize && a[l - 1] > a[index - 1]) {
            largest = l;
        }
        if (r <= heapSize && a[r - 1] > a[largest - 1]) {
            largest = r;
        }
        if (largest != index) {
            int aux = a[index - 1];
            a[index - 1] = a[largest - 1];
            a[largest - 1] = aux;
            MaxHeap.maxHeapify(a, largest, heapSize);
        }
    }
    
    public void maxHeapifyRecurrent(Integer[] a, int index, int heapSize) {
        while (true) {
            int l = left(index);
            int r = right(index);
            int largest = index;
            
            if (l <= heapSize && a[l - 1] > a[index - 1]) {
                largest = l;
            }
    
            if (r <= heapSize && a[r - 1] > a[largest - 1]) {
                largest = r;
            }
            if (largest != index) {
                int aux = a[index - 1];
                a[index - 1] = a[largest - 1];
                a[largest - 1] = aux;
                index = largest;
            } else {
                break;
            }
        }
    }
}