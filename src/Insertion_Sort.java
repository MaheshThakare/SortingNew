public class Insertion_Sort {
    public static void main(String[] args) {
        int [] arr = {7, 2, 6, 4, 3, 1, 5};
        insertionSort(arr);
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
    static void insertionSort(int[]arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){ //only change < to >,  the array will get sorted descendingly
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
