
public class puppy {

	 public puppy( ){
		 System.out.println("Hi defult puppy");
	 }
	 public puppy(String name){
		 System.out.println("Hi"+name);
	 }
	 public static void main(String[] args) {
		 puppy mypuppy = new puppy("tommy");
		 puppy mypuppy2 = new puppy( );
		
	}
}
