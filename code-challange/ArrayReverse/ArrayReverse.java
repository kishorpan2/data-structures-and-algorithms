import java.util.Arrays;

public class ArrayReverse {
  public static void main (String[] args) {
    // create the array to test your code on later
    int[] startArr = new int[] {0,1,2,3,4,5,10,780,90000};
    // print it out, nicely
    System.out.println(Arrays.toString(startArr));
    // call your reverseArray method and save the result in a variable
    int[] endArr = reverseArray(startArr);
    // print out the result, nicely
    System.out.println(Arrays.toString(endArr));
  }

  // the method you should write, to reverse an array
  public static int[] reverseArray(int[] inputArr) {
    // your code goes here
    int start =0;
    int end = inputArr.length-1;
    int mid = (start + end)/2;

    while(end >= mid){
      int t = inputArr[start];
      inputArr[start] = inputArr[end];
      inputArr[end] = t;
      start ++;
      end --;
    }
    // retun the swapped array
    return inputArr;
  }
    
}