import java.util.*;
public class BinarySearch{
    static int binarySearch(int arr[], int n, int key) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int n = in.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the element we want to find:");
        int key = in.nextInt();

        int result = binarySearch(arr, n, key);

        if (result != -1) {
            System.out.println("The element is found at index: " + result);
        } else {
            System.out.println("Element not found!!");
        }

        in.close();
    }
}
