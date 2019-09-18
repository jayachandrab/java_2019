package module3.assignment4.StringHandling;

/**
 * Given an array of Strings, convert each string of the array into 
 * lower case String and then return the array. 
 * 
 * Input : {"Hello", "Hi"}
 * Output : {"hello", "hi"}
 * 
 * @author Siva Sankar
 */

public class StringHandling {

    /**
     * This method returns the array of lower case strings.
     * @param arr, the input array.
     * @return the array of lower case Strings based on the input parameter.
     */
    public static String[] lower(String[] arr) {
        //  your code goes here....
        String words[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String temp=arr[i];

            String re="";


                for(int j=0;j<temp.length();j++){
                    char c=temp.charAt(j);
                   c=Character.toLowerCase(c);
                    re=re+c;
                }

            words[i]=re;
        }
        return words;
    }
}