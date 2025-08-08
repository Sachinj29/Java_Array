
public class Array2D{

  public static void main(String args[]){

    int arr[][] = {{10,20},{30,40}};
    System.out.println(arr[1][1]);
//  Pint Array Using Lop :
    System.out.println("Array Element:");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
        System.out.println(arr[i][j]);
      }
    }
  }
}