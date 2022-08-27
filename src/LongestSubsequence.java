import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestSubsequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of array elements");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter " + n + " array elements:");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		List<Integer> increasingSubSequence = largestIncreasingSubSequence(arr);
		
		System.out.println();
		System.out.println("lenngth of largest increasing subsequnce is: "+increasingSubSequence.size());
		System.out.println();
		System.out.println("largest increasing subsequence is: ");
		for(Integer num : increasingSubSequence){
				System.out.print(num+" ");
		}
	}
	
	static List<Integer> largestIncreasingSubSequence(int[] arr) {
		
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length-1;i++) {
			
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(arr[i]);
			
			for(int j=i+1;j<arr.length;j++) {
				if(temp.get(temp.size()-1)<arr[j]){
					temp.add(arr[j]);
				}
			}
			
			if(result.size()<temp.size())
				result=temp;
		}
		
		return result;
		
	}
}
