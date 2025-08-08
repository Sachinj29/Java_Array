
/*In Java, the Arrays class is a utility class that is a member of the Java collection framework. It belongs to java.util package. The class provides various static methods for manipulating arrays efficiently. It simplifies common operations (like searching, sorting, copying and comparison) on the arrays. */

// Sort Array using sort() methode :


import java.util.Arrays;  
public class ArraySort {  
    public static void main(String[] args) {  
        int numbers[] = {5, 2, 8, 1, 3};         
        Arrays.sort(numbers);         
        System.out.println("Sorted Array: " + Arrays.toString(numbers));  
    }  
}  
