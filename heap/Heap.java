import java.util.ArrayList;

public abstract class Heap {
    protected ArrayList<Integer> store = new ArrayList<>();

    public static int parent(int index) {
        return index / 2;
    }
    public static int left(int index) {
        return 2 * index;
    }
    public static int right(int index) {
        return 2 * index + 1;
    }

    
}