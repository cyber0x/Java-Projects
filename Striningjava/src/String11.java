
public class String11 {
	
	public static void main(String[] args) {
		
		String str = "BCAS";
		String str1 = "BCAS CAMPUS JAFFNA   ";
		
		System.out.println(str.charAt(3));
		
		System.out.println(str1.compareTo(str));
		
		System.out.println(str.compareToIgnoreCase(str1));
		
		System.out.println(str1.concat(str));
		
		System.out.println(str.contentEquals(str1));
		
		System.out.println("********01********");
		
		char charArray [] = {'a','e','i','o','u'};
		
		System.out.println(str.copyValueOf(charArray));
		System.out.println(str.copyValueOf(charArray,3,2));
		System.out.println(str);
		
		System.out.println("*********02********");
		System.out.println(str.endsWith(str));
		
		System.out.println("**********03*******");
		System.out.println(str.equals(str1));
		
		System.out.println("***********04******");
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println("********05*********");
		System.out.println(str.endsWith(str));
	    
		System.out.println("********06*********");
		System.out.println(str.getBytes());
		
		System.out.println("********07*********");
		System.out.println(str.intern());
		
		System.out.println("********08*******");
		System.out.println(str.lastIndexOf(str));
		
		System.out.println("**********09*******");
		System.out.println(str1.indexOf(str));
		
		System.out.println("***********10****");
		System.out.println(str1.length());
		
		System.out.println("********11*********");
		System.out.println(str.matches(str1));
		
		System.out.println("********11*********");
		System.out.println(str.matches(str1));
		
	}

}
