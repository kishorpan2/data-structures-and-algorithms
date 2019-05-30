package code401Challenges;

public class biniarySearch {
    public static void main (String args){
        int [] one ={45, 38, 35, 28, 15};
        int [] two ={102, 109, 115};
        System.out.println(biniarySearch(one, 38));
    }
    public static int biniarySearch(int[] arr, int val){
        for(int i= 0;i<arr.length; i++ ){
            if(arr[i] == val){
                return i;
            }

        }
        return -1;
    }

}
