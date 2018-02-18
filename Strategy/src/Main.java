
public class Main {
	public static void main(String [] args) {
		Animal dog = new Dog(new DogSound());
		Animal cat = new Cat(new CatSound());
		dog.bark();
		cat.bark();
	}

}
