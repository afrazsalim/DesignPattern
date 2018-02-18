import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Manager {
	
	private ArrayList <Employes> emp = new ArrayList<>();
	
	private String state;
	
	
	protected void attachEmploye(Employes employee) {
		this.emp.add(employee);
	}
	
	
	protected void detachEmploye(Employes emp) {
		try {
			this.emp.remove(emp);
		} catch (NoSuchElementException ex) {
			System.out.println("No such element found in list");
		}
	}
	
	
	
	protected String getState() {
		return this.state;
	}
	
	protected void setState(String state) {
		this.state =state;
		this.notifyAllObserver();
	}


	private void notifyAllObserver() {
	  for(Employes e :emp) {
		  e.update();
	  }
	}
	
}
