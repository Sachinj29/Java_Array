//Filling an Array by Using the fill() Method




import java.util.Arrays;  
public class ArrayFill {  
    public static void main(String[] args) {  
        int[] arr = new int[5];  
        Arrays.fill(arr, 10);
        System.out.println("Filled Array: " + Arrays.toString(arr));  
    }  
}  