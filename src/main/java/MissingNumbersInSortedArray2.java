import java.util.Arrays;

public class MissingNumbersInSortedArray2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 10};

        System.out.print("Original array: ");
        System.out.println(Arrays.toString(arr));

        // Find range
        int start = arr[0];
        int end = arr[arr.length - 1];

        // Temporary array to hold all numbers
        int[] fullArray = new int[end - start + 1];
        int index = 0;

        // Fill full array with all numbers between start and end
        for (int i = start; i <= end; i++) {
            fullArray[index++] = i;
        }

        System.out.print("All numbers (with missing ones added): ");
        System.out.println(Arrays.toString(fullArray));

        // Print missing numbers only
        System.out.print("Missing numbers: ");
        for (int i = 0; i < fullArray.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (fullArray[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(fullArray[i] + " ");
            }
        }
    }

}
