public class SearchIn2D {
    public static void main(String args[]) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };

        int target = 8;
        Search(arr, target);
    }

    static void Search(int arr[][], int target) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Element found at Row: " + i + ", Column: " + j);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}