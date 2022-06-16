import java.util.*;
public class Qu_5_Search_in_2d_Array_{
	public static void main(String[]args){
		int[][]array={
			{3,5,6},
			{34,56,7},
			{67,89,45}
		};
		int target=89;
		int []ans=search(array,target);
		System.out.println(Arrays.toString(ans));
		
	}
	static int[] search(int[][]arr,int target){
		int max= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]==target)
					return new int[]{i,j};
				
			}
		}
		return new int[]{-1,-1};
		
	}
}