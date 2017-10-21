package stu.bcas;

public class ModifiersTest2 {
	public class ModifiersTest {
		
		public void printPublic(){
			System.out.println("This is a public method");
		}
		private void printPrivate(){
			System.out.println("This is a private method");
		}
		protected void printProtected(){
			System.out.println("This is a protected method");
		}
		public static void main(String[] args) {
			ModifiersTest mt = new ModifiersTest();
			mt.release = "7";//public
		    mt.version = "7";//private
		    mt.relYear = "2015";//protected
		}
}
