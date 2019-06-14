package PraticeProgram;

public class duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {4,5,6,7,8,9,10,11,12};
		
		int arr2[] = {2,3,4,5,6,12,22,15,16};
		
		for(int i=0;i<arr1.length;i++){
			
			for(int j=0;j<arr2.length;j++){
				
				if(arr1[i]==arr2[j]){
					
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
