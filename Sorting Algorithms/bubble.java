public class bubble {
    public static int bubbleSort(int arr[]){ // Changed return type to int
        int Totalswaps = 0;
        boolean swapped;
        for(int  turn = 0 ; turn<arr.length-1;turn++){
           swapped = false;
            for (int j=0;j<arr.length-1-turn;j++){
                if(arr[j]> arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    Totalswaps++;
                    swapped = true;
                }
                
            }
            if(!swapped) break;
        }
        return Totalswaps;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" "); // Added a space for better readability
        }
        System.out.println();
    }
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5};
        int swapsDone = bubbleSort(arr); // Capture the returned swap count
        System.out.println("Sorted Array:");
        printArray(arr);
        System.out.println("Number of swaps: " + swapsDone); // Correctly print the total swaps
    }
    
}
