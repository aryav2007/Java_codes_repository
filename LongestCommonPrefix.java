package string_codes;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		//longest common prifex substring 
		String arr[]= {"flower","flow","flight"};
		Arrays.sort(arr);
		String first=arr[0];
		String last=arr[arr.length-1];
		
		int minLength=Math.min(first.length(), last.length());
		//String res="";
		
		int count=0;
		
		for(int i=0;i<minLength;i++) {
			if(first.charAt(i)==last.charAt(i)) {
				//res=res+first.charAt(i);
				count++;
			}
			else {
				break;
			}
		}
		System.out.println(first.substring(0,count));
		//String str="RAM JI";
		//System.out.println(str.substring(1));
		//System.out.println(str.substring(1,2));
		//System.out.println(res);
	}
}
