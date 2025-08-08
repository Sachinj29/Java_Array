import java.util.*;

public class Array2DU{
  public static void main(String args[]){

    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the No. of Rows:");
    int r = Sc.nextInt();
    System.out.println("Enter the No. of Columns:");
    int c = Sc.nextInt();

    int arr[][] = new int[r][c];

    System.out.println("Enter the Element :");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        arr[i][j] = Sc.nextInt();
      }
    }

    System.out.println("Element of Array :");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
         System.out.print(arr[i][j] + "\t");
      }
        System.out.println();
    }

    Sc.close();

  }
}