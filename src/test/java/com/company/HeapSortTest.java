package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class HeapSortTest {
    @Test
    public void shouldReturnSortedArray(){
        List<Integer> numbers = new ArrayList<>(List.of(1,6,3,6,7,2,1,4));
        List<Integer> expected = new ArrayList<>(List.of(1,1,2,3,4,6,6,7));
        HeapSort heapSort = new HeapSort(numbers);

        numbers = heapSort.sort();

        Assertions.assertIterableEquals(expected , numbers);
    }
}