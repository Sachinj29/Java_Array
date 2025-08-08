//Searching an Array by Using the binarySearch() Method

import java.util.Arrays;  
public class ArrayBinarySearch {  
    public static void main(String[] args) {  
        int[] numbers = {1, 3, 5, 7, 9};  
        int index = Arrays.binarySearch(numbers, 5);  
        System.out.println("Index of 5 is: " + index);  
    }  
}  