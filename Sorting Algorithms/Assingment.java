import java.util.*;

public class Assingment {
    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void insertion(int arr[]){
    for(int i=1;i<arr.length;i++){
        int curr =arr[i];
        int prev=i-1;
        while(prev >=0 && arr[prev] <curr){
            arr[prev+1] = arr[prev];
            prev --;
        }
        arr[prev+1] = curr;
    }
    }
    public static void counting(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
public static void countingSort(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        largest = Math.max(largest, arr[i]);
    }
    int count[] = new int[largest + 1];

    // count occurrences
    for (int i = 0; i < arr.length; i++) {
        count[arr[i]]++;
    }

    // sorting in descending order
    int j = 0;
    for (int i = count.length - 1; i >= 0; i--) {  // start from largest
        while (count[i] > 0) {
            arr[j] = i;
            j++;
            count[i]--;
        }
    }
}



    public static void main(String args[]) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        countingSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}

