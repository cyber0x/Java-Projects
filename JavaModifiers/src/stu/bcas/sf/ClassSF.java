package stu.bcas.sf;

public class ClassSF {
	int num = 100;
	static int staticNum = 100;
	final int myfinal = 20;
	
	public void myMethod(){
		System.out.println(num);
	}
	public void myStaticMethod(){
		System.out.println(num);
	}
	public void changeValue(){
		myfinal = 30;
		num = 20;
	}
	public static void main(String[] args) {
		
	}


}
