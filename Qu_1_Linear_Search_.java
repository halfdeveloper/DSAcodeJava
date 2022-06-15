//This is linear search in java 
public class Qu_1_Linear_Search_{
	public static void main(String[]args){
		int nums[]={34,2,4,-4,45,35,89,99};
		int target=99;
		boolean ans=LinearSearch3(nums,target);
		System.out.println(ans);
	}
	/*static int LinearSearch(int []array , int target){
		//if array length is 0 so In array there is no element .~!! 
		if(array.length==0){
		return -1;
		}
		for(int index=0;index<array.length;index++){
			int element = array[index];
			if(element==target){
				return index;
			}
		}
		//If element is not found in the array so we return the index -1 which is not exits!!
        return -1;
	
	//If  we want to return the element of the array...
	static int LinearSearch1(int []array , int target){
		//if array length is 0 so In array there is no element .~!! 
		if(array.length==0){
		return -1;
		}
		for(int element:array){
			if(element==target){
				return element;
			}
		}
		//If element is not found in the array so we return the index -1 which is not exits!!
        return -1;
	}*/
	//If we want to return the true or false..
	static boolean  LinearSearch3(int []array , int target){
		//if array length is 0 so In array there is no element .~!! 
		if(array.length==0){
		return false;
		}
		for(int index=0;index<array.length;index++){
			int element = array[index];
			if(element==target){
				return true;
			}
		}
		//If element is not found in the array so we return the index -1 which is not exits!!
        return false;
	}
}
