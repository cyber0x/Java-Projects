
public class Puppy1 {
	
	int puppy1Age;
	
	public Puppy1(String name) {
		System.out.println("Name chosen is :"+ name);
	}
	public void setAge(int age){
		puppy1Age = age;
	}
	public int getAge(){
		System.out.println("Puppy1's age is :" + puppy1Age);
		return puppy1Age;
	}
	public static void main(String[] args) {
		Puppy1  myPuppy1 = new Puppy1 ( "tommy" );
		myPuppy1.setAge( 2 );
		myPuppy1.getAge(   );
		System.out.println("variable value :" + myPuppy1.puppy1Age);
	}
	

}
