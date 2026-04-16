package string_codes;

public class StringBufferandBuilder {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Aman");
		StringBuilder str1=new StringBuilder("Aman");
		//System.out.println(str);
		str.append("kumar");
		//.out.println(str);
		str.insert(4,"CSE");
		//System.out.println(str);
		str.replace(4, 7, "cse");
		//System.out.println(str);
		str.delete(4, 7);
		//System.out.println(str);
		StringBuffer sb=new StringBuffer("Hey");
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		
		 
		
		
		
		
		
	}
}
