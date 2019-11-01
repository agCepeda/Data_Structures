import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void println(Object... args) {
		for (Object arg : args) {
			System.out.print(arg.toString() + " ");
		}
		System.out.println("");
	}

    static int findShortest(
		int graphNodes, 
		int[] graphFrom, 
		int[] graphTo, 
		long[] ids, 
		int val) {
 
		HashSet<Integer> found = new HashSet<Integer>();
		for (int i=0; i < graphNodes; i++) {

			if (ids[i] == val) {
				int node = i + 1;
				found.add(node);
			}
		}
		//Arrays.asList(graphFrom).indexOf(o)
		return 1;
	}
	/*
		int shortest = findShortest(
			5, 
			new int[] { 1, 2, 2, 3 }, 
			new int[] { 2, 3, 4, 5 }, 
			new long[] { 1, 2, 3, 1, 3 },
			3
			);
		
		println(new Integer(shortest));*/
/*
		BinaryTree tree = new BinaryTree();
		tree.insert(10);
		tree.insert(8);
		tree.insert(12);
		tree.insert(15);
		tree.insert(11);
		tree.insert(5);
		tree.insert(9);
		tree.insert(6);
		tree.insert(4);
		tree.insert(9);
		tree.insert(10);
		
		AbstractTree.inOrderWalk(tree.root, (node) -> { println(node.val); });

		MainWindow window = new MainWindow();
		window.showTree(tree);
		window.setVisible(true);*/
	public static void main(String[] args) {
		(new HeapSortExercise()).run();
	}
}
