package prevTCS;
/**
 * Airport security officials have confiscated several item of the passengers at the security check point. All the items have been dumped into a huge box (array). Each item possesses a certain amount of risk[0,1,2]. Here, the risk severity of the items represent an array[] of N number of integer values. The task here is to sort the items based on their levels of risk in the array. The risk values range from 0 to 2.

Example :
Input :
7  -> Value of N
[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.

Output :
0 0 0 1 1 2 2  -> Element after sorting based on risk severity 

Example 2:
input : 10  -> Value of N 
[2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1], while input each element is separated by a new line.

Output : 
0 0 0 0 1 1 1 2 2 2  ->Elements after sorting based on risk severity.

 */

import java.util.*;
public class SecurityCheckTCS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
