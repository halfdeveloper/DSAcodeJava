import java.util.*;
class Quick_Sort{
	public static void main(String[]args)
	{
		int nums[] = {5,4,3,2,1};
		 sort(nums,0,nums.length-1);
		System.out.println(Arrays.toString(nums));
	}
	static void sort(int nums[],int low,int hi)
	{
		if(low >= hi)
			return;
		int s=low;
		int e=hi;
		int m=s + (e-s)/2;
		int pivot= nums[m];
		while(s <=e)
		{
			while(nums[s]<pivot)
			{
				s++;
			}
			while(nums[e]>pivot){
				e--;
			}
			if(s<=e)
			{
				int t = nums[s];
				nums[s]= nums[e];
				nums[e] = t;
				s++;
				e--;
			}
		}
		sort(nums,low,e);
		sort(nums,s,hi);
	}
}