public class MergeSort {

    static void merge(int[] arr, int start, int mid, int end) {
        int[] ans = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                ans[k++] = arr[i++];
            } else {
                ans[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            ans[k++] = arr[i++];
        }

        while (j <= end) {
            ans[k++] = arr[j++];
        }

        for (i = start, k = 0; i <= end; i++, k++) {
            arr[i] = ans[k];
        }
    }

    static void mergeSort(int arr[], int start, int end) {
        if (start >= end)
            return;

        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int[] arr = { 60, 50, 40, 30, 20, 10 };
        int size = arr.length;

        System.out.println("Before Sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        mergeSort(arr, 0, size - 1);

        System.out.println("After Sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
