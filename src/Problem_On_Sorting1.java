/*Given an integer array arr,  move all the 0 to end while maintaining
the relative order of non-zero elements without copying array inplace
 */
public class Problem_On_Sorting1 {
    public static void main(String[] args) {
        int[]arr = {0, 1, 10, 5, 0, 4};
        sortZerosToEnd(arr);
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
    static void sortZerosToEnd(int[]arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            boolean flag = false;
            for(int j=0; j<n-1; j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false) return; //if before n-1 sort, the array get sorted
        }
    }
}