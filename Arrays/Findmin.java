public class Findmin {
    public static void main(String args[]) {
        int[] arr = { 18, 46, 76, 93, 23,2 };
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}