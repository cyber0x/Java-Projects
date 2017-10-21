package bcas.inhe2;

public class Dog extends Animal {
	public Dog(){
		System.out.println("A new Dog has been created");
	}
    @Override
    public void sleep(){
    	System.out.println("A Dog sleeps...");
    }
    @Override
    public void eat(){
    	System.out.println("A Dog eat...");
    }
    
}