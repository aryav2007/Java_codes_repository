package array_question;
public class Array_code {
	public static void main(String[] args) {
		
		// hard codes array code;
		
		
		int arr[] = new int [6];
		// for finding array length 
		System.out.println(arr.length);
		
		arr[0]=44;
		arr[1]=345654;
		arr[2]=443;
		arr[3]=4435;
		arr[4]=4436;
		arr[5]=4431;
		/*System.out.print(arr[0]+" ");
		System.out.print(arr[1]+" ");
	    System.out.print(arr[2]+" ");
	    System.out.print(arr[3]+" ");
	    System.out.print(arr[4]+" ");
	    System.out.print(arr[5]+" ");*/
	    
	    for(int index=0;index<arr.length;index++) {
	    	   System.out.print(arr[index]+" ");
	    }
		//int arrInt[] = {228, 587, 564};
		//System.out.println(arrInt[1]);
	}
}
