import java.util.*;
public class Array2{

  public static void main(String args[]){

    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Size of Array :");
    int a = Sc.nextInt();
    int arr[] = new int[a];
   

    System.out.println("Enter the Element of Arary:");
    for(int i=0;i<a;i++){
       arr[i] = Sc.nextInt();
    }

    System.out.println("Element of Array :");
    for(int i=0;i<a;i++){
      System.out.println(arr[i]);
    }
    
    Sc.close();
  }
}