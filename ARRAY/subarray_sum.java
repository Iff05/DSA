// BRUTE FORCE
//public class subarray_sum{
//     public static void Arrays(int numbers[]){
//         int currSum =0;
//         int maxSum = Integer.MIN_VALUE;
    
//     for(int i=0;i<numbers.length;i++){
//         int start=i;
//         for(int j=i;j<numbers.length;j++){
//             int end=j;
//             currSum= 0;
//             for(int k=start;k<=end;k++){
//                 currSum += numbers[k];
//             }
//             System.out.println(currSum);
//             if(maxSum < currSum){
//                 maxSum = currSum;
//             }

//         }
//         }
//         System.out.println("max sum =" +maxSum);
//     }

//     public static void main(String args[]){
//         int numbers[]={1,-2,6,-1,3};
//         Arrays(numbers);
//     }
// }

//PREFIX ARRAY

// public class subarray_sum{
//     public static void Arrays(int numbers[]){
//         int currSum =0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];
//         //calculate prefix array
//         for (int i=1;i<prefix.length;i++){
//             prefix[i] = prefix[i-1] + numbers[i];
//         }

//     for(int i=0;i<numbers.length;i++){
//         int start=i;
//         for(int j=i;j<numbers.length;j++){
//             int end=j;

//             currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
            
//             if(maxSum < currSum){
//                 maxSum = currSum;
//             }

//         }
//         }
//         System.out.println("max sum =" +maxSum);
//     }

//     public static void main(String args[]){
//         int numbers[]={1,-2,6,-1,3};
//         Arrays(numbers);
//     }
// }

//Kandanes

public class subarray_sum{
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs  = 0;

        for(int i=0 ;i<numbers.length;i++){
            cs = cs+numbers[i];
            if(cs < 0 ){
                cs = 0;
            }
            ms= Math.max(cs,ms);
        }
        System.out.println("our max sum is:"+ms);

    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        kadanes(numbers);
    }
}