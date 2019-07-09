package code401Challenges.insertionSort;

import com.sun.scenario.effect.Merge;

public class MergeSort {
public static void mergeSort(int[]arr){
    int n= arr.length;
    if(n < 2) {
        return;
    }
    int mid = n/2;

    int[] left = new int[mid];

    int[] right = new int[n-mid];

    for(int i =0; i < mid; i++){
        left[i] = arr[i];
    }
    mergeSort(left);
    mergeSort(right);
    Merge(left, right, arr);

}
    public static void Merge(int[]x,int[]y, int[]arr){
    int i = 0;
    int j = 0;
    int k = 0;

    while(i < x.length && j < y.length){
        if( x[i] <= y[j]){
            arr[k++] = x[i++];

    }else{
            arr[k++] = y[j++];
        }

    }
    while(i < x.length){
        arr[k++] = x[i++];
    }
    while(j< y.length){
        arr[k++] = y[j++];
    }
}

}
