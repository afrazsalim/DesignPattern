
public class Mechanic implements Employes {

	private Manager subject;
	private String state;
	public Mechanic(Manager m) {
       this.subject = m;
	}

	@Override
	public void update() {
	    this.setState(this.subject.getState());
	}

	private void setState(String state) {
        this.state = state;		
	}

	@Override
	public Object getState() {
		return this.state;
	}
	

}
