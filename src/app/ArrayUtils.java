package app;

public class ArrayUtils {
    static int binarySearch(int[] sortedArray, int valueToFind) {
        if (sortedArray.length == 0) return -1;

        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sortedArray[mid] == valueToFind) {
                return mid;
            }
            if (sortedArray[mid] > valueToFind) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;
    }

    public static int[] mergeSort(int[] elements, int low,
                                   int high) {

        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(elements, low, mid);
            mergeSort(elements, mid + 1, high);
            merge(elements, low, mid, high);
        }
        return elements;
    }
    private static void merge(int[] subset, int low,
                              int mid, int high) {

        int n = high - low + 1;
        int[] temp = new int[n];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid || j <= high) {
            if (i > mid)
                temp[k++] = subset[j++];
            else if (j > high)
                temp[k++] = subset[i++];
            else if (subset[i] < subset[j])
                temp[k++] = subset[i++];
            else
                temp[k++] = subset[j++];
        }
        for (j = 0; j < n; j++)
            subset[low + j] = temp[j];
    }
}
