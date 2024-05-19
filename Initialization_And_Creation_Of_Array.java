public class Initialization_And_Creation_Of_Array {
	
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5};
	        System.out.print("Array created with elements: [");
	        for (int i = 0; i < array.length; i++) {
	            if (i < array.length - 1)
	                System.out.print(array[i] + ", ");
	            else
	                System.out.print(array[i]);
	        }
	        System.out.println("]");
	    }
	}



