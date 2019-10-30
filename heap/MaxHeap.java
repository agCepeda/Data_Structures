import java.util.ArrayList;

public class MaxHeap extends Heap {

    MaxHeap(ArrayList<Integer> a) {
        super();
        this.store = a;
    }

    public static void maxHeapify(ArrayList<Integer> a, int index) {

        int l = left(index);
        int r = right(index);
        int largest = index;
        
        if (l < a.size() && a.get(l - 1) > a.get(index - 1)) {
            largest = l;
        }

        if (r < a.size() && a.get(r - 1) > a.get(largest - 1)) {
            largest = r;
        }
        if (largest != index) {
            int aux = a.get(index - 1);
            a.set(index - 1, a.get(largest - 1));
            a.set(largest - 1, aux);
            maxHeapify(a, largest);
        }
    }

    public static void maxHeapifyRecurrent(ArrayList<Integer> a, int index) {
        while (true) {
            int l = left(index);
            int r = right(index);
            int largest = index;
            
            if (l <= a.size() && a.get(l - 1) > a.get(index - 1)) {
                largest = l;
            }
    
            if (r <= a.size() && a.get(r - 1) > a.get(largest - 1)) {
                largest = r;
            }
            if (largest != index) {
                int aux = a.get(index - 1);
                a.set(index - 1, a.get(largest - 1));
                a.set(largest - 1, aux);
                index = largest;
            } else {
                break;
            }
        }
    }

    /*

    public void minHeapify(ArrayList<Integer> a, int index) {
        int l = left(index);
        int r = right(index);
        int lowest = index;
        
        if (l <= a.size() && a.get(l) < a.get(lowest)) {
            lowest = l;
        }

        if (r <= a.size() && a.get(r) < a.get(lowest)) {
            lowest = r;
        }
        if (lowest != index) {
            int aux = a.get(index);
            a.set(index, a.get(lowest));
            a.set(lowest, aux);
            minHeapify(a, lowest);
        }
    }*/
}