
public class Machine {
//	If i make it name private this will not be available to car 
//	private = only accesible within the class
// 	 private String name = "Machine type1";

//	Protected means this is accessible within the package we're working in and any child can use it
	 protected String name = "Machine type1";
	

	public void start(){
		System.out.println("Machine started");
	}
	public void stop(){
		System.out.println("Machine stopped");
	}
}
