public class Duplicate_Ele {

	public static void main(String[] args) {
	int arr[]= {3,3,5,7,8,9,12};
	int a=arr[0];
	for(int i = 0;i<=arr.length-1;i++) {
		if(i== a)
			System.out.println("Duplicate " +i);
	}
	}

}
