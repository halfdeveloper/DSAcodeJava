public class Qu_8_Agnostic_order_BS_{
	public static void main(String[]args){
		//int []arr= {1,3,4,5,6,7,8,9,13,14,17,33};
		int []arr= {33,21,20,16,15,12,11,7,3,2,1};
		int target=33;
		int ans=BS(arr,target);
		System.out.println(ans);
	}
	static int BS(int arr[],int target){
		int start=0;
		int end=arr.length-1;
		boolean isAsc=arr[start]<arr[end];
		while(start<=end){
			int mid = start + (end-start)/2;
			if(arr[mid]==target)
				return mid;
			if(isAsc){
				if(target<arr[mid]){
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
			else{
				if(target<arr[mid]){start=mid+1;}
				else{end=mid-1;}
			}
		}
		return -1;
	}
}