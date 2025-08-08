//Copying an Array by Using the copyOf() Method



import java.util.Arrays;  
public class ArrayCopyOf{  
    public static void main(String[] args) {  
        int[] original = {1, 2, 3, 4, 5};  
        int[] copied = Arrays.copyOf(original, 3);  
        System.out.println("Copied Array: " + Arrays.toString(copied));  
    }  
}