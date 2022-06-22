
public class Qu_7_Binary_Search_{
	public static void main(String ss[]){
		int []arr= {1,3,4,5,6,7,8,9,13,14,17,33};
		int target= 14;
		int ans=BS(arr,target);
		System.out.println(ans);
		
	}
	static int BS(int arr[],int target){
		int start=0;
		int end=arr.length-1;
		while(start<=end){
			int mid=start+(end-start)/2;
			//if(arr[mid]==target){
				//return mid;
			//
			if(target< arr[mid])
			{
				end=mid-1;
			}
			else if(target>arr[mid])
			{
				start=mid+1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	
}