import java.io.*; 
  
class Zeroes_move 
{ 
   
    static void moveZerosToEnd(int arr[], int n) 
    { 
        int count = 0;  
  
       
        for (int i = 0; i < n; i++) 
            if (arr[i] != 0) 
                arr[count++] = arr[i]; 
        while (count < n) 
            arr[count++] = 0; 
    } 
  
    public static void main (String[] args) 
    { 
        int arr[] = {1, 88, 8, 34, 0, 0, 32, 57, 0, 16, 0, 79,99}; 
        int n = arr.length; 
        moveZerosToEnd(arr, n); 
        System.out.println("Array after moving zero at end: "); 
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
    }}
