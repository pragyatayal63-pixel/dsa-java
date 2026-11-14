
public class SearchInRange {
    public static void main(String args[]) {

        int[] arr = {1, 3, 56, 78, 23};
        int target = 78;

        int ans = search(arr, target, 1, 3);

        System.out.println("Index of target: " + ans);
    }

    static int search(int[] arr, int target, int start, int end) {

        for (int i = start; i <= end; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
