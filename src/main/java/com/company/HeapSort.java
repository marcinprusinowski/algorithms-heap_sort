package com.company;

import java.util.ArrayList;
import java.util.List;

public class HeapSort {

    private List<Integer> dataSource;

    public HeapSort(List<Integer> data) {
        this.dataSource = new ArrayList<>(data);
    }


    public List<Integer> sort() {
        int n = dataSource.size();

        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeap(dataSource, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            swap(i, 0, dataSource);
            --n;
            maxHeap(dataSource, n, 0);
        }
        return dataSource;
    }

    private void maxHeap(List<Integer> data, int heapSize, int parentIndex) {
        int maxIndex = parentIndex;
        int leftChild = parentIndex * 2 + 1;
        int rightChild = parentIndex * 2 + 2;

        if (leftChild < heapSize && dataSource.get(leftChild) > dataSource.get(maxIndex)) {
            maxIndex = leftChild;
        }
        if (rightChild < heapSize && dataSource.get(rightChild) > dataSource.get(maxIndex)) {
            maxIndex = rightChild;
        }
        if (maxIndex != parentIndex) {
            swap(maxIndex, parentIndex, dataSource);
            maxHeap(dataSource, heapSize, maxIndex);
        }

    }

    private void swap(int from , int to , List<Integer> data){
        int tmp = data.get(from);
        data.set(from , data.get(to));
        data.set(to,tmp );
    }
}
