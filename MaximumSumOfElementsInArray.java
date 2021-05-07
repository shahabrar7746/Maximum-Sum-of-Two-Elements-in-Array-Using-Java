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
		//And s_min will contain element with second maximum value 
		
int max = 0;
int s_min = 0;
for(int i = 0;i<array.length;i++) {
	if(max < array[i]) {
		s_min = max;
		max = array[i];
	}
}
System.out.println("Maximum Sum of Elements in Array is " + max + s_min);
System.out.println("And the Element Giving Maximum Sum is " + max + " " + s_min);
	}

}
