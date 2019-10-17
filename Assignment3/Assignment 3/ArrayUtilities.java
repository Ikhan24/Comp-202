import java.util.Random;
public class ArrayUtilities{
  
  public static boolean linearSearch(int[] array, int target) {
    boolean F= false;  
    for (int x=0; x<array.length; x++)    
      if (array[x]== target) {
      F = true;
    }
    return F;
  } 
  
  public static boolean binarySearch(int[] array, int target) {
    boolean F= false;
        int left = 0;
    int right = array.length-1;
    while (F != true && left != right + 1 ) {
      int middle = (left + right)/2;
      if (array[middle] == target) {
        F = true;
      }
      else if (array[middle] <= target) {
        left = middle + 1;
      }
      else {
        right = middle - 1;        
         }
    }      
    return F;
  }
  
  public static int[] copy(int[] array) {
    int[] A = new int[array.length];  
    for (int y=0; y<array.length; y++)
      A[y] = array[y];
    return A;
  }
  
  public static void sort(int[] array) {
      for (int x=0; x<array.length; x++)
      for (int y=x+1; y<array.length; y++) 
      if (array[x] > array[y]) {
      int newOne = array[y];      
      array[y] = array[x];
      array[x] = newOne;      
    }
  }  
  public static int[] generateRandom(int n) {
    Random r = new Random(1);
    int ArandNumb = r.nextInt(Integer.MAX_VALUE);
        int[] A = new int[n];
    for (int x=0; x<A.length; x++)
      A[x] = ArandNumb;
     return A;
  }  
}