
public class DataBaseSingleton {
	
	private static DataBaseSingleton instance = new DataBaseSingleton();
	
	private DataBaseSingleton() {
		
	}

	public static DataBaseSingleton getInstace() {
		return instance;
	}
	
	public String getData() {
      String message = "I got no data";
		return message;
	}
	
	
}
