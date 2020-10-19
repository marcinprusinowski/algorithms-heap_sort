# Heap Sort!

Heap sort is a comparison based sorting technique based on Binary Heap data structure. It is similar to selection sort where we first find the maximum element and place the maximum element at the end. We repeat the same process for the remaining elements.

Completed Binary Tree which means that every level of tree except possibly the last if fully filled and all leafs (node without a child) are as far left as possible.

A Binary Heap is a Complete Binary Tree where items are stored in a special order such that value in a parent node is greater(or smaller) than the values in its two children nodes. The former is called as max heap and the latter is called min-heap. The heap can be represented by a binary tree or array.

How does the array representation look like?
If a given node is at index I , then his left child is at position 2 * I + 1 in array
and his right child is at position 2 * I + 2 assuming that we started from the 0.

The machanism of Heap Sort
**1.** Build a max heap from the input data.  
**2.** At this point, the largest item is stored at the root of the heap. Replace it	with the last item of the heap followed by reducing the size of heap by 1. 			Finally, heapify the root of the tree.  
**3.** Repeat step 2 while size of heap is greater than 1.

Max heap ? Heapify ? What is that?
I was confused as much as you are. But the power of the internet will help us understand with this quick video. 
https://www.youtube.com/watch?v=MtQL_ll5KhQ
# Conclusion
Heap sort is in place sorting algorithm.
It's time complexity in every case is O(nlogn), because we have n elements in array which we are going through and the heapify method take O(logn) according to the completed binary tree property. Essentially, in a BST every time you double the number of nodes you only increase the number of steps to solution by one. To extend this, four times the nodes gives two extra steps. Eight times the nodes gives three extra steps. Sixteen times the nodes gives four extra steps. And so on.
Feel free to download the code and try, but I suggest you to implement it by yourself first.
