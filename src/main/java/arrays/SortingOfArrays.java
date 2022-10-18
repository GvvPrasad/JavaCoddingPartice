package arrays;

public class SortingOfArrays {
	public static void main(String[] args) {
		int arr[]= {40, 20, 5, 10, 7, 100, 1};
		int size = arr.length;
		
		System.out.println("The Length of the array is: " + size);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.print("Sorted array is: ");
		for (int i = 0; i < size; i++) {   
			System.out.print(arr[i] + " ");  
	    }  
	}
}
