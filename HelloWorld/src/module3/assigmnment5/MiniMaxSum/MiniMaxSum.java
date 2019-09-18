package module3.assigmnment5.MiniMaxSum;

/**
 * Given an array of elements, return the String that has two values separated
 * by commans. The first value is the sum of all the elements except minimum
 * and the second value is the sum of all the elements except the maximum.
 * 
 * Input : {1,2,3,4,5};
 * Output : 14,10
 * 
 * Input : {1,2}
 * Output : 2,1
 * 
 * @author jayachandra
 */

public class MiniMaxSum {

    /**
     * This method returns the minimum element in the array.
     * @param arr, contains the elements in arr.
     * @return the minimum element in the arr. If there are no elements, then
     * it should return -1.
     */

    public static int min(int[] arr) {
        //  Your code goes here...
        int temp=0;

        if(arr.length>0){
            temp=arr[0];
            for(int i=1;i<arr.length;i++){

                if(temp>arr[i]){
                    temp=arr[i];
                }
            }
        }

        return temp;
    }

    /**
     * This method returns the maximum element in the array.
     * @param arr, contains the elements in arr.
     * @return the maximum element in the arr. If there are no elements, then
     * it should return -1.
     */
    public static int max(int[] arr) {
        //  Your code goes here...


        int temp=0;
        if(arr.length>0){
            temp=arr[0];
            for(int i=1;i<arr.length;i++){

                if(temp<arr[i]){
                    temp=arr[i];
                }
            }
        }
        return temp;
    }

    /**
     * This method returns the sum of all the elements in the array.
     * @param arr, contains the elements in arr.
     * @return the sum of all the elements in the arr. returns -1 if there are
     * no elements.
     */
    public static int sum(int[] arr) {
        //  Your code goes here...
        
        return -1;
    }
    
    /**
     * Make use of the functions defined for finding the 
     * minimum element, maximum element and the sum of all the elements of teh 
     * array arr.
     * 
     * @param arr, the input array.
     * @return the string version of maxSum and minSum separated by commas.
     */
    public static String miniMaxSum(int[] arr) {
        //  Your code goes here...
        int mini=min(arr);
        int maxi=max(arr);
        int c=0;

        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++){


                sum1=sum1+arr[i];



                sum2=sum2+arr[i];

        }
        sum1=sum1-mini;
        sum2=sum2-maxi;
        return ""+sum1+","+sum2;
    }
}