import java.util.ArrayList;

public abstract class Heap {
    protected Integer[] holder;
    protected int heapSize = 0;
    protected ArrayList<Integer> store = new ArrayList<>();

    public Heap() {}

    public Heap(Integer[] a, int heapSize) {
        this.holder = a;
        this.heapSize = heapSize;
    }

    public static int parent(int index) {
        return index / 2;
    }
    public static int left(int index) {
        return 2 * index;
    }
    public static int right(int index) {
        return 2 * index + 1;
    }

    public static void sort(Integer[] a) {
        int heapSize = a.length;
        MaxHeap.buildMaxHeap(a, heapSize);
        for (int i = a.length; i >= 2; i--) {
            int aux = a[0];
            a[0] = a[i - 1];
            a[i - 1] = aux;
            heapSize = heapSize - 1;
            MaxHeap.maxHeapify(a, 1, heapSize);
        }
    }
}