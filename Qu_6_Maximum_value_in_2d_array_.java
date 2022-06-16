import java.util.*;
public class Qu_6_Maximum_value_in_2d_array_{
	public static void main(String[]args){
		int[][]array={
			{3,5,6},
			{34,56,7},
			{67,89,45}
		};
		int target=89;
		int ans=maximum(array);
		System.out.println(ans);
		
	}
	static int maximum(int[][]arr){
		int max= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]>max)
					max= arr[i][j];
				
			}
		}
		return max;
		
	}
}