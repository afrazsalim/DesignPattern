
public class Main {
   
	public static void main(String [] args) {
		Manager m = new Manager();
		
		Employes l = new Labour(m);
		m.attachEmploye(l);
		Employes meh = new Mechanic(m);
		m.attachEmploye(meh);
		//Labour o = new Labour();
		m.setState("Break yippie ");
		System.out.println(m.getState());
		m.setState("Back to work");
		System.out.println(l.getState());
	}
	
	
}
