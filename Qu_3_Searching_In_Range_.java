public class Qu_3_Searching_In_Range_{
	public static void main(String []args){
		int nums[]={34,2,4,-4,45,35,89,99};
		int target =45;
		System.out.println(InRange(nums,target,2,4));
	}
	static int InRange(int []array,int target,int start,int end){
		if(array.length==0){
			return -1;
		}
		for(int index=start;index<=end;index++){
			int element=array[index];
			if(element==target){
				return index;
			}
		}
		return -1;
	}
}