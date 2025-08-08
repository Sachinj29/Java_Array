//Comparing Two-Dimensional Arrays by Using the deepEquals() Method

import java.util.Arrays;  
public class ArrayComp2D {  
   public static void main(String[] args) {  
       int[][] numbers = {{4, 8, 0}, {9, 5, 1}, {7, 2, 6}};  
       int[][] numbersCopy = Arrays.copyOf(numbers, numbers.length);  
       System.out.println("Are the given arrays equal to each other?");  
       System.out.println(Arrays.deepEquals(numbers, numbersCopy));  
       System.out.println(Arrays.deepToString(numbersCopy));  
   }  
}  