
public class Cat extends Animal {
	
	private Sounds sound;
	
	public Cat(Sounds sound) {
		this.sound = sound;
	}

	@Override
	protected void bark() {
		sound.bark();
	}

}
