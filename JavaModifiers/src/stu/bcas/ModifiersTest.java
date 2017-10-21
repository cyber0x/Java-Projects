package stu.bcas;

public class ModifiersTest {
	
	public String release = "2";
	private String version = "1.5.1";
	protected String relYear = "2010";
	
	public static void main(String[] args) {
		ModifiersTest mt = new ModifiersTest();
		mt.release = "7";//public
	    mt.version = "7";//private
	    mt.relYear = "2015";//protected
		
	}

}
