package ch07;

public class TestLinearSearch {

	public static void main(String[] args) {
		int [] testArray  = {1, 4, 4, 2, 5};
		printArray(testArray);
		
		int [] testArray2  = {6, 7, 8, 8, 10};
		printArray(testArray2);
		int result = linearSearch(testArray, 5);
		
		if (result < 0){
			System.out.println("\nNumber not found");
		}
		else{
			System.out.print("Matching: " + result);
		}
		
	}
	
	public static void printArray (int [] a){
		for(int i = 0; i < a.length; i ++){
			System.out.print(a[i] + "  ");
			
		}
		System.out.print("\n");
	}
	
	// Linear search
	// Input: an integer array and searching key
	// Return: index of the element that matches key
	public static int linearSearch(int [] a, int key){
		for(int i = 0; i < a.length; i++){
			if(key == a[i]){
				return i;
			}
		}
		return -1;
		
	}
	
	


}
