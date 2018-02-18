
public class Dog extends Animal{

	private Sounds sound;
	public Dog(Sounds sound) {
		this.sound = sound;
	}
	@Override
	protected void bark() {
      sound.bark();
	}

}
