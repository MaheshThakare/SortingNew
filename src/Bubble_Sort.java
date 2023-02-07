public class Bubble_Sort {
    public static void main(String[] args) {
        int [] arr= {5, 4, 6, 6, 7, 8, 1, 2};
        bubbleSort(arr);
        Main obj = new Main();
        obj.printArray(arr);
    }
    static void bubbleSort(int[]arr){
        int n=arr.length;
        //for n-1 iterations
        for(int i=0; i<n-1; i++){
            boolean flag= false;
            //out second loop will run only till 1 less than outer loop i because last item will already at its location
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //swap arr[j], arr[j+1]
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag) return;
        }
    }
}
