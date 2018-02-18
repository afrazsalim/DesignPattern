
public class PowerPoint implements Application {

	
	
	@Override
	public Form operation() {
		return new Slides(this);
	}

	
	

}
