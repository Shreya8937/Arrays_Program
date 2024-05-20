import java.util.Arrays;
 class Second_Largest {
   public static void main(String args[]){
      int array[] = {10, 20, 25, 73, 36, 17};
      int size = array.length;
      Arrays.sort(array);
      System.out.println("sorted Array ::"+Arrays.toString());
      int res = array[size-2];
      System.out.println("2nd largest element is ::"+res);
   }
}