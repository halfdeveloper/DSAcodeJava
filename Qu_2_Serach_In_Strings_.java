public class Qu_2_Serach_In_Strings_{
	public static void main(String[]args){
		String name = "Deepak kumar";
		System.out.print(name.toCharArray());
		char target = 'e';
		System.out.println(Search(name,target));
		
	}
	/*static boolean Search(String str,char target){
		if(str.length()==0){
			return false;
		}
		for(int index=0;index<str.length();index++){
			if(target == str.charAt(index)){
				return true;
			}
		}
		return false;
	}*/
	static boolean Search(String str,char target){
		if(str.length()==0){
			return false;
		}
		for(char ch:str.toCharArray()){
			if(ch == target){
				return true;
			}
		}
		return false;
	}
}