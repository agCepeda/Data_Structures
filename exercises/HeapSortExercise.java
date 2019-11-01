import java.util.Arrays;

public class HeapSortExercise extends Exercise {
    
    @Override
    String[] getOptions() {
        return new String[] { 
            "Max Heapify", 
            "Build Max Heap",
            "Heap Sort"
        };
    }

    @Override
    String getTitle() {
        return "HeapSort Example";
    }

    @Override
    void selectOption(int option) {
        switch(option) {
            case 0:
                maxHeapifyExample();
                break;
            case 1:
                buildMaxHeapExample();
                break;
            case 2:
                heapSortExample();
                break;
            default:
                println("Run another on");
                break;
        }
    }

    /**
     * Max Heapify Example.
     * 
     */
    public void maxHeapifyExample() {
		Integer[] args = new Integer[] {
			16,4,10,14,7,9,3,2,8,1
		};

		println(Arrays.asList(args));
		MaxHeap.maxHeapify(args, 2, args.length);
		println(Arrays.asList(args));
    }

    /**
     * Build Max Heap Example.
     */
    public void buildMaxHeapExample() {
		Integer[] args = new Integer[] {
			4, 1, 3, 2, 16, 9, 10, 14, 8, 7
		};

		println(Arrays.asList(args));
		MaxHeap.buildMaxHeap(args, args.length);
		println(Arrays.asList(args));
    }

    /**
     * Heap Sort Example.
     */
    public static void heapSortExample() {
		Integer[] args = new Integer[] {
			4, 1, 3, 2, 16, 9, 10, 14, 8, 7
		};

		println(Arrays.asList(args));
		Heap.sort(args);
		println(Arrays.asList(args));
    }
}