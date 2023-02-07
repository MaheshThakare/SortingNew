public class Selection_Sort {
    public static void main(String[] args) {
        int [] arr = {2, 1, 3, 7, 8, 5, 4};
        selectionSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    static void selectionSort(int[]arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){ //i be the current element
            //find minimun element in part of unsorted array
            int min_val = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_val]){
                    //finding the index of minimum element
                    min_val=j;
                }
            }
            //swapping at the end of first iteration of inner loop
            int temp = arr[min_val];
            arr[min_val]=arr[i];
            arr[i]=temp;
        }

        /*my approach
        for(int i=0; i<n-1; i++){
            int position = n-i-1;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[position]){
                    position=j;
                }
            }
            int temp = arr[position];
            arr[position]=arr[n-i-1];
            arr[n-i-1]=temp;
        }*/
    }
}
