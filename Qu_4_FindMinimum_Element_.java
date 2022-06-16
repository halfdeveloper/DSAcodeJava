public class Qu_4_FindMinimum_Element_{
	public static void main(String []args){
		int nums[]={34,2,4,-4,45,35,89,99};
		int ans=Minimum(nums);
		System.out.println(ans);
	}
	static int Minimum(int []array){
		int min=array[0];
		for(int i=0;i<array.length;i++){
			if(array[i]<min){
				min=array[i];
				
			}
		}
		return min;
	}
}