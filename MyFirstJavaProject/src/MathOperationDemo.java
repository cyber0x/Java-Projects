
public class MathOperationDemo {
	public static void main(String[] args) {
		double num1 = 12.25;
		double num2 = 25.65;
		
		double result = Math.max(num1,num2);
		System.out.println(" maximum is "+ result );
		
		result = Math.min(num1,num2);
		System.out.println(" minimum is "+ result );
		
		System.out.println("Floor value of" + num2 +"is"+ Math.floor(num2));
		System.out.println("Floor value of" + num2 +"is"+ Math.ceil(num2));
		
		System.out.println("Cos value of" +45+"is"+ Math.cos(45.0));
	}

}
