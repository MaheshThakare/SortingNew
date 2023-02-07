public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[]arr= {1, 2, 2};
        printArray(arr);
    }
    public static void printArray(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}