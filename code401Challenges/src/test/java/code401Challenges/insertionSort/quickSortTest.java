package code401Challenges.insertionSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class quickSortTest {
    @Test
    public void mergeSort(){
        int[] input = new int[]{2, 1, 8, 6, 7};
        int[] expected = new int[]{1, 2, 6, 7, 8};
        int[] actual = InsertionSort.insertionSort(input);
        assertArrayEquals("", expected, actual);

    }
    // test identical array
    @Test
    public void mergeSortIdentical() {
        int[] input = new int[]{8, 2, 6, 6, 1};
        int[] expected = new int[]{1, 2, 6, 6, 8};
        int[] actual = InsertionSort.insertionSort(input);
        assertArrayEquals("", expected, actual);
    }
    // sort sorted values
    @Test
    public void mergeSortSorted() {
        int[] input = new int[]{1, 2, 6, 6, 8};
        int[] expected = new int[]{1, 2, 6, 6, 8};
        int[] actual = InsertionSort.insertionSort(input);
        assertArrayEquals("", expected, actual);
    }

    // null pointer
    @Test
    public void mergeSortNull() {
        int[] input = new int[]{};
        int[] expected = new int[]{};
        int[] actual = InsertionSort.insertionSort(input);
        assertArrayEquals("", expected, actual);
    }

}