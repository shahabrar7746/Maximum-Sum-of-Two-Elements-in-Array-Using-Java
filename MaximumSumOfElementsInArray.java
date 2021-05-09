package Arrays;
import java.util.*;
public class MaximumSumOfElementsInArray {

	public static void main(String[] args) {
		//Logic : Two most maximum number in array will decide the maximum Sum of array
		Scanner s = new Scanner(System.in);
		System.out.println("Give length for array");
		//This variable will define length for array 
		int n = s.nextInt();
		int array[] = new int[n];
		System.out.println("Give values to array");
		for(int i = 0;i<array.length;i++) {
			array[i] = s.nextInt();
		}
		
		//max variable will contain element with maximum value
boolean verify = true;
//This will loop varify if there is any repetitive values is there
		for(int i = 0;i<array.length;i++) {
			for(int j = i+1;j<array.length;j++) {
				if(array[i] == array[j]) {
					verify = false;
				}
			}
		}
		if(verify) {
int max = 0;
int s_min = 0;
int temp = 0;
//This method will be used to sort array in ascending order using array class			
Arrays.sort(array);

max = array[array.length - 1];
s_min = array[array.length - 2];


System.out.println("Maximum Sum of Elements in Array is " + max + s_min);
System.out.println("And the Element Giving Maximum Sum is " + max + " " + s_min);
	}else {
		System.out.println("Array Contains Repeatetive values Hence Maximum sum cannot be calculated");
	}
	}
}

	
