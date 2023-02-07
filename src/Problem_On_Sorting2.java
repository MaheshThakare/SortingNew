//Given an array with fruits names you ara supposed to sort lexicographical order using selection sort
public class Problem_On_Sorting2 {
    public static void main(String[] args) {
        String [] arr = {"papaya", "line", "watermelon", "mango", "kivi", "apple"};
        sortString(arr);
        for(String i : arr){
            System.out.print(i + " ");
        }
    }
    static void sortString(String[]arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min_index= i;
            for(int j=i+1; j<n; j++){
                if(arr[j].compareTo(arr[min_index]) < 0){
                    min_index=j;
                }
            }
            String temp = arr[i];
            arr[i]= arr[min_index];
            arr[min_index]=temp;
        }
    }
}
