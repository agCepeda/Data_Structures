# Heaps
Binary heaps are data stractures that we can imagine them as a binary tree. Each element of the array
correspond to a node of the tree. The tree is completely filled on all levels except possibly the lowest, which is filled from the left up to a point.

To implement this we need an array with two attributes:

* ***length***: Number of elements in the array. 
* ***heap-size***: How many elements are stored in the array.

And those attributes work with the next constraints:
* *A[1...A.heap-size]*
* *0 <= A:heap-size <= A:length*

In our behavior implementation we will need some utils functions to compute the related nodes of a given index (i).
* ***left***: *2i*
* ***right***: *2i + 1*
* ***parent***: *i / 2*


## Max Heap

* Max Heapify
* Max Heapify Iterative
* Build Max Heap
* HeapSort

