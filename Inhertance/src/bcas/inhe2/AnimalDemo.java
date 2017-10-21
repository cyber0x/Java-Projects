package bcas.inhe2;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Bird bird = new Bird();
		Dog dog = new Dog();
		
		System.out.println();
		
		animal.sleep();
		animal.eat();
		
		 System.out.println("************************");
		 
		bird.sleep();
		bird.eat();
		
		 System.out.println("************************");
		
		dog.sleep();
		dog.eat();
		
		 System.out.println("************************");
		 
		Animal a1 = new Dog();
		Animal a2 = new Bird();
		
		a1.eat();
		a2.sleep(); 
		
		//the following statements are incorrect.
		//Dog d = new Animal();
		//Bird b = new Animal();
	}

}
