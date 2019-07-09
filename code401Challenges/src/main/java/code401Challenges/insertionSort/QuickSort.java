package code401Challenges.insertionSort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static int[] quickSort(int [] input){
        if (input.length <2){
            return input;
        }
        else{
            int pivot = input[0];
            List<Integer> smaller = new ArrayList<>();
            List<Integer> larger = new ArrayList<>();

            for (int i = 1; i < input.length; i++){
                if(input[i] < pivot){
                smaller.add(input[i]);
            }
            else
                {
                larger.add(input[i]);
                }
            }
            // sort array
            List<Integer> sorted = new ArrayList<>();
            sorted.addAll(arrayToList(quickSort(listToArray(smaller))));
            sorted.add(pivot);
            sorted.addAll(arrayToList(quickSort(listToArray(larger))));
            return listToArray(sorted);

        }
    }

    //convert list of integers to an array
    public static int[] listToArray(List<Integer> list){
        int[] array = new int[list.size()];
        for (int i =0; i < array.length; i++){
            array[i] = list.get(i);
        }
        return array;
    }
    // convert an array of integers to list
    public static List<Integer> arrayToList(int[] array){
        List<Integer> result = new ArrayList<>();
        for (int i =0; i < array.length; i++){

            result.add(array[i]);
        }
        return result;

    }

}
