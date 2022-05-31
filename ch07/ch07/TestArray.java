package ch07;

import java.util.Scanner;
public class TestArray {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Task 1 Initializing arrays with user input
		//Let user enter the array length
		System.out.println("Enter array length: ");
		int length = input.nextInt();
		int [] myArray = new int[length];
		
		// Check the array length
		System.out.println(myArray.length);
		
		for(int i = 0; i < myArray.length; i++){
			//System.out.println("Enter a double number: ");
			//myArray[i] = input.nextDouble();
			myArray[i] = (int)(Math.random()*10);
		}
		
		System.out.print("[");
		// Print array's element
		int sum = 0;
		for(int i = 0; i < myArray.length; i++){
			if (i < myArray.length -1){
				System.out.print(myArray[i] + ", ");
		}
			else{
				System.out.print(myArray[i]);
			}
			sum = sum + myArray[i];
			
		}
		double avg = (double)sum / (double)length;
		System.out.print("]");
		System.out.println("\nSum of all elements: " + sum + " Average: " + avg);
		
		
		int high = 0;
		for(int i=0; i<myArray.length; i++){
			if (myArray[i] > high){
				high = myArray[i];
				
			}						
		}
		
		System.out.println("Highest number: " + high);
		
		
	}

}
