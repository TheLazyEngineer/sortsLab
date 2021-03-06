public class sortTests {
   public static void main(String[] args) {
      
      int[] selectArr = {4,7,2,8,1,6,9,-2,8};
      System.out.println("Selection sort:");
      Sorts.selectionSort(selectArr, selectArr.length);
      for (int i = 0; i < selectArr.length; i++) {
         System.out.println(selectArr[i]);
      }
      
      System.out.println("Merge sort:");
      int[] mergeArray = {3, 3, 4, 5, 16, 7, 1, 36, 26, 75, -1};
      Sorts.mergeSort(mergeArray, mergeArray.length);
      for (int i = 0; i < mergeArray.length; i++) {
         System.out.println(mergeArray[i]);
      }
      System.out.println("Quick sort:"); 
      int[] quickArray = {0, 1, 7, 3, -1, 166, 9, -9, 0, 56, 3, 2};
      Sorts.quickSort(quickArray, quickArray.length);
      for (int i = 0; i < quickArray.length; i++) {
    	  System.out.println(quickArray[i]);
      }
      System.out.println("Select sort size 0:"); 
      int[] selectZeroArray = {};
      Sorts.selectionSort(selectZeroArray, selectZeroArray.length);
      for (int i = 0; i < selectZeroArray.length; i++) {
        System.out.println(selectZeroArray[i]);
      }
      System.out.println("Merge sort size 0:"); 
      int[] mergeZeroArray = {};
      Sorts.mergeSort(mergeZeroArray, mergeZeroArray.length);
      for (int i = 0; i < mergeZeroArray.length; i++) {
        System.out.println(mergeZeroArray[i]);
      }
      System.out.println("Quick sort size 0:"); 
      int[] quickZeroArray = {};
      Sorts.quickSort(quickArray, quickZeroArray.length);
      for (int i = 0; i < quickZeroArray.length; i++) {
        System.out.println(quickZeroArray[i]);
      }
   }
}
