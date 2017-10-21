
public class StringDemo {
	public static void main(String[] args) {
		
		String str = "BCAS";
		String str2 = "BCAS  CAMPUS JAFFNA   ";
			
	    System.out.println(str);
		System.out.println("String length :" + str.length());
		System.out.println(str.substring(2));
		System.out.println(str2.substring(2));
		
		System.out.println(str2.trim());
		System.out.println(str2.substring(5, 11));
	}

}
